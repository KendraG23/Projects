package craps;

public class CrapsGame {
	private Dice dice1;
	private Dice dice2;
	
	public CrapsGame() {
		dice1 = new Dice();
		dice2 = new Dice();
	}
	public void play() {
		int point;
		int sum = rollDice();
		
//		if (sum == 2 || sum == 3 || sum == 12) {
//			System.out.println("You Lose!");
//		}
//		else if (sum == 7 || sum == 11) {
//			System.out.println("You Win!");
//		}
//		else {
//			point = sum;
//			System.out.println("Point is "+ point);
//			sum = rollDice();
//			
//			while(sum != 7 && sum != point) {
//				sum = rollDice();
//			}
//			if (sum == point) {
//				System.out.println("You Win!");
//			}
//			else {
//				System.out.println("You Lose!");
//			}
//		}
		switch(sum) {
			case 2, 3, 12:
				System.out.println("You Lose!");
				break;
			case 7, 11:
				System.out.println("You Win!");
				break;
			default:
				point = sum;
				System.out.println("Point is "+ point);				
				sum = rollDice();
				
				while(sum != 7 && sum != point) {					
					sum = rollDice();
				}
				if (sum == point) {
					System.out.println("You Win!");
				}
				else {
					System.out.println("You Lose!");
				}
				break;
		}
	
	}
	
	private int rollDice() {
		int roll1 = dice1.roll();
		int roll2 = dice2.roll();
		int sum = roll1 + roll2;
		System.out.println("You rolled "+ roll1 + " + "+roll2+" = "+sum);
		return sum;
	}
}
