package fiveToEightPercent;

/*
 * Calculator will determine monthly loan payment based on re-payment years
 * with a scaled interest rate from 5% to 8%, incrementing by 0.125%
 */

public class FiveToEight {
	private int numberOfYears;
	private double loanAmount;
	private double MIN_INTEREST = 5.000;
	private double MAX_INTEREST = 8.000;
	
	public FiveToEight(double loanAmount, int numberOfYears) {
		this.loanAmount = loanAmount;
		this.numberOfYears = numberOfYears;
	}
	
	public void displayResults() {
		System.out.printf("%-20s%-20s%-20s\n","Interest Rate","Monthly Payment","Total Payment");
		for (double i = MIN_INTEREST; i <= MAX_INTEREST; i += 0.125 ) {
			double monthlyRate = i / 1200;
			double monthlyPymt = loanAmount * monthlyRate /
					(1 -1 / Math.pow(1+monthlyRate, numberOfYears*12));
			double totalPymt = monthlyPymt * numberOfYears * 12;
			System.out.printf("%-20.3f%-20.2f%-20.2f\n",i,monthlyPymt,totalPymt);
		}
	}
}
