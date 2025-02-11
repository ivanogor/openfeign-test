package org.example.service2.service.impl;

import org.example.service2.service.DateCalculationService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class DateCalculationServiceImpl implements DateCalculationService {
    @Override
    @Scheduled(cron = "0 0 10 * * MON-FRI")
    public void getMultiplyingDayByMonth(){
        LocalDate today = LocalDate.now();
        int day = today.getDayOfMonth();
        int month = today.getMonthValue();

        int resultOfMultiplyingDayByMonth = day * month;

        System.out.println("Result of multiplying day by month: " + resultOfMultiplyingDayByMonth);
    }
}
