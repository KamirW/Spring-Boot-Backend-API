package com.kamir.practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamir.practice.model.Product;
import com.kamir.practice.repo.ProductRepo;

@Service
public class ProductService {

    // We don't want the service to talk to the database or return 
    // hard coded values
    @Autowired
    ProductRepo repo;
    
    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Product getProductById(int id) {
        return repo.findById(id).orElse(null);
    }
}
