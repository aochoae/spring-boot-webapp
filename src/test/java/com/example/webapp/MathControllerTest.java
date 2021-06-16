package com.example.webapp;

import com.example.webapp.controller.MathController;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class MathControllerTest {

    @Autowired
    private MathController mathController;

    @Test
    void contextLoads() {
        assertThat(mathController).isNotNull();
    }
}
