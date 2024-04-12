package com.day4.day4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day4.day4.model.Medicine;
import com.day4.day4.repository.MedicineRepo;


@Service
public class MedicineService {
    @Autowired
    MedicineRepo m;
    public Medicine savMedicine(Medicine me)
    {
        return m.save(me);
    }
    
}
