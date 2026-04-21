package com.sakshi.journalApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    @GetMapping("/health-cheak")
    public String healthCheck(){
        return "Ok";

    }
}
