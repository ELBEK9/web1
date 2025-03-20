package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class CustomPropertyController {

    @Value("${app.name}")
    private String appName;

    @GetMapping
    public String getAppName() {
        return "Application Name: " + appName;
    }
}
