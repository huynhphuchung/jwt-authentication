package com.springdemo.jwtauthentication.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecretController {

    @GetMapping ("/api/secret-info")
    private ResponseEntity secretInfo(){
        return ResponseEntity.ok("This secret is no secret!");
    }
}
