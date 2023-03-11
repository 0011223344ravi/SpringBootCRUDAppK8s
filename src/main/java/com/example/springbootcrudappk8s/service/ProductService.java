package com.example.springbootcrudappk8s.service;



import com.example.springbootcrudappk8s.entity.Product;

import java.util.List;


public interface ProductService {

    List<Product> getAllProducts();

    Product insertProductIntoDatabase(Product product);
}
