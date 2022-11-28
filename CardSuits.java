package com.company;

public enum CardSuits {
    CLUBS(0),
    DIAMONDS(13),
    HEARDS(26),
    SPADES(39);

    private int suitPower;

    CardSuits(int suitPower){
        this.suitPower = suitPower;
    }

    public int getSuitPower(){
        return suitPower;
    }
}
