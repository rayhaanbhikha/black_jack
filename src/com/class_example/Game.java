package com.class_example;

public class Game {
    private Player[] players = new Player[3];
    private Player currentPlayer;
    private Player winningPlayer;
    private Card[] deck = Deck.getTheDeck().getCardList();

    public Game(){
        players[0] = new Player("Oliver");
        players[1] = new Player("Michael");
        players[2] = new Player("Ray");

        currentPlayer = players[0];
        this.dealCards();
        this.playGame();
        this.outputWinner();

    }

    private void dealCards() {
        for (Player p : players) {
            Card c1 = drawCard();
            Card c2 = drawCard();

            p.addCard(c1);
            p.addCard(c2);

            System.out.println(p.getName() + " drew " + c1.toString());
            System.out.println(p.getName() + " drew " + c2.toString());
            System.out.println(p.toString());
            System.out.println("-----------------------");
        }
    }

    private Card drawCard() {
        Card newCard = deck[Deck.getTopCard()];
        Deck.incTopCard();
        return newCard;
    }

    private void playGame() {
        for(Player p: players){
            while (p.getPlayerStatus() == "hit") {
                Card newCard = drawCard();
                p.addCard(newCard);
                System.out.println(p.getName() + " hit.");
                System.out.println(p.getName() + " drew " + newCard.toString());
            }
            System.out.println(p.toString());
            System.out.println("----------------------");
        }
        System.out.println("----------------------");
        System.out.println(outputWinner());
    }

    private String outputWinner() {
        int winningScore = 0;
        for (Player p : players) {
            if (p.getPlayerStatus() != "bust" && p.getCurrentScore() > winningScore) {
                winningScore = p.getCurrentScore();
                winningPlayer = p;
            }
        }
        if (winningPlayer == null) {
            return "Everybody bust!";
        } else
            return (winningPlayer.getName() + " wins!");
    }

}
