package org.example.service2.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.service2.repository.MultiplicationCalculationResultRepository;
import org.example.service2.model.MultiplicationCalculationResult;
import org.example.service2.service.StorageService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class StorageServiceImpl implements StorageService {
    private final MultiplicationCalculationResultRepository multiplicationCalculationResultRepository;

    @Override
    public void saveResultToDB(Integer firstArgument, Integer secondArgument, Integer resultFromMultiply, LocalDateTime startTime, LocalDateTime endTime){
        MultiplicationCalculationResult multiplicationCalculationResult = new MultiplicationCalculationResult(firstArgument, secondArgument, resultFromMultiply, startTime, endTime);
        multiplicationCalculationResultRepository.save(multiplicationCalculationResult);
    }
}
