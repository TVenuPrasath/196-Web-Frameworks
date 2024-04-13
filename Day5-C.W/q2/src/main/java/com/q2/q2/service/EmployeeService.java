package com.q2.q2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.q2.q2.model.Employee;
import com.q2.q2.repository.EmployeeRepo;

@Service
public class EmployeeService {
        @Autowired
        EmployeeRepo er;

        public Employee setdata(Employee e)
        {
            return er.save(e);
        }

        public void deletedata(int id)
        {
             er.deleteById(id);
        }
        
}
