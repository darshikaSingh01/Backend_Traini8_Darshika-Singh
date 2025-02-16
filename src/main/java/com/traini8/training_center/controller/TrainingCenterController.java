package com.traini8.training_center.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.traini8.training_center.models.TrainingCenter;
import com.traini8.training_center.service.TrainingCenterService;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/training-centers")
public class TrainingCenterController {
  private final TrainingCenterService service;

  public TrainingCenterController(TrainingCenterService service) {
    this.service = service;
  }

  @PostMapping
  public ResponseEntity<TrainingCenter> createTrainingCenter(@Valid @RequestBody TrainingCenter trainingCenter) {
    TrainingCenter savedCenter = service.createTrainingCenter(trainingCenter);
    return ResponseEntity.ok(savedCenter);
  }

  @GetMapping
  public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
    return ResponseEntity.ok(service.getAllTrainingCenters());
  }
}
