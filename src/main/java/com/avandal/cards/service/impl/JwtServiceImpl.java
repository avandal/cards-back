package com.avandal.cards.service.impl;

import com.avandal.cards.model.User;
import com.avandal.cards.service.JwtService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.util.Date;
import java.util.Properties;

@Service
public class JwtServiceImpl implements JwtService {
    private final String secretKey;
    private final long expiredTime;

    private JwtServiceImpl(Properties jwtProperties) {
        secretKey = jwtProperties.getProperty("secret.key");
        expiredTime = Long.parseLong(jwtProperties.getProperty("expired.time"));
    }

    @Override
    public String generateToken(User user) {
        SignatureAlgorithm signature = SignatureAlgorithm.HS256;
        byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(secretKey);
        SecretKey key = new SecretKeySpec(apiKeySecretBytes, signature.getJcaName());

        long lnow = System.currentTimeMillis();
        Date now = new Date(lnow);
        Date expired = new Date(lnow + expiredTime);

        return Jwts.builder()
                .setIssuedAt(now)
                .setExpiration(expired)
                .setSubject(user.getUsername())
                .signWith(key, signature)
                .compact();
    }

    @Override
    public Jws<Claims> validateToken(String token) {
        return Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token);
    }
}
