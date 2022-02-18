package com.example.microservicegateway.service;

import com.example.microservicegateway.model.User;

public interface AuthenticationService {
    User signInAndReturnJwt(User signInRequest);
}
