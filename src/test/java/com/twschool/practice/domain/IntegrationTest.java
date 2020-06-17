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
        executeAddPointByCount(i, 1);
        Assert.assertEquals(3, i.getPoint());
    }

    @Test
    public void should_return_11_when_execute_3_times_method_addPoint() {
        Integration i = new Integration();
        executeAddPointByCount(i, 3);
        Assert.assertEquals(11, i.getPoint());
    }

    @Test
    public void should_return_20_when_execute_5_times_method_addPoint() {
        Integration i = new Integration();
        executeAddPointByCount(i, 5);
        Assert.assertEquals(20, i.getPoint());
    }

    @Test
    public void should_return_31_when_execute_8_times_method_addPoint() {
        Integration i = new Integration();
        executeAddPointByCount(i, 8);
        Assert.assertEquals(31, i.getPoint());
    }

    @Test
    public void should_return_40_when_execute_10_times_method_addPoint() {
        Integration i = new Integration();
        executeAddPointByCount(i, 10);
        Assert.assertEquals(40, i.getPoint());
    }

    @Test
    public void should_return_burden_3_when_execute_subPoint() {
        Integration i = new Integration();
        i.subPoint();
        Assert.assertEquals(-3, i.getPoint());
    }

    @Test
    public void should_return_6_when_execute_2_times_addPoint_and_execute_subPoint_and_execute_addPoint() {
        Integration i = new Integration();
        i.addPoint();
        i.addPoint();
        i.subPoint();
        i.addPoint();
        Assert.assertEquals(6, i.getPoint());
    }

    @Test
    public void should_return_14_when_execute_2_times_addPoint_and_execute_subPoint_and_execute_3_times_addPoint() {
        Integration i = new Integration();
        i.addPoint();
        i.addPoint();
        i.subPoint();
        i.addPoint();
        i.addPoint();
        i.addPoint();
        Assert.assertEquals(14, i.getPoint());
    }

    private void executeAddPointByCount(Integration integration, int count) {
        for (int i = 0; i < count; i++) {
            integration.addPoint();
        }
    }
}
