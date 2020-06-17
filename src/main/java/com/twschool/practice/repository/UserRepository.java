package com.twschool.practice.repository;

import com.twschool.practice.domain.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private static final Map<String, User> userRepository = new HashMap<>();

    public void set(String id, User u) {
        userRepository.put(id, u);
    }

    public User get(String id) {
        return userRepository.get(id);
    }

}
