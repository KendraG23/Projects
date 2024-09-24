package futureValue;

/*
 * The below code determines future value of investment based upon
 * Principal = Initial amount invested
 * Term = years invested
 * Interest Rate = Percentage earned on invested.
 * 
 * Calculator will report the future value at the end of each
 * year invested.
 */

import java.util.Scanner;

public class FutureValue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("The amount invested: ");
		double principal = input.nextDouble();
		System.out.println("Annual interest Rate: ");
		double interestRate = input.nextDouble();
		System.out.println("Years invested: ");
		int year = input.nextInt();
		
		double monthlyRate = interestRate/1200;
		
		futureValue(principal,monthlyRate,year);
		
		input.close();
	}
		

	public static void futureValue(double principal, double monthlyRate, int year) {
		System.out.printf("%-20s%-20s\n","Year","Future Value");
		for(int i = 1; i <= year; i++) {
				double fv = principal * Math.pow(1+monthlyRate, i * 12);
				System.out.printf("%-20d$%-19.2f\n",i,fv);
			}
		}

}
