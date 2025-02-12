package org.example.service2.service;

import org.example.service2.model.MultiplicationCalculationResult;

import java.util.List;

public interface MultiplicationCalculationResultService {

    List<MultiplicationCalculationResult> getResults(Integer firstArgument,
                                                     Integer secondArgument,
                                                     Integer result,
                                                     String sortBy,
                                                     String sortDirection);
}
