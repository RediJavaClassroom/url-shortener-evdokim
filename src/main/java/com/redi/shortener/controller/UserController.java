package com.redi.shortener.controller;

import com.redi.shortener.model.User;
import com.redi.shortener.model.UserRegistration;
import com.redi.shortener.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class UserController {
    @Autowired UserService service;

    @PostMapping("/users") // RESTful API
    public User post(@RequestBody final UserRegistration registration) {
        return service.create(registration);
    }

    @GetMapping("/users/{id}")
    public User get(@PathVariable final UUID id) {
        return service.get(id);
    }
}
