package com.q2.q2.controller;

import java.util.Optional;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.q2.q2.model.Job;
import com.q2.q2.service.JobService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;





@RestController
public class JobController {
    @Autowired
    JobService js;
        
    @PostMapping("/api/job")
    public Job putdata(@RequestBody Job j) 
    {
       return js.savedata(j);
    }

    @GetMapping("/api/job/{id}")
    public  Optional<Job> showdata(@PathVariable  int id) 
    {
        return js.findid(id);
    }

    @GetMapping("/api/job")
    public List<Job> showlist() {
        return js.listdata();
    }
    
    
    
}
