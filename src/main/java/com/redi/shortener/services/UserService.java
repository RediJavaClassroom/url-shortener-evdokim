package com.redi.shortener.services;

import com.redi.shortener.model.User;
import com.redi.shortener.model.UserRegistration;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

//@Service
public class UserService {
  private final Map<UUID, User> users = new ConcurrentHashMap<>();
  public User create(final UserRegistration registration) {
    final UUID id = UUID.randomUUID();
    final User user = new User(id, registration.name(), registration.email());
    users.put(id, user);
    return user;
  }

  public User get(final UUID userId) {
    return users.get(userId);
  }
}
