package com.example.ksiegarniabs.services;

import com.example.ksiegarniabs.User.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    public void saveUser(User user);
}
