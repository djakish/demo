package com.example.demo.dto;

import java.util.List;

public class User {
    private Long id;
    private String name;
    private String email;
    private List<Order> orders;

    public Long getId(){
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public void deleteOrder(Order order) {
        this.orders.remove(order);
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


