package org.example.service2.service;

import org.example.service2.model.MultiplicationCalculationResult;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface MultiplicationCalculationResultService {
    List<MultiplicationCalculationResult> getResults(Specification<MultiplicationCalculationResult> spec, Sort sort);
}
