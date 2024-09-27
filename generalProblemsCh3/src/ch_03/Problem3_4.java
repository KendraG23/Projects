package ch_03;

/*Random month
 * Program will automatically generate a number 1-12
 * Based on number generated will display associated month
 */

public class Problem3_4 {

	public static void main(String[] args) {
		
		System.out.println("The program will generate a random number, between 1 - 12");
		
		int randomNumber = (int)(Math.random()*12);
		String randomMonth;
		
		switch (randomNumber) {
			case 1: randomMonth = "January"; break;
			case 2: randomMonth = "February";break;
			case 3: randomMonth = "March";break;
			case 4: randomMonth = "April";break;
			case 5: randomMonth = "May";break;
			case 6: randomMonth = "June";break;
			case 7: randomMonth = "July";break;
			case 8: randomMonth = "August";break;
			case 9: randomMonth = "September";break;
			case 10: randomMonth = "October";break;
			case 11: randomMonth = "November";break;
			case 12: randomMonth = "December";break;
			default: randomMonth = "Invalid Number, re-run program";break;
		}

		System.out.println("The random number is " + randomNumber);
		System.out.println("The associated month is " + randomMonth);
	}

}
