//KendraG23
/*Psuedocode
 * Part 1:  Write a generic method that will take an Array of <generic type> with only 1 argument.
 * 			The method will display the type of generic array entered and its data.  It will also
 * 			print the total amount of elements within the array.  Call this method at least 3x's to test in main.
 * 
 * Par 2:	Using the listAdder() method, write a method that will display all elements within the array.  The 
 * 			method will also display the type of array and the sum of all elements.  Remember the listAdder()
 * 			method will extend to the Number class, therefore only certain subclass elements are allowed to be
 * 			entered as parameters.
 * 
 * Part 3:	Using the max() method with a test program that will retrieve the max element in the array.  The
 * 			program will create 10 random integers, call the max(10integers), display the random numbers in
 * 			smallest to largest order and display the largest element.
 */

package gaytan19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class GenericTest {

	public static void main(String[] args) {
		System.out.println("PART 1 SAMPLE OUTPUT");
		System.out.println("--------------------");
		// Part 1 method test
		Integer[] intArray = {1, 2, 3, 4, 5};
		System.out.println("Here is an Integer array");
		displayArray(intArray);

		String[] stringArray = {"Tampa", "Clearwater", "Largo", "St.Petersburg", "Land O Lakes"};
		System.out.println("Here is a String array");
		displayArray(stringArray);
		
		Double[] doubleArray = {3.33, 5.7, 7.0, 3.28, 0.00, 1.12, 9.333};
		System.out.println("Here is a Double array");
		displayArray(doubleArray);
		
		// Part 2 method test

		System.out.println("PART 2 SAMPLE OUTPUT");
		System.out.println("--------------------");
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(12);
		intList.add(36);
		intList.add(72);
		intList.add(213);
		listAdder(intList);
		System.out.print("\n");
		
		ArrayList<Float> floatList = new ArrayList<>();  //Float is a subclass of Number, however; instanceof check will determine
		floatList.add((float) 12.357);					// if input meets limited requirements.
		floatList.add((float) 3.14);
		floatList.add((float) 1.25);
		floatList.add((float) 1708.33);
		listAdder(floatList);
		System.out.print("\n");
		
		ArrayList<Double> doubleList = new ArrayList<>();
		doubleList.add(3.14);
		doubleList.add(2.3896);
		doubleList.add(6.63);
		doubleList.add(2.2);
		listAdder(doubleList);
		System.out.print("\n");
		
		ArrayList<Byte> byteList = new ArrayList<>();
		byteList.add((byte) 12);
		byteList.add((byte)-128);
		byteList.add((byte)13);
		byteList.add((byte)44);
		listAdder(byteList);
		System.out.print("\n");
		
		// Par 3 method test
		System.out.println("PART 3 SAMPLE OUTPUT");
		System.out.println("--------------------");
		Random nums = new Random();
		Integer[] randomNumbers = new Integer[10]; //Array has a length of 10
		for (int i = 0; i < 10; i++) {
			randomNumbers[i] = nums.nextInt(100);  // Numbers between 0-99
		}
		Integer maxNum = max(randomNumbers); // This is a starting point for searching for max number
		
		Arrays.sort(randomNumbers);
		System.out.println(Arrays.toString(randomNumbers));
		System.out.println("The maxium number is " + maxNum);
	}
	
	
		

	

	
	// Create 3 methods below.  These methods will be called inside the main method.
	// Part 1 method 
	public static <Thing> void displayArray(Thing[] array) {
		for(Thing x: array) {
			System.out.print(x + " ");
			
		}
		
		System.out.println();
		System.out.println("The array held " + array.length + " elements");
		System.out.println();
	}
	// Part 2 method
	/*
	 * The below method currently accepts ArrayList of any type within the Number class.  Only types from
	 * Number class are allowed.  Complete method so it displays list of elements on one line and returns the sum of all elements.
	 */
	public static double listAdder(ArrayList<? extends Number> list) {
			double sum = 0;
			for(Number x : list) {
				System.out.print(x + " ");
				sum += x.doubleValue(); // returns the elements value x as a double. Keeps a running total.
			}
			// Within method lets check for supported data types.
				if(list.get(0) instanceof Integer) {
					System.out.println("\nInteger list totals " + sum);
					}
				else if (list.get(0) instanceof Double) {
					System.out.println("\nDouble list totals " + sum);
					}
				else if (list.get(0) instanceof Byte) {
					System.out.println("\nByte list totals " + sum);
				}
				else
					System.out.println("\nThe above list is not an acceptable type, please revise. ");
			
			return sum;
				
	}
	
	// Part 3 method
	/* Method should return the max of integer
	 */
	 
	public static <E extends Comparable<E>> E max(E[] list) {
			E maxNum = list[0];
			for (E x : list) {
				if (x.compareTo(maxNum)> 0) {
					maxNum = x;
				}
			}
			return maxNum;
	 
	 }
}
