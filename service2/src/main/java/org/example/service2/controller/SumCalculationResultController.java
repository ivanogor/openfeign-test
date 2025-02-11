package org.example.service2.controller;

import lombok.RequiredArgsConstructor;
import org.example.service2.model.MultiplicationCalculationResult;
import org.example.service2.service.MultiplicationCalculationResultService;
import org.example.service2.specification.MultiplicationCalculationResultSpecifications;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/service2")
@RequiredArgsConstructor
public class SumCalculationResultController {
    private final MultiplicationCalculationResultService sumCalculationResultService;

    @GetMapping
    public List<MultiplicationCalculationResult> getResults(
            @RequestParam(required = false) Integer firstArgument,
            @RequestParam(required = false) Integer secondArgument,
            @RequestParam(required = false) Integer result,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String sortDirection) {

        Specification<MultiplicationCalculationResult> spec = createSpecification(firstArgument, secondArgument, result);
        Sort sort = Sort.by(Sort.Direction.fromString(sortDirection), sortBy);
        return sumCalculationResultService.getResults(spec, sort);
    }

    private Specification<MultiplicationCalculationResult> createSpecification(Integer firstArgument, Integer secondArgument, Integer result) {
        return Specification
                .where(firstArgument == null ? null : MultiplicationCalculationResultSpecifications.hasFirstArgument(firstArgument))
                .and(secondArgument == null ? null : MultiplicationCalculationResultSpecifications.hasSecondArgument(secondArgument))
                .and(result == null ? null : MultiplicationCalculationResultSpecifications.resultGreaterThan(result));
    }
}
