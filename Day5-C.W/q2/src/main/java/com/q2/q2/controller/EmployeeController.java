package com.q2.q2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.q2.q2.model.Employee;
import com.q2.q2.service.EmployeeService;

@RestController
public class EmployeeController {
        @Autowired
        EmployeeService es;

       
        @PostMapping("/api/employee")
        public Employee setdata(@RequestBody Employee e)
        {
            return es.setdata(e);
        }
        @PutMapping("/api/putdata/{id}")
        public Employee putdata(@PathVariable int id,@RequestBody Employee e1)
        {
            return es.setdata(e1)                                                                                  ;
        }
        @DeleteMapping("/api/deletedata/{id}")
        public void delete(@PathVariable int id)
        {
            es.deletedata(id);
        }
}
