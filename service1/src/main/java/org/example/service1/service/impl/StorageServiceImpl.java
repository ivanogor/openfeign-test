package org.example.service1.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.service1.model.CalculationResult;
import org.example.service1.repository.CalculationResultRepository;
import org.example.service1.service.StorageService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class StorageServiceImpl implements StorageService {
    private final CalculationResultRepository calculationResultRepository;

    @Override
    public void saveResultToDB(Integer firstArgument, Integer secondArgument, Integer resultFromMultiply, LocalDateTime startTime, LocalDateTime endTime){
        CalculationResult calculationResult = new CalculationResult(firstArgument, secondArgument, resultFromMultiply, startTime, endTime);
        calculationResultRepository.save(calculationResult);
    }
}
