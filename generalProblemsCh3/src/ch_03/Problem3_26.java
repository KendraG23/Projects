package ch_03;

import java.util.Scanner;

/*Use &&, ||, and ^ Operators
 * Determine if user input is
 *  - EVENLY divisible by 5 && 6
 *  - IF divisible by 5 or|| 6
 *  - IF divisible by 5 ^ 6, but NOT BOTH
 * DISPLAY results with True or False answers
 * 
 */

public class Problem3_26 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter an integer: ");
		
		int userValue = input.nextInt();
		
	boolean x = (userValue % 5 == 0) && (userValue % 6 == 0);
	boolean y = (userValue % 5 == 0) || (userValue % 6 == 0);
	boolean z = (userValue % 5 == 0) ^ (userValue % 6 == 0);
	
	System.out.println("Is " + userValue + " divisible by 5 and 6? " + x);
	System.out.println("Is " + userValue + " divisible by 5 or 6? " + y);
	System.out.println("Is " + userValue + " divisible by 5 or 6, but not both? " + z);

	
	input.close();
	}

}
