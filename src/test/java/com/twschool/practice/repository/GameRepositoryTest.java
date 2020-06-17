package com.twschool.practice.repository;

import com.twschool.practice.domain.GuessNumberGame;
import com.twschool.practice.domain.RandomAnswerGenerator;
import org.junit.Assert;
import org.junit.Test;

public class GameRepositoryTest {
    @Test
    public void should_return_game_when_get_user_from_repository() {
        GuessNumberGame guessNumberGame = new GuessNumberGame(new RandomAnswerGenerator());
        String id = "test";
        GameRepository gameRepository = new GameRepository();
        gameRepository.set(id, guessNumberGame);
        Assert.assertEquals(guessNumberGame, gameRepository.get(id));
    }
}
