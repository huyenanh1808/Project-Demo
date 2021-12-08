package com.chien.tb.binhchien.security;

import com.chien.tb.binhchien.domain.UserRole;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

@Service
public class Token {
    @PostConstruct
    public void hehe() {
        System.out.println("heheeh");
    }

    public String getToken(UserRole userRole) {
        Long expired = LocalDateTime.now().plusSeconds(10).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        Claims claims = Jwts.claims();
        claims.setExpiration(new Date(expired));// thời gian hết hạn token
        claims.put("username", userRole.getAppUser().getUserName());
        claims.put("password", userRole.getAppUser().getEncrytedPassword());
        claims.put("role", userRole.getAppRole().getRoleName());
        String token = Jwts.builder()
                .setClaims(null)
                .signWith(SignatureAlgorithm.HS256, "key gi cung duoc")
                .compact();
        return token;
    }
}
