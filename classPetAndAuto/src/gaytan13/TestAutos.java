//KendraG23
//Psuedocode
/*Create program named TestAutos
 *Create ArrayList(AL) named Vehicles, insert 5-6 new Automobile objects
 *Use a FOR loop to display all inserted data
 *Next, SORT AL vehicles by year, remember @Override compareTo() method was
 *	updated to compare Objects based on year.
 *Lastly used a foreach loop to display Automobile objects in order by year.
 */


package gaytan13;
import java.util.ArrayList;
public class TestAutos {

	public static void main(String[] args) {
		//Create an ArrayList
 		ArrayList<Automobile> vehicles = new ArrayList<>();
 		
 		//Add new vehicles to array list
 		vehicles.add(new Automobile("Mercedes", "AMG GT63s", 2019, 187957.00));
 		vehicles.add(new Automobile("Cheverolet", "Corvette 3LT", 2024, 83450.00));
 		vehicles.add(new Automobile("BMW", "750li", 2023, 103745.00));
 		vehicles.add(new Automobile("Pontiac", "GTO", 1968, 53900.00));
 		vehicles.add(new Automobile("Dodge", "Challeneger SRT", 2018, 156891.00));
 		vehicles.add(new Automobile("Toyota", "Tacoma Pre-Runner", 2015, 23538.00));
 		
 		//Use a FOR loop to display all vehicles in ArrayList
 		System.out.println("ARRAY LIST OF VEHICLES");
 		for (int i=0; i < vehicles.size(); i++) {
 			System.out.print(vehicles.get(i)+ "\n");
 		}
 			
 		//Sort ArrayList by year, reminder compareTo() method was updated
 		//to compare data by year page.438 of text.
 		java.util.Collections.sort(vehicles);
 		
 		//Display newly sorted ArrayList using foreach loop
 		System.out.println("\nARRAY LIST OF VEHICLES SORTED BY YEAR");
 		for (Automobile vehicle: vehicles){
 			System.out.print(vehicle + " ");
 			System.out.println();
 		}
 		}

	}


