package com.class_example;

public class Card {
    private String name;
    private int value;
    private String suitType;
    private boolean dealt;
    public Card(String suitType, String name, int value) {
        this.name = name;
        this.value = value;
        this.suitType = suitType;
        this.dealt = false;
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

    public void setDealt(boolean d) {
        this.dealt = d;
    }

    public boolean getDealt() {
        return this.dealt;
    }

    public String toString() {
        return (this.name + " of " + this.suitType + " (" + this.value + ")");
    }

}
