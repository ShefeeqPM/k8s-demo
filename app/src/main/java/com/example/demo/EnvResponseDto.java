package com.example.demo;

public class EnvResponseDto {
    private final String environment;
    private final String logLevel;
    private final String dbPassword;

    public EnvResponseDto(String environment, String logLevel, String dbPassword) {
        this.environment = environment;
        this.logLevel = logLevel;
        this.dbPassword = dbPassword;
    }

    public String getEnvironment() {
        return environment;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public String getDbPassword() {
        return dbPassword;
    }
}
