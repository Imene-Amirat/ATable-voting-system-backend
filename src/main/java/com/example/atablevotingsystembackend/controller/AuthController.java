package com.example.atablevotingsystembackend.controller;

import com.example.atablevotingsystembackend.dto.RegisterRequest;
import com.example.atablevotingsystembackend.dto.RegisterResponse;
import com.example.atablevotingsystembackend.model.User;
import com.example.atablevotingsystembackend.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/users")
public class AuthController {
    private final AuthService authService;

    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public ResponseEntity<RegisterResponse> register(@RequestBody RegisterRequest userReq) {
        return authService.register(userReq);
    }
}
