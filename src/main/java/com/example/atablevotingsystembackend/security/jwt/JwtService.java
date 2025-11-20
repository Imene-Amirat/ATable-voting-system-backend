package com.example.atablevotingsystembackend.security.jwt;

import org.springframework.stereotype.Service;
/**
 * crée/valide JWT
     * Générer un token JWT à partir d’un UserDetails
     * Extraire le username (email) du token
     * Vérifier si le token est valide / expiré
 **/
@Service
public class JwtService {
    // lit app.jwt.secret + app.jwt.expiration-ms
    // generateToken(userDetails)
    // extractUsername(token)
    // isTokenValid(token, userDetails)
}
