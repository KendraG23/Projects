package craps;

import java.util.Random;

public class Dice {
	private Random diceValue;
	
	public Dice() {
		diceValue = new Random();
	}
	public int roll() {
		return diceValue.nextInt(6)+1; //Roll action to get random value between 1 - 6
	}
}
