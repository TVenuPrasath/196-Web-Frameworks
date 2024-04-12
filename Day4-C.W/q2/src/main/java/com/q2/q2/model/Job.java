package com.q2.q2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int jobid;
    public String jobtitle;
    public int minsalary;
    public String jobdescription;
    public int maxsalary;

    public Job()
    {

    }

    public int getJobid() {
        return jobid;
    }

    public void setJobid(int jobid) {
        this.jobid = jobid;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public int getMinsalary() {
        return minsalary;
    }

    public void setMinsalary(int minsalary) {
        this.minsalary = minsalary;
    }

    public String getJobdescription() {
        return jobdescription;
    }

    public void setJobdescription(String jobdescription) {
        this.jobdescription = jobdescription;
    }

    public int getMaxsalary() {
        return maxsalary;
    }

    public void setMaxsalary(int maxsalary) {
        this.maxsalary = maxsalary;
    }

    public Job(int jobid, String jobtitle, int minsalary, String jobdescription, int maxsalary) {
        this.jobid = jobid;
        this.jobtitle = jobtitle;
        this.minsalary = minsalary;
        this.jobdescription = jobdescription;
        this.maxsalary = maxsalary;
    }
    


}
