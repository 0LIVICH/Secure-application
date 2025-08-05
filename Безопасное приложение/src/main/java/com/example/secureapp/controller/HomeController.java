package com.example.secureapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {

    @GetMapping("/public")
    public String publicEndpoint() {
        return "Это публичный endpoint - доступен без авторизации!";
    }

    @GetMapping("/private")
    public String privateEndpoint() {
        return "Это приватный endpoint - требует авторизации!";
    }

    @GetMapping("/admin")
    public String adminEndpoint() {
        return "Это админский endpoint - требует авторизации!";
    }

    @GetMapping("/user")
    public String userEndpoint() {
        return "Это пользовательский endpoint - требует авторизации!";
    }
} 