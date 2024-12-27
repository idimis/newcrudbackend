package com.livecode.backend.entity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Use RestController for API responses (raw data like text or JSON)
@RequestMapping("/") // This will handle requests for root ("/")
public class HomeController {

    // Endpoint for home page
    @GetMapping
    public String home() {
        return "Welcome to the home page!"; // Return simple text response for root URL
    }

    // API endpoint to return text (no static resource error)
    @GetMapping("/api/hello")
    public String hello() {
        return "Hello, World!"; // Return simple text for /api/hello
    }
}
