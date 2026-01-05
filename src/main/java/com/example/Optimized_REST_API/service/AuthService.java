package com.example.Optimized_REST_API.service;

import com.example.Optimized_REST_API.dto.LoginRequest;
import com.example.Optimized_REST_API.dto.RegisterRequest;
import com.example.Optimized_REST_API.model.User;
import com.example.Optimized_REST_API.repository.UserRepository;
import com.example.Optimized_REST_API.security.JwtUtil;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserRepository userRepository;
    private final JwtUtil jwtUtil;

    public AuthService(UserRepository userRepository, JwtUtil jwtUtil) {
        this.userRepository = userRepository;
        this.jwtUtil = jwtUtil;
    }

    public User register(RegisterRequest request) {
        User user = new User();
        user.setUsername(request.getUsername());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword()); // ✅ NOW STORED

        return userRepository.save(user);
    }

    public String login(LoginRequest request) {
        // DEMO login (no password validation yet)
        return jwtUtil.generateToken(request.getUsername());
    }
}
