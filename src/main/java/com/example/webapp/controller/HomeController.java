package com.example.webapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping(path = "/")
    public ModelAndView index() {
        return new ModelAndView("index", HttpStatus.OK);
    }
}
