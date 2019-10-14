package com.avandal.cards.service.impl;

import com.avandal.cards.model.User;
import com.avandal.cards.persistence.UserDAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
@Slf4j
public class UserServiceImpl implements UserDetailsService {

    @Autowired
    private UserDAO userDAO;

    public Optional<User> getUserByUsername(String username) {
        return userDAO.getUserByUsername(username);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Objects.requireNonNull(username);
        User user = userDAO.getUserByUsername(username).orElseThrow(() -> new UsernameNotFoundException("Username not found"));
        log.info("user: {}", user);
        return user;
    }
}
