package ch_02;

import java.util.Scanner;

/* Financial Application (Compound Value)
 * INPUT User will enter a monthly savings amount
 * CALCULATE value after 6months of savings
 * DISPLAY 	6 month value
 * 		5% Annual Rate
 * 		6 Month investment time
 */

public class Problem2_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the monthly spending amount: ");
		
		double savingAmount = input.nextDouble();
		int investingPeriod = 6;
		final double RATE = 0.05/12;
		double rateFactor = 1 + RATE;
		double value = 0;
		
		while (investingPeriod != 0) {
			value = (value + savingAmount) * rateFactor;
			--investingPeriod;
		}
		
		System.out.println("After the sixth month, the account value is $");
		System.out.printf("%.2f", value);
input.close();
	}

}
