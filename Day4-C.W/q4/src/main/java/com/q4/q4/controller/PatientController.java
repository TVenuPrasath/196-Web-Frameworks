package com.q4.q4.controller;

import java.util.Optional;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.q4.q4.model.Patient;
import com.q4.q4.service.PatientService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class PatientController {

    @Autowired
    PatientService ps;
    
    @PostMapping(path="/api/patient")
    public Patient setdata(Patient p) 
    {
        return ps.putdata(p);
    }

    @GetMapping("/api/patient/{id}")
    public Optional<Patient> op(@PathVariable int id) 
    {
        return ps.findid(id);
    }
    @GetMapping("/api/patient")
    public List<Patient> setlist() 
    {
        return ps.listdata();
    }
    
    
    
}
