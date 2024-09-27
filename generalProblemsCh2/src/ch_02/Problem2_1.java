package ch_02;

import java.util.Scanner;

/* Create a calculator to convert Celsius to Fahrenheit
 * INPUT accept user input in double value
 * TRACK VARIABLE CHANGE store user input for future calculation
 * CONVERT user input of C to F
 * 		FORMULA F = (9/5) * C + 32
 * DISPLAY print conversion results
 * 
 */

public class Problem2_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a degree in Celsius: ");
		double celsius = input.nextDouble();
		
		double fahrenheit = (9.0 / 5.0) * celsius + 32;
		
		System.out.println(celsius + " Celsius is " + fahrenheit);
		
		
	
		input.close();	

	}
 
}
