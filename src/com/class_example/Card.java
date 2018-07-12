package com.class_example;

public class Card {
    private String name;
    private int value;
    public Card(String name) {
        this.name = name.toLowerCase();
        setValue();
    }

    private void setValue() {
        switch(this.name) {
            case "king": case "jack": case "queen":
                this.value = 10;
                break;
            case "Ace":
                this.value = 11;
                break;
            default:
                this.value = Integer.parseInt(this.name);
                break;
        }
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
