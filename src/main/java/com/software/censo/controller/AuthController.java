package com.software.censo.controller;

import com.software.censo.config.JwtTokenProvider;
import com.software.censo.model.CensoUser;
import com.software.censo.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private AuthService authService;

    @Autowired
    private JwtTokenProvider tokenProvider;

    @PostMapping("/login")
    public ResponseEntity<?> authenticateUser(@RequestBody CensoUser user) {
        String token = authService.authenticateUser(user.getEmail(), user.getPassword());
        return ResponseEntity.ok(token);
    }
}
