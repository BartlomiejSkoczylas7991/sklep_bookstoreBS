package com.example.ksiegarniabs.services;

import com.example.ksiegarniabs.User.User;
import com.example.ksiegarniabs.dao.UserDAO;
import com.example.ksiegarniabs.entity.Ksiazka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;
    @Override
    @Transactional
    public List<User> getUsers() {
        List<User> users = userDAO.getUsers();
        return users;
    }
    @Override
    @Transactional
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }
}
