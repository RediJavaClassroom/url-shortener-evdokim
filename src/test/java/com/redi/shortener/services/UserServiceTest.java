package com.redi.shortener.services;

import com.redi.shortener.model.User;
import com.redi.shortener.model.UserRegistration;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

class UserServiceTest {
    final UserService service = new UserService();

//    @Test
//    void shouldReturnCreatedUser() {
//        final UserRegistration registration = new UserRegistration("Jose", "jose@example.com");
//        final User user = service.create(registration);
//        assertThat(service.get(user.id()), equalTo(user));
//    }
//
//    @Test
//    void shouldCreateRandomIds() {
//        final UserRegistration registration1 = new UserRegistration("Jose", "jose@example.com");
//        final UserRegistration registration2 = new UserRegistration("Pedro", "pedro@example.com");
//        final User user1 = service.create(registration1);
//        final User user2 = service.create(registration2);
//        assertThat(user1.id(), not(equalTo(user2.id())));
//    }
}