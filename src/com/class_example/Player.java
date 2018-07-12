package com.class_example;

import java.lang.reflect.Array;

public class Player {
    private Card[] currentHand = new Card[5];
    private int currentScore;
    private String name;
    private String playerStatus;

    public Player(String name) {
        this.name = name;
    }

    private int cardCount = 0;

    public boolean addCard(Card card) {
        if (!card.getDealt()) {
            currentHand[cardCount] = card;
            currentScore += card.getValue();
            determineStatus();
            return true;
        } else
            return false;
    }

    private void determineStatus(){
        if(currentScore < 17) {
            this.playerStatus = "hit";
        } else if(currentScore > 21 ) {
            this.playerStatus = "bust";
        } else {
            this.playerStatus = "stick";
        }
    }

    public String getPlayerStatus() {
        return playerStatus;
    }

    public Card[] getCurrentHand() {
        return currentHand;
    }

    public int getCurrentScore() {
        return currentScore;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return (this.getName() + "'s score: " + this.getCurrentScore() + " (" + this.getPlayerStatus() + ")");
    }
}
