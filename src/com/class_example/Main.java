package com.class_example;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Card[] deck = Deck.getTheDeck().getCardList();

        for(Card card: deck){
            System.out.println(card.getName() + " of " + card.getSuitType() + " (" + card.getValue() + ")");
        }

    }
}
