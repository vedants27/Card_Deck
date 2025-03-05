// Card.java

class Card {
    String rank;
    String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }
     // Method for card representation
    public String toString() {
        return rank + " of " + suit;
    }
}

