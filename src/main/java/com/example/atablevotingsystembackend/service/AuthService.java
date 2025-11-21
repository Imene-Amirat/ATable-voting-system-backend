package com.example.atablevotingsystembackend.service;

import com.example.atablevotingsystembackend.dto.RegisterRequest;
import com.example.atablevotingsystembackend.dto.RegisterResponse;
import com.example.atablevotingsystembackend.model.Role;
import com.example.atablevotingsystembackend.model.User;
import com.example.atablevotingsystembackend.repository.UserRepository;
import com.example.atablevotingsystembackend.security.jwt.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    @Autowired
    public AuthService(UserRepository userRepository, PasswordEncoder passwordEncoder, JwtService jwtService) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtService = jwtService;
    }

    public RegisterResponse register(RegisterRequest request) {
        // 1. Vérifier que l'email n'existe pas déjà
        System.out.println("11111111");
        if (userRepository.existsByEmail(request.getEmail())) {
            throw new IllegalArgumentException("Email already in use");
        }

        // 2. Convertir String => Enum
        Role role = Role.valueOf(request.getRole().toUpperCase());

        // 3. Construire l'entité User
        User user = new User();
        user.setEmail(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setUsername(request.getUsername());
        user.setRole(role);
        System.out.println("22");

        // 4. Sauvegarder en base
        user = userRepository.save(user);

        // 5. Générer le JWT à partir de l'utilisateur
        String token = jwtService.generateToken(user);

        // 6. Construire la réponse ==> on renvoie au front les infos utiles + le token → le front peut le stocker.
        return new RegisterResponse(
                user.getEmail(),
                user.getUsername(),
                user.getRole(),
                token
        );
    }
}
