package org.example.service2.service;

import java.time.LocalDateTime;

public interface StorageService {
    void saveResultToDB(Integer firstArgument, Integer secondArgument, Integer resultFromMultiply, LocalDateTime startTime, LocalDateTime endTime);
}
