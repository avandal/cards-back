package com.avandal.cards.service.impl;

import com.avandal.cards.model.User;
import com.avandal.cards.persistence.UserDAO;
import com.avandal.cards.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    public Optional<User> getUserByUsername(String username) {
        return userDAO.getUserByUsername(username);
    }
}
