package org.example.service2.service.impl;

import org.example.service2.service.SecondService;
import org.example.service_contracts.service1.FirstController;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class SecondServiceImpl implements SecondService {
    private final FirstController firstController;

    public SecondServiceImpl(FirstController firstController) {
        this.firstController = firstController;
    }

    @Override
    public String process(Integer number){
        int resultFromService2 = number + 10;
        int resultFromService1 = firstController.calculate(number);

        return "Service1 result: " + resultFromService1 + ", Service2 result: " + resultFromService2;
    }

    @Scheduled(cron = "0 0 10 * * MON-FRI")
    public void getMultiplyingDayByMonth(){
        LocalDate today = LocalDate.now();
        int day = today.getDayOfMonth();
        int month = today.getMonthValue();

        int resultOfMultiplyingDayByMonth = day * month;

        System.out.println("Result of multiplying day by month: " + resultOfMultiplyingDayByMonth);
    }
}
