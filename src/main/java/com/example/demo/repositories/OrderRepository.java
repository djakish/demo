package com.example.demo.repositories;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.Order;
import com.example.demo.dto.User;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderRepository implements IOrderRepository {
    private List<Order> orders = new ArrayList();
    

    @Override
    public void save(Order order) {
        orders.add(order);
    }

    @Override
    public Order findById(Long id) {
        for(Order order: orders) {
            if(order.getId() == id){
                return order;
            }
        }
        return null;
    }

    @Override
    public List<Order> findAll() {
        return orders;
    }

    @Override
    public List<Order> findOrdersByProductId(Long productId) {
        List<Order> match = new ArrayList<>();
        for(Order order: orders) {
            if(order.getProductId() == productId){
                match.add(order);
            }
        }
        return match;
    }
    
}
