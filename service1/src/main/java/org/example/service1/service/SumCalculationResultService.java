package org.example.service1.service;

import org.example.service1.model.SumCalculationResult;

import java.util.List;

public interface SumCalculationResultService {
    List<SumCalculationResult> getResults(Integer firstArgument,
                                          Integer secondArgument,
                                          Integer result,
                                          String sortBy,
                                          String sortDirection);
}
