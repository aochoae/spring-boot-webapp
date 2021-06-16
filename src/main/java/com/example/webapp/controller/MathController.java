package com.example.webapp.controller;

import javax.validation.constraints.Min;

import com.example.webapp.service.MathService;
import org.hibernate.validator.cfg.context.ReturnValueConstraintMappingContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public class MathController {

    private final MathService mathService;

    @Autowired
    public MathController(MathService mathService) {
        this.mathService = mathService;
    }

    @GetMapping(path = "/summation/{number}", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> summation(@Min(value = 1) @PathVariable Integer number) {
        return ResponseEntity.ok(String.valueOf(mathService.summation(number)));
    }
}
