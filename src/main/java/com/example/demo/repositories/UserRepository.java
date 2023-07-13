package com.example.demo.repositories;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.User;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserRepository implements IUserRepository {
    @Builder.Default
    private List<User> users = new ArrayList();

    @Override
    public void save(User user) {
        users.add(user);
    }

    @Override
    public User findById(Long id) {
        for(User user: users) {
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }

    @Override
    public User findUserByEmail(String email) {
        for(User user: users) {
            if(user.getEmail() == email){
                return user;
            }
        }
        return null;
    }

    @Override
    public User findUserByName(String name) {
        for(User user: users) {
            if(user.getName() == name){
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    // Implement the methods of UserRepository interface
}
