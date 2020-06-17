package com.twschool.practice.domain;

import org.junit.Assert;
import org.junit.Test;

public class UserTest {

    @Test
    public void should_get_user_id_when_init_user_with_userId_is_test() {
        User u = new User("test");
        Assert.assertEquals("test", u.getId());
    }

    @Test
    public void should_return_3_when_user_win_1() {
        User u = new User("test");
        u.win();
        Assert.assertEquals(3, u.getPoint());
    }

    @Test
    public void should_return_11_when_user_win_3() {
        User u = new User("test");
        u.win();
        u.win();
        u.win();
        Assert.assertEquals(11, u.getPoint());
    }

    @Test
    public void should_return_20_when_user_win_5() {
        User u = new User("test");
        u.win();
        u.win();
        u.win();
        u.win();
        u.win();
        Assert.assertEquals(20, u.getPoint());
    }

    @Test
    public void should_return_31_when_user_win_8() {
        User u = new User("test");
        u.win();
        u.win();
        u.win();
        u.win();
        u.win();
        u.win();
        u.win();
        u.win();
        Assert.assertEquals(31, u.getPoint());
    }

    @Test
    public void should_return_40_when_user_win_10() {
        User u = new User("test");
        u.win();
        u.win();
        u.win();
        u.win();
        u.win();
        u.win();
        u.win();
        u.win();
        u.win();
        u.win();
        Assert.assertEquals(40, u.getPoint());
    }

}
