package com.example.democonfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

    @Value("${from}")
    private String from;

    @Value("${to}")
    private String to;

    @GetMapping("from")
    public String from() {
        return from;
    }

    @GetMapping("to")
    public String to() {
        return to;
    }

    @GetMapping("test")
    public String test() {
        return "hello world";
    }
}

