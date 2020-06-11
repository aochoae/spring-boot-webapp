package com.example.application.webapp.math;

import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.application.services.math.MathService;

@RestController
@Validated
public class MathController {

    @Autowired
    private MathService mathService;

    @GetMapping(path = "/summation/{number}", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> summation(@Min(value = 1) @PathVariable Integer number) {
        return new ResponseEntity<String>(String.valueOf(mathService.summation(number)), HttpStatus.OK);
    }

}
