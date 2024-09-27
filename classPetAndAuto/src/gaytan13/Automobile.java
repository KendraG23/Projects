// KendraG23
// Psuedocode
/* Code will create a data class named Automobile w/ various attributes / methods
 *  -implement Comparable interface
 *  -data fields
 *    -String make
 *		-String model
 *    -int year
 *    -double price
 *  -constructor
 *  -getter method (make, model, year, and price)
 *  -@override String toString method displays all attributes of object
 *  -Implement comparable using Year as criteria for comparing instances
 */

package gaytan13;

public class Automobile implements Comparable<Automobile> {
	//Private data fields
		
		private String make;
		private String model;
		private int year;
		private double price;
		// Constructor of an Automobile object
		public Automobile(String make, String model, int year, double price){
			this.make = make;
			this.model = model;
			this.year = year;
			this.price = price;
		}
		// All getter methods of the Pet class
		public String getMake(){
			return make;
		}

		public String getModel(){
			return model;
		}

		public int getYear(){
			return year;
		}
	
		public double getPrice(){
			return price;
		}
		//Overrides the toString() method from Object class
		@Override
		public String toString(){
			return "Make: " + make + " Model: " + model + " Year: " + year + " Price: " + price;
		}

		//Define Comparable interface that the Automobile class objects will have share
		//Must override the compareTo() method (located in Comparable) so it fits the problem needed.
		@Override
		public int compareTo(Automobile object){
			if (getYear() > object.getYear())
				return 1;
			else if (getYear() < object.getYear())
				return -1;
			else 
				return 0; 
		}
}
