package com.project1.project1.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project1.project1.response.response;

@RestController
public class Model {
        @GetMapping("/wel")
        public response mess()
        {
            response r = new response(1,"venu", "prasath");
            return r;
        }
}
