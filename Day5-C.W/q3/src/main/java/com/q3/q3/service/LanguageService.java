package com.q3.q3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.q3.q3.model.Language;
import com.q3.q3.repository.LanguagaRepository;

@Service
public class LanguageService {

    @Autowired
    LanguagaRepository lr;

    public Language putdata(Language l)
    {
        return lr.save(l);
    }
    public Optional<Language> getdata(@PathVariable int id)
    {
        return lr.findById(id);
    }
    public List<Language> listdata()
    {
        return lr.findAll();
    }
    public void delete(@PathVariable int id)
    {
        lr.deleteById(id);
    }

}
