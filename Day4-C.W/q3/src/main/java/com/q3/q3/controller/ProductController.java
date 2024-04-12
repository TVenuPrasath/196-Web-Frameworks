package com.q3.q3.controller;

import java.util.Optional;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.q3.q3.model.Product;
import com.q3.q3.service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class ProductController {
    @Autowired
    ProductService ps;

    @PostMapping("/api/product")
    public Product putdata(@RequestBody Product p) {
        return ps.savedata(p);
    }

    @GetMapping("/api/product/{id}")
    public Optional<Product> getid(@PathVariable int id){
        return ps.findid(id);
    }
    
    @GetMapping("/api/product")
    public List<Product> getlist() {
        return ps.findlist();
    }
    
    
}






