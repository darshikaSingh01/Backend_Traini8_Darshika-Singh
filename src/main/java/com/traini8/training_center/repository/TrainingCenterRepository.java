package com.traini8.training_center.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.traini8.training_center.models.TrainingCenter;

public interface TrainingCenterRepository extends JpaRepository<Long, TrainingCenter> {

}
