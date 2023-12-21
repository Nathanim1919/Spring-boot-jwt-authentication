package com.jwt.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello, welcome to Cs50!";
    }

    @GetMapping("/user")
    public String userLevelAccess() {
        return "User level access";
    }
}