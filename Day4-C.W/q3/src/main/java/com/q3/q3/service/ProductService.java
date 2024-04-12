package com.q3.q3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.q3.q3.model.Product;
import com.q3.q3.repository.ProductRepo;

@Service
public class ProductService {
        @Autowired
        ProductRepo repository;

        public Product savedata(Product p)
        {
            return repository.save(p);
        }

        public List<Product> findlist()
        {
            return repository.findAll();
        }
        
        public Optional<Product> findid(int id)
        {
            return repository.findById(id);
        }


}
