package org.example.service2.repository;

import org.example.service2.model.CalculationResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalculationResultRepository extends JpaRepository<CalculationResult, Long> {
}
