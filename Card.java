package com.company;

public class Card {

    private CardSuits cardSuits;
    private CardRanks cardRanks;

    public Card(CardSuits cardSuits, CardRanks cardRanks){
        this.cardSuits = cardSuits;
        this.cardRanks = cardRanks;
    }

    public CardRanks getCardRanks() {
        return cardRanks;
    }

    public CardSuits getCardSuits() {
        return cardSuits;
    }

    public int getPower(){
        return cardRanks.getRankPower() + cardSuits.getSuitPower();
    }
}
