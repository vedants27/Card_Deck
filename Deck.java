// Deck.java 

import java.util.ArrayList;
import java.util.Collections;

class Deck {
    ArrayList<Card> deck;

    public Deck() {
        this.deck = new ArrayList<>();
    }
    // Method to create a deck
    public void createDeck() {
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
        String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };

        for (String rank : ranks) {
            for (String suit : suits) {
                deck.add(new Card(rank, suit));
            }
        }
    }


}

