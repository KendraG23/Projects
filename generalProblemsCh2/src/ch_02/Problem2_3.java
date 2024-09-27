package ch_02;

import java.util.Scanner;

/*Convert Feet into Meters
 * INPUT User will input a value representing feet
 * STORE/TRACK input to be used later in calculation
 * CALCULATE
 * 		CONSTANT 1 FOOT = 0.305 METERS
 * DISPLAY
 * 		INPUT + "feet is " + result + " meters."
 * 
 */

public class Problem2_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a value for feet: ");
		double feet = input.nextDouble();
		
		final double CONVERSION_RATE = 0.305;
		double meters;
		
		meters = feet * CONVERSION_RATE;
		
		System.out.println(feet + " feet is " + meters + " meters.");
	
		input.close();
	}

}
