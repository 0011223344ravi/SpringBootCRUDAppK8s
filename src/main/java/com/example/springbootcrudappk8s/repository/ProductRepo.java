package com.example.springbootcrudappk8s.repository;


import com.example.springbootcrudappk8s.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Integer> {
}
