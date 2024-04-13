package com.q2.q2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.q2.q2.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>{

}
