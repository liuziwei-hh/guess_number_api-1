package com.twschool.practice.domain;

/**
 * 积分类
 * */
public class Integration {

    private static final int ONCE_ADD_STEP = 3;

    private int point;

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public void addPoint() {
        this.point += 3;
    }
}
