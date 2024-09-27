package ch_03;

import java.util.Random;

public class Problem3_24a {
	private static String card = "";
	private static String suit = "";

	public static void main(String[] args) {
		int randomCardNumber = new Random().nextInt(53);
		if (randomCardNumber == 0) {
			randomCardNumber = 1;
		}
		System.out.println("Random card whole number is: " + randomCardNumber);
		getSuit(randomCardNumber);
		System.out.println("The card you picked is " + card + " of " + suit);

	}
	
	// Methods used to retrieve suit. Method will also call
	// another method to retrieve card value.
	static void getSuit(int randomCardNumber) {
		if (randomCardNumber <= 13) {
			suit = "Clubs";
		}
		else if (randomCardNumber <= 26) {
			suit = "Diamonds";
		}
		else if (randomCardNumber <= 39) {
			suit = "Heart";
		}
		else {
			suit = "Spades";
		}
		card = getValue(randomCardNumber);
	}

	static String getValue(int randomCardNumber) {
		int cardValue = randomCardNumber % 13; //Removes the suit from the card number
		if (cardValue == 1) {
			return "Ace";
		}else if (cardValue == 11) {
			return "Jack";
		}else if (cardValue == 12) {
			return "Queen";
		}else if (cardValue ==0) {
			return "King";
		}else {
			return String.valueOf(cardValue);
		}
	}

}
