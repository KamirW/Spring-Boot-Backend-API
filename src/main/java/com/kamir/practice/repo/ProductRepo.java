package com.kamir.practice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kamir.practice.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{
    
}
