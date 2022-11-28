package com.company;

import java.io.Console;
import java.util.*;


public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        CardRanks cardRanks = CardRanks.valueOf(s.nextLine());
        CardSuits cardSuits = CardSuits.valueOf(s.nextLine());

        Card card = new Card(cardSuits,cardRanks);

        System.out.printf("Card name: %s of %s; Card power: %d", card.getCardRanks(),card.getCardSuits(), card.getPower());

    }
}
