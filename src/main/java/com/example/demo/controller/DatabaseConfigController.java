package com.example.demo.controller;

import com.example.demo.config.DatabaseConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/database/config")
public class DatabaseConfigController {

    private final DatabaseConfig databaseConfig;

    public DatabaseConfigController(DatabaseConfig databaseConfig) {
        this.databaseConfig = databaseConfig;
    }

    @GetMapping
    public String getDatabaseConfig() {
        return "URL: " + databaseConfig.getUrl() +
                ", Username: " + databaseConfig.getUsername() +
                ", Driver: " + databaseConfig.getDriver() +
                ", Pool Size: " + databaseConfig.getSettings().getPoolSize() +
                ", Timeout: " + databaseConfig.getSettings().getTimeout();
    }
}
