package com.project2.project2.controller;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Controller1 {
    @JsonProperty( "Name")
    private String Name;
    @JsonProperty( "Regno")
    private String Regno;
    @JsonProperty( "Course")
    private String Course;
    @JsonProperty( "Hobby")
    private String Hobby;
    @JsonProperty( "Favfood")
    private String Favfood;
    @JsonProperty( "Funnymoments")
    private String Funnymoments;
    @JsonProperty( "Aim")
    private String Aim;
    @JsonProperty( "ShorttermGoal")
    private String ShorttermGoal;
    @JsonProperty( "LongtermGoal")
    private String Longtermgoal;
    @JsonProperty( "Suggestion")
    private String Suggestion;

    public void setName(String name) {
        this.Name = name;
    }
    public void setRegno(String regno) {
        this.Regno = regno;
    }
    public void setCourse(String course) {
        this.Course = course;
    }
    public void setHobby(String hobby) {
        this.Hobby = hobby;
    }
    public void setFavfood(String favfood) {
        this.Favfood = favfood;
    }
    public void setFunnymoments(String funnymoments) {
        this.Funnymoments = funnymoments;
    }
    public void setAim(String aim) {
        this.Aim = aim;
    }
    public void setShorttermgoal(String shorttermgoal) {
        this.ShorttermGoal = shorttermgoal;
    }
    public void setLongtermgoal(String longtermgoal) {
        this.Longtermgoal = longtermgoal;
    }
    public void setSuggestion(String suggestion) {
        this.Suggestion = suggestion;
    }
    public Controller1(String name, String regno, String course, String hobby, String favfood, String funnymoments,
            String aim, String shorttermgoal, String longtermgoal, String suggestion) {
        this.Name = name;
        this.Regno = regno;
        this.Course = course;
        this.Hobby = hobby;
        this.Favfood = favfood;
        this.Funnymoments = funnymoments;
        this.Aim = aim;
        this.ShorttermGoal = shorttermgoal;
        this.Longtermgoal = longtermgoal;
        this.Suggestion = suggestion;
    }
    
}
