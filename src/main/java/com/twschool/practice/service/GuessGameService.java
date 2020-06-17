package com.twschool.practice.service;

import com.twschool.practice.domain.GuessNumberGame;
import com.twschool.practice.domain.RandomAnswerGenerator;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class GuessGameService {

    private GuessNumberGame guessNumberGame;

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
}
