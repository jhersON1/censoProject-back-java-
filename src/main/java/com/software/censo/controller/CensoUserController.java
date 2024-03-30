package com.software.censo.controller;

import com.software.censo.model.CensoUser;
import com.software.censo.service.CensoUserService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("censo/user")
public class CensoUserController {

    @Autowired
    private CensoUserService service;

    @PostMapping()
    @Operation(description = "Register a new user")
    public ResponseEntity<CensoUser> saveTravelerUser(@RequestBody CensoUser user) {
        return ResponseEntity.ok(service.saveCensoUser(user));
    }

    @GetMapping()
    @Operation(description = "Get all users")
    public ResponseEntity<List<CensoUser>> getAllCensoUsers() {
        return ResponseEntity.ok(service.getAllCensoUsers());
    }
}
