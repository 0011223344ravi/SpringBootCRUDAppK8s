package com.example.springbootcrudappk8s.controller;

import com.example.springbootcrudappk8s.entity.Product;
import com.example.springbootcrudappk8s.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/all")
    public List<Product> getAllProductsController() {
        return  productService.getAllProducts();
    }


    @PostMapping("/insert")
    public Product insertProductInDb(@RequestBody Product product) {
        return  productService.insertProductIntoDatabase(product);
    }



}
