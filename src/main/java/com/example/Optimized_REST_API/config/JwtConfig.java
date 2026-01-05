package com.example.Optimized_REST_API.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class JwtConfig {

    public static final String SECRET_KEY = "my-secret-key-123456";
    public static final long EXPIRATION_TIME = 1000 * 60 * 60; // 1 hour
}
