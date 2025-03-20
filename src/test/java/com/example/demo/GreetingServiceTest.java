package com.example.demo;

import com.example.demo.service.GreetingServiceImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingServiceTest {

    private final GreetingServiceImpl greetingService = new GreetingServiceImpl();

    @Test
    void testGetGreeting() {
        assertEquals("Hello, Spring Boot!", greetingService.getMessage());
    }
}
