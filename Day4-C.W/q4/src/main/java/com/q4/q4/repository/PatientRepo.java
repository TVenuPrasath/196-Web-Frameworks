package com.q4.q4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.q4.q4.model.Patient;

public interface PatientRepo extends JpaRepository <Patient,Integer>{

}
