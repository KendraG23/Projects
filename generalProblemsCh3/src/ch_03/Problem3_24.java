package ch_03;

public class Problem3_24 {

	public static void main(String[] args) {
		System.out.println("This program will pick a random card from a deck of cards.");
		
		int rank = (int)(Math.random()*12);
		String rankValue = null;
		
		int suit = (int)(Math.random()*4);
		String suitType = null;
		
		switch (rank) {
			case 0: rankValue = "Ace"; break;
			case 1: rankValue = "2"; break;
			case 2: rankValue = "3"; break;
			case 3: rankValue = "4"; break;
			case 4: rankValue = "5"; break;
			case 5: rankValue = "6"; break;
			case 6: rankValue = "7"; break;
			case 7: rankValue = "8"; break;
			case 8: rankValue = "9"; break;
			case 9: rankValue = "10"; break;
			case 10: rankValue = "Jack"; break;
			case 11: rankValue = "Queen"; break;
			case 12: rankValue = "King"; break;
		}
		
		switch (suit) {
			case 0: suitType = "Clubs"; break;
			case 1: suitType = "Diamonds"; break;
			case 2: suitType = "Hearts"; break;
			case 3: suitType = "Spades"; break;
		}

		System.out.println(rankValue + " of " + suitType);
	}

}
