package com.twschool.practice.domain;

public class User {

    private String id;
    private Integration integration;

    public User(String id) {
        this.id = id;
        integration = new Integration();
    }

    public String getId() {
        return id;
    }

    public void win() {
        this.integration.addPoint();
    }

    public int getPoint() {
        return this.integration.getPoint();
    }
}
