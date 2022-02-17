package com.example.microservicegateway.service;

import com.example.microservicegateway.model.Role;
import com.example.microservicegateway.model.User;

import java.util.Optional;

public interface UserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void changeRole(Role newRole, String username);
}
