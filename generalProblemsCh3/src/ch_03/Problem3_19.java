package ch_03;

import java.util.Scanner;

/*Calculate the perimeter of a triangle
 * PROMPT: User to enter 3 side values of a triangle. (s1, s2, s3)
 * STORE/TRACK: Save user inputs to be used in calculation
 * CALCULATION: P = S1 + S2 + S3
 * 		CHECK FOR VALIDITY:
 * 			1. S1 + S2 > S3 OR S1 + S3 > S2 OR S2 + S3 > S1
 * 			2. ELSE "Invalid Input, restart program"
 * DISPLAY: "Valid input, the perimeter of triangle is ___" or "Invalid input, unable to calculate perimeter."
 */

public class Problem3_19 {

	public static void main(String[] args) {
		// Create objects for input space
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length for each side of triangle: ");
		
		// Track inputs and store in separate variables.
		double s1,s2,s3;
		s1 = input.nextDouble();
		s2 = input.nextDouble();
		s3 = input.nextDouble();
		
		// Determine validity of input
		//EVERY pair of two edges MUST BE greater than remaining side
		if ((s1 + s2) > s3 && (s1 + s3) > s2 && (s2 + s3) > s1) {
			double p = s1 + s2+ s3;
			System.out.println("Input is valid.");
			System.out.println("The perimeter of triangle is " + p);
		}
		else {
			System.out.println("Input is invalid, please restart program");
		}
	input.close();	
	}

}
