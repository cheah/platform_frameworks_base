package com.ucast;

public final class SimpleUcastResponse {

    private String name;
    private int result;

    public SimpleUcastResponse(String name, int result) {
        this.name = name;
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public int getResult() {
        return result;
    }
}