package org.example.service2.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.service2.service.ProcessService;
import org.example.service2.service.StorageService;
import org.example.service_contracts.service1.SumController;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class CalculateServiceImpl implements ProcessService {
    private final SumController sumController;
    private final StorageService storageService;

    @Override
    public String calculateNumbers(Integer firstArgument, Integer secondArgument, Integer thirdArgument){
        LocalDateTime startTime = LocalDateTime.now();
        Integer resultFromMultiply = firstArgument * secondArgument;
        LocalDateTime endTime = LocalDateTime.now();
        storageService.saveResultToDB(firstArgument, secondArgument, resultFromMultiply, startTime, endTime);
        int resultFromSum= sumController.sum(resultFromMultiply, thirdArgument);
        return "Service1 result: " + resultFromSum + ", Service2 result: " + resultFromMultiply;
    }
}
