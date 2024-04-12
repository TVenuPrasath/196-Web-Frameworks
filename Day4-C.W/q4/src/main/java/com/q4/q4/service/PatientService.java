package com.q4.q4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.q4.q4.model.Patient;
import com.q4.q4.repository.PatientRepo;

@Service
public class PatientService {
        @Autowired
        PatientRepo pr;

        public Patient putdata(Patient p)
        {
            return pr.save(p);
        }

        public List<Patient> listdata()
        {
            return pr.findAll();
        }

        public Optional<Patient> findid(int id)
        {
            return pr.findById(id);
        }
}
