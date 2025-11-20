package com.example.atablevotingsystembackend.dto;

import com.example.atablevotingsystembackend.model.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegisterResponse {
    private String email;
    private String username;
    private Role role;
    private String token;
}
