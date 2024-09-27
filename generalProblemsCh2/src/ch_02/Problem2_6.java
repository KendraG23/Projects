package ch_02;

import java.util.Scanner;

/* Sum the digits in an integer
 * INPUT user will insert an integer between 0 - 1000
 * TRACK/STORE user input for future calculation
 * CALCULATE read input
 * 		- Use the % and / operator
 * 		- x = 18 % 10 = 8 & a = 18 / 10 = 1
 * 		- sum = x + a
 * DISPLAY "The sum of digits is ___"
 * 
 */

public class Problem2_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number between 0 and 1000: ");
		int value = input.nextInt();
		
		//Extract digits
//		int digit1 = value % 10; //last digit
//		int digit2 = (value / 10) % 10; //second last digit
//		int digit3 = (value / 100) % 10; //third last digit
//		int digit4 = (value / 1000) % 10; //fourth last digit
//		
//		int sum = digit1 + digit2 + digit3 + digit4;
		

//Advanced Code
		//Check the input is valid
		if (value < 0 || value > 1000) {
			System.out.println("Invalid input! Please enter another number.");
		}else {
			//Extract digits and sum them
			int sum = 0; //Initial value
			int remainingValue = value;
			
			while(remainingValue > 0) {
				int digit = remainingValue % 10; //Last digit extracted
				sum += digit; //Add extracted digit to sum
				remainingValue /= 10; //Remove the last digit
			}
			System.out.println("The sum of digits is " + sum);
		}
				
input.close();

	}

}
