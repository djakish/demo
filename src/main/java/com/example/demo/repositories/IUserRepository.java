package com.example.demo.repositories;

import java.util.List;

import com.example.demo.dto.User;

public interface IUserRepository {
    void save(User user);
    User findById(Long id);
    User findUserByEmail(String email);
    User findUserByName(String name);
    List<User> findAll();
}