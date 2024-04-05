package com.software.censo.service;

import com.software.censo.config.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthService {

    @Autowired
    private JwtTokenProvider tokenProvider;

    public String authenticateUser(String username, String password) {
        return tokenProvider.generateToken(username, List.of("ROLE_USER"));
    }
}
