package com.twschool.practice.service;

import com.twschool.practice.domain.GuessNumberGame;
import com.twschool.practice.domain.RandomAnswerGenerator;
import com.twschool.practice.domain.User;
import com.twschool.practice.repository.GameRepository;
import com.twschool.practice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class GuessGameService {

    private GuessNumberGame guessNumberGame;

    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private UserRepository userRepository;

    public String guess(String userAnswerString) {
        startGame();
        List<String> userAnswer = Arrays.asList(userAnswerString.split(" "));
        return guessNumberGame.guess(userAnswer);
    }

    public void startGame() {
        if (guessNumberGame == null) {
            guessNumberGame = new GuessNumberGame(new RandomAnswerGenerator());
        }
    }

    public boolean startGame(String id) {
        if (gameRepository.get(id) != null && userRepository.get(id) != null) {
            return false;
        }
        User user = new User(id);
        userRepository.set(id, user);
        gameRepository.set(id, new GuessNumberGame(new RandomAnswerGenerator()));
        return true;
    }
}
