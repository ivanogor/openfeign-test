package org.example.service1.service.impl;

import org.example.service1.service.FirstService;
import org.springframework.stereotype.Service;

@Service
public class FirstServiceImpl implements FirstService {

    @Override
    public int calculate(int number){
        return number * 10;
    }
}
