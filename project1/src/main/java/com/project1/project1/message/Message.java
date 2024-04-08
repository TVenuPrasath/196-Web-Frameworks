package com.project1.project1.message;

import org.springframework.web.bind.annotation.RestController;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class Message {
        @Value("${myName.name}")
        private String myName;
        @GetMapping("/we")
        public String venu()
        {
            return myName;
        }
        
}
