package com.example.Optimized_REST_API.repository;

import com.example.Optimized_REST_API.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
