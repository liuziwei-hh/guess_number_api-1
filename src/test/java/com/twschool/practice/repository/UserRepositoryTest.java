package com.twschool.practice.repository;

import com.twschool.practice.domain.User;
import org.junit.Assert;
import org.junit.Test;

public class UserRepositoryTest {
    @Test
    public void should_return_user_when_get_user_from_repository_by_id() {
        UserRepository userRepository = new UserRepository();
        String id = "test";
        User u = new User(id);
        userRepository.set(id, u);
        Assert.assertEquals(u, userRepository.get(id));
    }
}
