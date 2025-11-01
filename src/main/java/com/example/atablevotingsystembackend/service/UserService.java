package com.example.atablevotingsystembackend.service;

import com.example.atablevotingsystembackend.model.Restaurant;
import com.example.atablevotingsystembackend.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
