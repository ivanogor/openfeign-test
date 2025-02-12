package org.example.service1.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.service1.model.SumCalculationResult;
import org.example.service1.repository.SumCalculationResultRepository;
import org.example.service1.service.SumCalculationResultService;
import org.example.service1.specification.SumCalculationResultSpecifications;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SumCalculationResultServiceImpl implements SumCalculationResultService {
    private final SumCalculationResultRepository sumCalculationResultRepository;

    @Override
    public List<SumCalculationResult> getResults(Integer firstArgument,
                                                 Integer secondArgument,
                                                 Integer result,
                                                 String sortBy,
                                                 String sortDirection)
    {
        Specification<SumCalculationResult> spec = createSpecification(firstArgument, secondArgument, result);
        Sort sort = Sort.by(Sort.Direction.fromString(sortDirection), sortBy);
        return sumCalculationResultRepository.findAll(spec, sort);
    }

    private Specification<SumCalculationResult> createSpecification(Integer firstArgument, Integer secondArgument, Integer result) {
        return Specification
                .where(firstArgument == null ? null : SumCalculationResultSpecifications.hasFirstArgument(firstArgument))
                .and(secondArgument == null ? null : SumCalculationResultSpecifications.hasSecondArgument(secondArgument))
                .and(result == null ? null : SumCalculationResultSpecifications.resultGreaterThan(result));
    }
}
