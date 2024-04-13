package com.q1.q1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.q1.q1.model.Product;
import com.q1.q1.repository.ProductRepo;

@Service
public class ProductService {

    @Autowired
    ProductRepo pr;

    public Product saveall(@RequestBody Product e)
    {
        return pr.save(e);
    }

    public Product update(@RequestBody Product e)
    {
        return pr.save(e);
    }

    public void delete(int id)
    {
        pr.deleteById(id);
    }
}