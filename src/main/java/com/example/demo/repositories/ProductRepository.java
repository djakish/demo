package com.example.demo.repositories;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.Product;
import com.example.demo.dto.User;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductRepository implements IProductRepository {
    private List<Product> products = new ArrayList();

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Product findById(Long id) {
        for(Product product: products) {
            if(product.getId() == id){
                return product;
            }
        }
        return null;
    }

    @Override
    public List<Product> findAll() {
        return products;
    }
    
}
