package com.project2.project2.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Controller {
    @GetMapping("/welcome")
   public Controller1  mes()
   {
     
        Controller1 c=new Controller1("Venu Prasath", "727722eucs196", "WebFrameWork", "Watching movies", "Briyani", "Got bite from dog in hostel","null", "nothing", "nothing","nothingf");
        return c;
   }
    

}
