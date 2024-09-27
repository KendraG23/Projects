package ch_02;

import java.util.Scanner;

/*  Compute the volume of a cylinder
 * INPUT User will input radius and length
 * STORE/TRACK user input(s) for future calculation usage
 * CALCULATE
 * 		area = radius * radius * PI
 * 		volume = area * length
 * DISPLAY
 * 		"The area is " + area
 * 		"The volume is " + volume
 * 
 */

public class Problem2_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the radius and length of a cylinder: " );
		double radius = input.nextDouble();
		int length = input.nextInt();
		
		double area;
		double volume;
		
		area = radius * radius * Math.PI;
		volume = area * length;
		
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
		
		input.close();
	}
	
}
