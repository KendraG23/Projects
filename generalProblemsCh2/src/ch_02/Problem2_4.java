package ch_02;

import java.util.Scanner;

/*Convert Pounds (LBS) to Kilograms (KG)
 * INPUT User will input a value representing pounds
 * STORE/TRACK input to be used later in calculation
 * CALCULATE
 * 		CONSTANT 1 POUND = 0.454 KILOGRAMS
 * DISPLAY
 * 	"INPUT + " pounds is " + result + " kilograms."
 */

public class Problem2_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter a number in pounds: ");
		double pounds = input.nextDouble();
		
		final double CONVERSION_RATE = 0.454;
		double kilograms;
		
		kilograms = pounds * CONVERSION_RATE;
		
		System.out.println(pounds + " pounds is " + kilograms + " kilograms.");
		
input.close();
	}

}
