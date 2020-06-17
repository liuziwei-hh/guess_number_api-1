package com.twschool.practice.domain;

import org.junit.Assert;
import org.junit.Test;

public class UserTest {

    @Test
    public void should_get_user_id_when_init_user_with_userId_is_test() {
        User u = new User();
        u.setId("test");
        Assert.assertEquals("test", u.getId());
    }
}
