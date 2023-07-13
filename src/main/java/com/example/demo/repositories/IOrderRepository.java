package com.example.demo.repositories;

import java.util.List;

import com.example.demo.dto.Order;

public interface IOrderRepository {
    void save(Order order);
    Order findById(Long id);
    List<Order> findAll();
    List<Order> findOrdersByProductId(Long productId);
}
