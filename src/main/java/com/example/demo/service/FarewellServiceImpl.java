package com.example.demo.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Lazy  // This service will only be initialized when it's first used
@Service("farewellService")
public class FarewellServiceImpl implements MessageService {

    public FarewellServiceImpl() {
        System.out.println("FarewellService Initialized!");
    }

    @Override
    public String getMessage() {
        return "Goodbye, Spring Boot!";
    }
}
