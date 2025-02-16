package com.traini8.training_center.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.traini8.training_center.models.TrainingCenter;
import com.traini8.training_center.repository.TrainingCenterRepository;

import java.util.List;

@Service
@Transactional
public class TrainingCenterService {
  private final TrainingCenterRepository repository;

  public TrainingCenterService(TrainingCenterRepository repository) {
    this.repository = repository;
  }

  public TrainingCenter createTrainingCenter(TrainingCenter center) {
    return repository.save(center);
  }

  public List<TrainingCenter> getAllTrainingCenters() {
    return repository.findAll();
  }
}
