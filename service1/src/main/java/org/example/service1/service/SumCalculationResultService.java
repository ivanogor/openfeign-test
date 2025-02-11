package org.example.service1.service;

import org.example.service1.model.SumCalculationResult;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface SumCalculationResultService {
    List<SumCalculationResult> getResults(Specification<SumCalculationResult> spec, Sort sort);
}
