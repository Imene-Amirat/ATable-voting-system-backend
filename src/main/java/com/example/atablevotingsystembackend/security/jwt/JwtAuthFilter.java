package com.example.atablevotingsystembackend.security.jwt;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

/**
 * lit le token dans la requête & authentifie:
     * S’exécute pour chaque requête HTTP
     * Récupère le header Authorization: Bearer xxx
     * Vérifie le token via JwtService
     * Si valide → met un Authentication dans SecurityContextHolder
     * (comme si Spring avait loggé l’utilisateur)
**/
@Component
public class JwtAuthFilter extends OncePerRequestFilter {
    // doFilterInternal(...)
    // - lire Authorization
    // - extraire token
    // - jwtService.extractUsername(...)
    // - charger l’utilisateur via UserDetailsService
    // - jwtService.isTokenValid(...)
    // - si OK → SecurityContextHolder.setAuthentication(...)
}
