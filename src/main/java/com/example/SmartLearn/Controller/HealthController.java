package com.example.SmartLearn.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    // A lightweight endpoint for uptime robots
    @GetMapping("/Public/health")
    public String healthCheck() {
        return "OK";
    }
}