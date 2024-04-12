package com.q3.q3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.q3.q3.model.Product;

public interface ProductRepo extends JpaRepository<Product,Integer>{

}
