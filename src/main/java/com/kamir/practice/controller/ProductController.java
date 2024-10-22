package com.kamir.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kamir.practice.model.Product;
import com.kamir.practice.service.ProductService;

/**
 * This class is responsible for mapping all endpoints to equivalent functionality
 * 
 * @author KamirW
 */
@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    // We don't want the controller talking to the database directly
    @Autowired
    ProductService service;
    
    // **** Get requests ****
    @GetMapping("/")
    public String greet() {
        return "Hello World";
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() {
        return new ResponseEntity<>(service.getAllProducts(), HttpStatus.OK); 
    }

    @GetMapping("/products/{prodID}")
    public ResponseEntity<Product> getProductById(@PathVariable int prodID) {
        Product product = service.getProductById(prodID);

        if(product != null)
            return new ResponseEntity<>(product, HttpStatus.OK); 
        
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
