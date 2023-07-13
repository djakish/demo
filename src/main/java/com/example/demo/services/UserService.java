package com.example.demo.services;

import com.example.demo.dto.User;
import com.example.demo.repositories.OrderRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.repositories.UserRepository;

public class UserService {
    private final UserRepository userRepository;
    private final ProductRepository productRepository;
    private final OrderRepository orderRepository;

    public UserService() {
        this.userRepository = UserRepository.builder().build();
        this.productRepository = ProductRepository.builder().build();;
        this.orderRepository = OrderRepository.builder().build();;
    }

    public User findUserByName(String name) {
        return userRepository.findUserByName(name);
    }

    public void addUser(String name) {
        User user = new User();
        user.setId(123L);
        user.setEmail("");
        user.setName(name);
        userRepository.save(user);
    }
    
}
