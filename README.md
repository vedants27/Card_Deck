# Card_Deck #

## Description ##

This is a Java-based Card Deck Management System that allows users to perform various operations on a standard deck of 52 playing cards. The program implements functionalities such as creating a deck, shuffling, searching, dealing cards, and comparing cards.


## Features ##

1.Create Deck - Generates a standard deck of 52 cards.

2.Print Deck - Displays all cards in the deck.

3.Print a Specific Card - Shows a card based on position.

4.Find Cards of Same Suit - Displays all cards that belong to a given suit.

5.Compare Two Cards - Checks if two cards have the same rank.

6.Search for a Specific Card - Finds and displays a specific card based on rank and suit.

7.Deal 5 Random Cards - Deals five random cards from the deck.

8.Shuffle Deck - Randomizes the order of the deck.


## How to Run the Program ##
1: Clone the Repository 
git clone https://github.com/vedants27/Card_Deck.git
cd Card_Deck

2:Compile the Java Files
javac Main.java

3:Run the Program
java Main


## Code Structure ##
Card_Deck:
 Main.java
 Deck.java
 Card.java
 README.md


## Methods and Their Descriptions ##

## 1. Deck.java ##

-createDeck(): Initializes a deck of 52 playing cards.

-printDeck(): Displays all cards in the deck.

-printCard(int index): Prints a specific card from the deck using its position.

-sameCard(String suit): Displays all cards belonging to a specific suit.

-compareCard(Card card1, Card card2): Compares two cards by rank.

-findCard(String rank, String suit): Searches for a specific card in the deck.

-dealCard(): Deals 5 random cards from the deck.

-shuffleDeck(): Randomizes the order of cards in the deck.

## 2. Card.java ##

-Card(String rank, String suit): Constructor to initialize rank and suit.

-toString(): Returns a formatted string representation of a card.

## 3. Main.java ##

-Menu-Driven User Interaction

-Prompts the user for various deck operations.

-Handles incorrect inputs and provides clear output messages.


## Example Usage ##


![image](https://github.com/user-attachments/assets/992a2e07-c70c-4045-9637-ac4f416e27b2)









