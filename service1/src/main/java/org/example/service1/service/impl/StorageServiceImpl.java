package org.example.service1.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.service1.model.SumCalculationResult;
import org.example.service1.repository.SumCalculationResultRepository;
import org.example.service1.service.StorageService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class StorageServiceImpl implements StorageService {
    private final SumCalculationResultRepository sumCalculationResultRepository;

    @Override
    public void saveResultToDB(Integer firstArgument, Integer secondArgument, Integer resultFromMultiply, LocalDateTime startTime, LocalDateTime endTime){
        SumCalculationResult sumCalculationResult = new SumCalculationResult(firstArgument, secondArgument, resultFromMultiply, startTime, endTime);
        sumCalculationResultRepository.save(sumCalculationResult);
    }
}
