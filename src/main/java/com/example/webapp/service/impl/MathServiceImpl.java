package com.example.webapp.service.impl;

import com.example.webapp.service.MathService;

import org.springframework.stereotype.Service;

@Service
public class MathServiceImpl implements MathService {

    @Override
    public int summation(int number) {
        return number * (number + 1) / 2;
    }
}
