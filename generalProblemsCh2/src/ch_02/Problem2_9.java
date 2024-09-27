package ch_02;

import java.util.Scanner;

/*Physics: Acceleration
 * Determine the acceleration over time
 * INPUT user will enter a starting and ending velocity and time
 * CALCULATE the acceleration 
 * 		v0 (starting velocity) meters / sec
 * 		v1 (ending velocity) meter /sec
 * 		t 	seconds
 * 		a = (v1 - v0) / t
 * DISPLAY print the calculated result
 */

public class Problem2_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter v0, v1, and t: ");
		
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();
		
		double acceleration = (v1 - v0)/t;
		
		System.out.printf("The average acceleration is %2.4f ", acceleration);

		input.close();
	}

}
