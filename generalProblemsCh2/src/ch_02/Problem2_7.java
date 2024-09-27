package ch_02;

import java.util.Scanner;

/*Find the number of years
 * INPUT user will insert a number representing minutes
 * TRACK/STORE user input for future calculation
 * CALCULATE
 * 		- Convert minutes into days
 * 		- Convert days into years (Assume 365 days per year)
 * DISPLAY "____ minutes is approximately ___ years and ___ days"
 */

public class Problem2_7 {

	public static void main(String[] args) {
		final int MIN_IN_HOURS = 60;
		final int HRS_IN_DAY = 24;
		final int DAYS_IN_YEAR = 365;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of minutes: ");
		int minutes = input.nextInt();
		
		int totalYears = minutes / MIN_IN_HOURS / HRS_IN_DAY / DAYS_IN_YEAR;
		int totalDays = minutes / MIN_IN_HOURS / HRS_IN_DAY % DAYS_IN_YEAR;
		
		
		
		System.out.println(minutes + " minutes is approximately " + totalYears + 
				" years and " + totalDays + " days.");
input.close();
	}

}
