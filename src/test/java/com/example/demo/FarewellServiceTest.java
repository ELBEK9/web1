package com.example.demo;

import com.example.demo.service.FarewellServiceImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FarewellServiceTest {

    private final FarewellServiceImpl farewellService = new FarewellServiceImpl();

    @Test
    void testGetFarewell() {
        assertEquals("Goodbye, Spring Boot!", farewellService.getMessage());
    }
}
