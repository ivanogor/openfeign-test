package org.example.service1.controller;

import lombok.RequiredArgsConstructor;
import org.example.service1.model.SumCalculationResult;
import org.example.service1.service.SumCalculationResultService;
import org.example.service1.specification.SumCalculationResultSpecifications;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/service1")
@RequiredArgsConstructor
public class SumCalculationResultController {
    private final SumCalculationResultService sumCalculationResultService;

    @GetMapping
    public List<SumCalculationResult> getResults(
            @RequestParam(required = false) Integer firstArgument,
            @RequestParam(required = false) Integer secondArgument,
            @RequestParam(required = false) Integer result,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String sortDirection) {

        Specification<SumCalculationResult> spec = createSpecification(firstArgument, secondArgument, result);
        Sort sort = Sort.by(Sort.Direction.fromString(sortDirection), sortBy);
        return sumCalculationResultService.getResults(spec, sort);
    }

    private Specification<SumCalculationResult> createSpecification(Integer firstArgument, Integer secondArgument, Integer result) {
        return Specification
                .where(firstArgument == null ? null : SumCalculationResultSpecifications.hasFirstArgument(firstArgument))
                .and(secondArgument == null ? null : SumCalculationResultSpecifications.hasSecondArgument(secondArgument))
                .and(result == null ? null : SumCalculationResultSpecifications.resultGreaterThan(result));
    }
}
