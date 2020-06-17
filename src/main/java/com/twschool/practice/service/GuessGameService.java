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

    private static final String CORRECT_RESULT = "4A0B";

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

    public boolean isExistUser(String id) {
        return startGame(id);
    }

    public String guess(String id, String userAnswerString) {
        String result = this.gameRepository.get(id).guess(Arrays.asList(userAnswerString.split(" ")));
        User u  = this.userRepository.get(id);
        if (CORRECT_RESULT.equals(result)) {
            u.win();
        } else {
            u.lose();
        }
        return result;
    }

    public User getUser(String id) {
        return this.userRepository.get(id);
    }
}
