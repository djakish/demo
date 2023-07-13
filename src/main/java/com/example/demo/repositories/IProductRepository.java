package com.example.demo.repositories;

import java.util.List;

import com.example.demo.dto.Product;

public interface IProductRepository {
    void save(Product product);
    Product findById(Long id);
    List<Product> findAll();
}
