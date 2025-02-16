package com.traini8.training_center.models;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

  @NotBlank(message = "Detailed address is required")
  private String detailedAddress;

  @NotBlank(message = "City is required")
  private String city;

  @NotBlank(message = "State is required")
  private String state;

  @Pattern(regexp = "^[0-9]{6}$", message = "Pincode must be 6 digits")
  private String pincode;
}
