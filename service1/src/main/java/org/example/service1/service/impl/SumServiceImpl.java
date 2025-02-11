package org.example.service1.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.service1.service.StorageService;
import org.example.service1.service.SumService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class SumServiceImpl implements SumService {
    private final StorageService storageService;
    @Override
    public Integer sum(Integer firstArgument, Integer secondArgument) {
        LocalDateTime startTime = LocalDateTime.now();
        Integer result = firstArgument + secondArgument;
        LocalDateTime endTime = LocalDateTime.now();
        storageService.saveResultToDB(firstArgument, secondArgument, result, startTime, endTime);
        return result;
    }
}
