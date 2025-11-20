package com.example.atablevotingsystembackend.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
/**
 * Déclarer le PasswordEncoder (BCrypt)
 * Déclarer le AuthenticationManager / AuthenticationProvider qui utilise ton UserDetailsService
**/
public class ApplicationConfig {
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
