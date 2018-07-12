package com.class_example;

public class Deck {
    private Suits hearts = Suits.Hearts;
    private Suits spades = Suits.Spades;
    private Suits clubs = Suits.Clubs;
    private Suits diamonds = Suits.Diamonds;

    private Card[] cardList = new Card[52];

    private Deck() {
        int i = 0;
        for (Suits suit : Suits.values()) {
            for (CardNums card: CardNums.values()){
                cardList[i] = new Card(suit.toString(), card.toString(), card.getValue());
                i++;
            }
        }
    }

    private static Deck theDeck = new Deck();

    public Card[] getCardList(){
        return cardList;
    }

    public static Deck getTheDeck(){
        return theDeck;
    }

}
