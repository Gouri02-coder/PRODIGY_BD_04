package com.example.Optimized_REST_API.service;

import com.example.Optimized_REST_API.model.User;
import com.example.Optimized_REST_API.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    // ✅ REGISTER USER (THIS WAS MISSING)
    public User register(User user) {
        return repository.save(user);
    }

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public User saveUser(User user) {
        return repository.save(user);
    }

    public void deleteUser(Long id) {
        repository.deleteById(id);
    }
}
