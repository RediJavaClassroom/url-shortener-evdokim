package com.redi.shortener.services;

import com.redi.shortener.model.User;
import com.redi.shortener.model.UserRegistration;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final Map<UUID, User> users = new ConcurrentHashMap<>();

    public User create(final UserRegistration registration) {
        final UUID id = UUID.randomUUID();
        if (users.values().stream().anyMatch(user -> user.email().equals(registration.email()))) {
            throw new RuntimeException("User already exists:" + id);
        }
        final User user = new User(id, registration.name(), registration.email());
        users.put(id, user);
        return user;
    }

    public User get(final UUID userId) {
        return users.get(userId);
    }
}
