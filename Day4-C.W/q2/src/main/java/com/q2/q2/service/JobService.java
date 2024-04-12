package com.q2.q2.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.q2.q2.model.Job;
import com.q2.q2.repository.JobRepo;

@Service
public class JobService {

    @Autowired
    JobRepo jr;
    public Job savedata(Job j)
    {
        return jr.save(j);
    }
    public Optional<Job> findid(int id)
    {
        return jr.findById(id);
    }
    public List<Job> listdata()
    {
        return jr.findAll();
    }

    

}
