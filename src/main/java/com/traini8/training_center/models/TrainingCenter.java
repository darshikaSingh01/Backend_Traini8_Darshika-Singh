package com.traini8.training_center.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "training_centers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrainingCenter {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false, length = 40)
  @NotBlank(message = "Center name is required")
  @Size(max = 40, message = "Center name must be less than 40 characters")
  private String centerName;

  @Column(nullable = false, unique = true, length = 12)
  @NotBlank(message = "Center code is required")
  @Pattern(regexp = "^[a-zA-Z0-9]{12}$", message = "Center code must be exactly 12 alphanumeric characters")
  private String centerCode;

  @Embedded
  private Address address;

  private Integer studentCapacity;

  @ElementCollection
  @CollectionTable(name = "courses_offered", joinColumns = @JoinColumn(name = "training_center_id"))
  @Column(name = "course")
  private List<String> coursesOffered;

  @Column(nullable = false, updatable = false)
  private Instant createdOn;

  @Email(message = "Invalid email format")
  private String contactEmail;

  @Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be 10 digits")
  private String contactPhone;

  @PrePersist
  public void prePersist() {
    this.createdOn = Instant.now();
  }
}
