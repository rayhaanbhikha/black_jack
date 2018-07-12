package com.class_example;

public class Card {
    private String name;
    private int value;
    private String suitType;
    public Card(String suitType, String name, int value) {
        this.name = name;
        this.value = value;
        this.suitType = suitType;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public String getSuitType() {
        return suitType;
    }
}
