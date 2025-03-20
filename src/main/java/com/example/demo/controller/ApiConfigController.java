package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/config")
public class ApiConfigController {

    @Value("${api.base-url}")
    private String apiBaseUrl;

    @Value("${api.timeout}")
    private int apiTimeout;

    @Value("${api.key}")
    private String apiKey;

    @GetMapping
    public String getApiConfig() {
        return "Base URL: " + apiBaseUrl + ", Timeout: " + apiTimeout + "ms, API Key: " + apiKey;
    }
}
