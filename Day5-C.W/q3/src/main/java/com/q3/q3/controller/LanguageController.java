package com.q3.q3.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.q3.q3.model.Language;
import com.q3.q3.service.LanguageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class LanguageController {

    @Autowired
    LanguageService ls;

    @PostMapping("/language")
    public Language savedata(@RequestBody Language l) {
        return ls.putdata(l);
    }
    @GetMapping("/language")
    public List<Language> list() {
        return ls.listdata();
    }
    @GetMapping("/language/{languageId}")
    public Optional<Language> findid(@PathVariable int id) {
        return ls.getdata(id);
    }
   @PutMapping("/language/{languageId}")
   public Object Language (@PathVariable int id, @RequestBody Language le) {
      return ls.putdata(le);
   } 
    @DeleteMapping("/language/{languageId}")
    public void del(@PathVariable int id)
    {
        ls.delete(id);
    }
    

}
