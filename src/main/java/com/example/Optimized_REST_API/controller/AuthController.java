package com.example.Optimized_REST_API.controller;

import com.example.Optimized_REST_API.model.User;
import com.example.Optimized_REST_API.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }

    @PostMapping("/login")
    public String login() {
        return "Login success";
    }
}
