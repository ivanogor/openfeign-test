package org.example.service1.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.service1.model.SumCalculationResult;
import org.example.service1.repository.SumCalculationResultRepository;
import org.example.service1.service.SumCalculationResultService;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SumCalculationResultServiceImpl implements SumCalculationResultService {
    private final SumCalculationResultRepository sumCalculationResultRepository;

    @Override
    public List<SumCalculationResult> getResults(Specification<SumCalculationResult> spec, Sort sort) {
        return sumCalculationResultRepository.findAll(spec, sort);
    }
}
