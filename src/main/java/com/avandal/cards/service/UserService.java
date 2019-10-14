package com.avandal.cards.service;

import com.avandal.cards.model.User;

import java.util.Optional;

public interface UserService {
    Optional<User> getUserByUsername(String username);
}
