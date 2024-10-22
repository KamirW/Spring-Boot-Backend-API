package com.kamir.practice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kamir.practice.model.Product;

/**
 * This class provides ready-made functions through its parent class of
 * JpaRepository which describes the class we are working with and the
 * type of the primary key.
 * 
 * @author KamirW
 */
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{
    
}
