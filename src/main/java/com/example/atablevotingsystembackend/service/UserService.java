package com.example.atablevotingsystembackend.service;

import com.example.atablevotingsystembackend.model.Restaurant;
import com.example.atablevotingsystembackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
