package com.project1.project1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController2 {
    @GetMapping("/favoriteColor")
    public String Fc(@RequestParam String color)
    {
        return "My favourite color is "+color+"!";
    }
}
