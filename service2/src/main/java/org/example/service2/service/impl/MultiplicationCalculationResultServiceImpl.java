package org.example.service2.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.service2.model.MultiplicationCalculationResult;
import org.example.service2.repository.MultiplicationCalculationResultRepository;
import org.example.service2.service.MultiplicationCalculationResultService;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MultiplicationCalculationResultServiceImpl implements MultiplicationCalculationResultService {
    private final MultiplicationCalculationResultRepository sumCalculationResultRepository;

    @Override
    public List<MultiplicationCalculationResult> getResults(Specification<MultiplicationCalculationResult> spec, Sort sort) {
        return sumCalculationResultRepository.findAll(spec, sort);
    }
}
