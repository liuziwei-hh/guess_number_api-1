package com.twschool.practice.repository;

import com.twschool.practice.domain.GuessNumberGame;
import com.twschool.practice.domain.RandomAnswerGenerator;
import com.twschool.practice.domain.User;
import org.junit.Assert;
import org.junit.Test;

public class RepositoryTest {
    @Test
    public void should_return_game_when_get_user_from_repository() {
        GuessNumberGame guessNumberGame = new GuessNumberGame(new RandomAnswerGenerator());
        User u = new User("test");
        GameRepository gameRepository = new GameRepository();
        gameRepository.set(u, guessNumberGame);

        Assert.assertEquals(guessNumberGame, gameRepository.get(u));
    }
}
