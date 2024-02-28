package com.xdman.security.controller;

import com.xdman.security.model.AuthRequest;
import com.xdman.security.model.AuthResponse;
import com.xdman.security.model.RegisterRequest;
import com.xdman.security.service.AuthService;
import com.xdman.security.service.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService service;

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request){
        return ResponseEntity.ok(service.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> auth(@RequestBody AuthRequest request){
        return ResponseEntity.ok(service.auth(request));
    }


}
