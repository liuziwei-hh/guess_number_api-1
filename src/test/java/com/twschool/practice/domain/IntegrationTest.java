package com.twschool.practice.domain;

import org.junit.Assert;
import org.junit.Test;

/**
 * 积分测试类
 * */
public class IntegrationTest {

    @Test
    public void should_return_0_when_get_point_with_init_Integration() {
        Integration i = new Integration();
        Assert.assertEquals(0, i.getPoint());
    }

    @Test
    public void should_return_3_when_execute_method_addPoint() {
        Integration i = new Integration();
        i.addPoint();
        Assert.assertEquals(3, i.getPoint());
    }

    @Test
    public void should_return_11_when_execute_3_times_method_addPoint() {
        Integration i = new Integration();
        i.addPoint();
        i.addPoint();
        i.addPoint();
        Assert.assertEquals(11, i.getPoint());
    }

    @Test
    public void should_return_20_when_execute_5_times_method_addPoint() {
        Integration i = new Integration();
        i.addPoint();
        i.addPoint();
        i.addPoint();
        i.addPoint();
        i.addPoint();
        Assert.assertEquals(20, i.getPoint());
    }
}
