package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service("greetingService")  // Assigning a custom bean name
public class GreetingServiceImpl implements MessageService {

    @Override
    public String getMessage() {
        return "Hello, Spring Boot!";
    }
}
