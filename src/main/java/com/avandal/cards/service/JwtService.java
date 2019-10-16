package com.avandal.cards.service;

import com.avandal.cards.model.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;

public interface JwtService {
    String generateToken(User user);
    Jws<Claims> validateToken(String token);
}
