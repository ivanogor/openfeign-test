package org.example.service2.service.impl;

import org.example.service2.client.Service1Client;
import org.example.service2.service.SecondService;
import org.springframework.stereotype.Service;

@Service
public class SecondServiceImpl implements SecondService {
    private final Service1Client service1Client;


    public SecondServiceImpl(Service1Client service1Client) {
        this.service1Client = service1Client;
    }

    @Override
    public String process(Integer number){
        int resultFromService2 = number + 10;
        int resultFromService1 = service1Client.calculate(number);

        return "Service1 result: " + resultFromService1 + ", Service2 result: " + resultFromService2;
    }
}
