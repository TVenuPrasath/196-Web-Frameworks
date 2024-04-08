package com.project1.project1.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class ApiController1 {
    @GetMapping("/{a}")
        public String Ap(@PathVariable String a)
        {
            return "Welcome "+a+"!";
        }
    
}
