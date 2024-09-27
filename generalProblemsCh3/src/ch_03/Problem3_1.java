package ch_03;

import java.util.Scanner;

/*Algebra: Solve quadratic equation
 * INPUT User will enter a, b, c values
 * STORE/TRACK user inputs to be used in calculation
 * CALCULATE 
 * 	discriminate = b^2 - 4ac
 * 		if discriminate is positive
 * 			two real roots
 * 		if discriminate is 0
 * 			one real root
 * 		else 
 * 			no real roots
 * DISPLAY result based on discriminate value
 */	

public class Problem3_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a, b, c: ");
		
		double a,b,c;
		 a = input.nextDouble();
		 b = input.nextDouble();
		 c = input.nextDouble();
		 
		 double discriminate = (Math.pow(b, 2))- (4*a*c);
		 
		 double root1 = (-b + Math.pow(discriminate, 0.5)) / (2 * a);
		 double root2 = (-b - Math.pow(discriminate, 0.5)) / (2 * a);
		 
		 if (discriminate > 0) {
			 System.out.println("The equation has two roots " + root1 + " and " + root2);
		 }
		 else if (discriminate == 0) {
			 System.out.println("The equation has one root " + root1);
		 }
		 else {
			 System.out.println("The equation has no real roots");
		 }
input.close();	 
	}

}
