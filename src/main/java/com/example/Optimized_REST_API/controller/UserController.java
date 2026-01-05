package com.example.Optimized_REST_API.controller;

import com.example.Optimized_REST_API.model.User;
import com.example.Optimized_REST_API.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<User> getUsers() {
        long start = System.currentTimeMillis();
        List<User> users = service.getAllUsers();
        long end = System.currentTimeMillis();
        System.out.println("Response Time: " + (end - start) + " ms");
        return users;
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return service.saveUser(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteUser(id);
    }
}
