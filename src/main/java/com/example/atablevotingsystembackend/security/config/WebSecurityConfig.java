package com.example.atablevotingsystembackend.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * règles de sécurité (routes, filters, stateless…):
 * Déclarer le SecurityFilterChain

 * Dire quelles routes sont publiques (/api/auth/**)
 *
 * Activer le mode STATELESS (pas de session)
 *
 * Ajouter le JwtAuthFilter AVANT UsernamePasswordAuthenticationFilter
**/
@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
    // csrf disable
    // session stateless
    // authorizeHttpRequests -> /api/auth/** permitAll, le reste authenticated
    // .authenticationProvider(authenticationProvider)
    // .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class)
}
