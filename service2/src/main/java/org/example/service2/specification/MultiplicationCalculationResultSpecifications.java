package org.example.service2.specification;

import org.example.service2.model.MultiplicationCalculationResult;
import org.springframework.data.jpa.domain.Specification;

public class MultiplicationCalculationResultSpecifications {
    public static Specification<MultiplicationCalculationResult> hasFirstArgument(Integer firstArgument) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("firstArgument"), firstArgument);
    }

    public static Specification<MultiplicationCalculationResult> hasSecondArgument(Integer secondArgument) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("secondArgument"), secondArgument);
    }

    public static Specification<MultiplicationCalculationResult> resultGreaterThan(Integer result){
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.greaterThan(root.get("result"), result);
    }
}
