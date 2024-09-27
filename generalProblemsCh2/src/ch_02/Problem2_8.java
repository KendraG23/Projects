package ch_02;

import java.util.Scanner;

/*Current time calculator
 * Using Listing 2.7, revise the code to 
 * INPUT User will input time zone offset to GMT
 * DISPLAY the time based on time zone entered
 */

public class Problem2_8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the time zone offset to GMT: ");
		
		int offset = input.nextInt();
		
		//Current time in milliseconds since 12:00 AM 1/1/1970
		long totalMilliseconds = System.currentTimeMillis();
		
		//Convert milliseconds into seconds since 1/1/1970
		long totalSeconds = totalMilliseconds / 1000;
		
			//Get the current second (remainder) in the min in the hour
			//17:31:XX GMT
			long currentSecond = totalSeconds % 60;
		
		//Calculate the total minutes 
		long totalMinutes = totalSeconds / 60;
		
			//Get the current minute in the hour Ex. 17:XX:08 GMT
			long currentMinute = totalMinutes % 60;
			
		//Calculate the total hours
		long totalHours = totalMinutes / 60;
			
			//Get the current hour Ex. XX:31:08 GMT
			long currentHour = totalHours % 24;
			
			//Convert the current hour to the desired zone
			currentHour += offset;
			
		System.out.println("The current time is " + currentHour +
				":" + currentMinute + ":" + currentSecond);
		
		input.close();
		
	}

}
