package com._23124890.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping("/test")
    public String test() {
        return "Spring Boot application runs normally! Current time:" + new java.util.Date();
    }

    @GetMapping("/")
    public String home() {
        return "Welcome to the back-end API of address book management system!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application status: normal operation";
    }
}