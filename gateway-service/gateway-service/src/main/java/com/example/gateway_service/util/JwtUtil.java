package com.example.gateway_service.util;

import java.security.Key;


import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {


    public static final String SECRET = "5367566B59703373367639792F423F4528482B4D6251655468576D5A71347437";


    public void validateToken(final String token) {
    	System.out.println("I am in validate token");
        Jwts.parserBuilder().setSigningKey(getSignKey()).build().parseClaimsJws(token);
    	System.out.println("I am outttn validate token");

    }



    private Key getSignKey() {
    	System.out.println("I am in Singed token");
        byte[] keyBytes = Decoders.BASE64.decode(SECRET);
        System.out.println("I am out Singed token");
        return Keys.hmacShaKeyFor(keyBytes);
    }
}