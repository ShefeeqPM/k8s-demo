package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvController {

    @Value("${app.env}")
    private String env;

    @Value("${app.log-level}")
    private String logLevel;

    @Value("${db.password}")
    private String dbPassword;

    @GetMapping("/")
    public String showConfig() {
        return "Environment: " + env +
                "\nLog Level: " + logLevel +
                "\nDB Password: " + dbPassword;
    }
}
