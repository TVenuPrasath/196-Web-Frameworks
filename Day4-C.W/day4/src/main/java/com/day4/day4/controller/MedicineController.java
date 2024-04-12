package com.day4.day4.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.day4.day4.model.Medicine;
import com.day4.day4.repository.MedicineRepo;
import com.day4.day4.service.MedicineService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class MedicineController {
    @Autowired
    MedicineService med;
    @Autowired
    MedicineRepo mr;
    
    @PostMapping("/insert")
    public Medicine savedata(@RequestBody Medicine m) 
    {
        return med.savMedicine(m);
    }

    @GetMapping("/welcome/{id}")
        public Optional<Medicine> showdata(@PathVariable int id)
        {
            return mr.findById(id);
        }
    
}