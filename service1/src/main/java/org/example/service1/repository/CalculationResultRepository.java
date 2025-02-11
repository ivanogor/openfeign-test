package org.example.service1.repository;

import org.example.service1.model.CalculationResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalculationResultRepository extends JpaRepository<CalculationResult, Long> {
}
