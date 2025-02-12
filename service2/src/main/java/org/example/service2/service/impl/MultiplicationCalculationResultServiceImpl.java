package org.example.service2.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.service2.model.MultiplicationCalculationResult;
import org.example.service2.repository.MultiplicationCalculationResultRepository;
import org.example.service2.service.MultiplicationCalculationResultService;
import org.example.service2.specification.MultiplicationCalculationResultSpecifications;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MultiplicationCalculationResultServiceImpl implements MultiplicationCalculationResultService {
    private final MultiplicationCalculationResultRepository sumCalculationResultRepository;

    @Override
    public List<MultiplicationCalculationResult> getResults(Integer firstArgument,
                                                            Integer secondArgument,
                                                            Integer result,
                                                            String sortBy,
                                                            String sortDirection) {
        Specification<MultiplicationCalculationResult> spec = createSpecification(firstArgument, secondArgument, result);
        Sort sort = Sort.by(Sort.Direction.fromString(sortDirection), sortBy);
        return sumCalculationResultRepository.findAll(spec, sort);
    }

    private Specification<MultiplicationCalculationResult> createSpecification(Integer firstArgument, Integer secondArgument, Integer result) {
        return Specification
                .where(firstArgument == null ? null : MultiplicationCalculationResultSpecifications.hasFirstArgument(firstArgument))
                .and(secondArgument == null ? null : MultiplicationCalculationResultSpecifications.hasSecondArgument(secondArgument))
                .and(result == null ? null : MultiplicationCalculationResultSpecifications.resultGreaterThan(result));
    }
}
