package com.example.ksiegarniabs.dao;

import com.example.ksiegarniabs.User.User;


import java.util.List;

public interface UserDAO {
    public List<User> getUsers();
    public void saveUser(User user);
}