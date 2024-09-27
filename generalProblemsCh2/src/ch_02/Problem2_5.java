package ch_02;

import java.util.Scanner;

/*Financial Application: Calculate Tip
 * INPUT Use will enter "sub total" & "gratuity rate"
 * STORE/TRACK user input(s) to be used for calculation
 * CALCULATE 
 * 		Tip Amount = Subtotal * Gratuity Rate;
 * 		Total = Sub Total + Tip Amount;
 * DISPLAY
 * 	"The gratuity is ___ and total is ___"
 * 
 */

public class Problem2_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the subtotal and " + 
		"gratuity rate: ");
		
		double subtotal = input.nextDouble();
		double gratuity = input.nextDouble();
		
		double totalTip = subtotal * (gratuity/100);
		double total = subtotal + totalTip;
		
		System.out.print("The gratuity is $");
		System.out.printf("%.2f", totalTip);
		System.out.print("\nThe total is $");
		System.out.printf("%.2f", total);
				
				
input.close();
	}

}
