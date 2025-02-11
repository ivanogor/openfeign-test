package org.example.service1.repository;

import org.example.service1.model.SumCalculationResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SumCalculationResultRepository extends JpaRepository<SumCalculationResult, Long>, JpaSpecificationExecutor<SumCalculationResult> {
}
