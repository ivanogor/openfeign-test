package org.example.service1.specification;

import org.example.service1.model.SumCalculationResult;
import org.springframework.data.jpa.domain.Specification;

public class SumCalculationResultSpecifications {
    public static Specification<SumCalculationResult> hasFirstArgument(Integer firstArgument) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("firstArgument"), firstArgument);
    }

    public static Specification<SumCalculationResult> hasSecondArgument(Integer secondArgument) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("secondArgument"), secondArgument);
    }

    public static Specification<SumCalculationResult> resultGreaterThan(Integer result){
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.greaterThan(root.get("result"), result);
    }
}
