package com.software.censo.controller;

import com.software.censo.dto.LoginRequest;
import com.software.censo.dto.SignUpRequest;
import com.software.censo.service.CensoUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private CensoUserService censoUserService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        return ResponseEntity.ok(censoUserService.authenticate(loginRequest));
    }

    @PostMapping("/signup")
    public ResponseEntity<?> register(@RequestBody SignUpRequest signUpRequest) {
        return ResponseEntity.ok(censoUserService.register(signUpRequest));
    }
}
