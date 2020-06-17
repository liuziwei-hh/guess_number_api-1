package com.twschool.practice.repository;

import com.twschool.practice.domain.GuessNumberGame;
import com.twschool.practice.domain.User;

import java.util.HashMap;
import java.util.Map;

public class GameRepository {

    private static final Map<String, GuessNumberGame> gameRepository = new HashMap<>();

    public void set(User u, GuessNumberGame guessNumberGame) {
        gameRepository.put(u.getId(), guessNumberGame);
    }

    public GuessNumberGame get(User u) {
        return gameRepository.get(u.getId());
    }
}
