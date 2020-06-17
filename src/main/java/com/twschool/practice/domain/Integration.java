package com.twschool.practice.domain;

/**
 * 积分类
 * */
public class Integration {

    private static final int INIT_WIN_BOUNS_COUNT = 0;
    private static final int ONCE_ADD_STEP = 3;
    private static final int THREE_TIMES_WIN_BOUNS_COUNT = 3;
    private static final int THREE_TIMES_WIN_BOUNS_POINT = 2;
    private static final int FIVE_TIMES_WIN_BOUNS_COUNT = 5;
    private static final int FIVE_TIMES_WIN_BOUNS_POINT = 3;

    private int addCount = INIT_WIN_BOUNS_COUNT;

    private int point;

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public void addPoint() {
        this.point += ONCE_ADD_STEP;
        if (++addCount == THREE_TIMES_WIN_BOUNS_COUNT) {
            this.point += THREE_TIMES_WIN_BOUNS_POINT;
        } else if (addCount == FIVE_TIMES_WIN_BOUNS_COUNT) {
            this.point += FIVE_TIMES_WIN_BOUNS_POINT;
            this.addCount = INIT_WIN_BOUNS_COUNT;
        }
    }
}
