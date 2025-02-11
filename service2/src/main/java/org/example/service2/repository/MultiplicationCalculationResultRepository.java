package org.example.service2.repository;

import org.example.service2.model.MultiplicationCalculationResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MultiplicationCalculationResultRepository extends JpaRepository<MultiplicationCalculationResult, Long>, JpaSpecificationExecutor<MultiplicationCalculationResult> {
}
