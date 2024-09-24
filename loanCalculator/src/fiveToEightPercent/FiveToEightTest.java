package fiveToEightPercent;

import java.util.Scanner;

public class FiveToEightTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Loan Amount: ");
		double loanAmount = input.nextDouble();
		

		System.out.println("Number of Years: ");
		int numberOfYears = input.nextInt();
		
		FiveToEight loan = new FiveToEight(loanAmount,numberOfYears);
		loan.displayResults();
		
		
		input.close();
		
		

	}

}
