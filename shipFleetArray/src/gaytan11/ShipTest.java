//KendraG23
//Pseudocode
/*
 * Create a program that will create various Ship types.
 * Data of Ship objects will be stored within an Array and ArrayList.
 * Create a method called shipShow
 * 		Accept an ArrayList "fleet" 
 * 		Remove CargoShip object with declaration type Ship
 * 		Add WarShip object into ArrayList
 * 		Then use a foreach loop to scan ArrayList and print information
 * 			And COUNT the number of Ship objects isAfloat = False, return the count.
 */
package gaytan11;

import java.util.ArrayList;
import java.util.Arrays;

public class ShipTest {

	public static void main(String[] args) {
		/* Create instances of multiple Ship types.  They will have a various declared
		 * types and actual types.
		 */
		Ship ship1 = new CruiseShip("Magic", 1998, true, 2700, "Caribbean");
		Ship ship2 = new CruiseShip("Titanic", 1912, false, 1300, "Atlantic Ocean");
		Ship cargo1 = new CargoShip("El Faro", 1974, false, "containers", 391);
		CargoShip cargo2 = new CargoShip("Seawise Giant", 1979, false, "crude oil", 564763);
		WarShip warship1 = new WarShip("USS Nimitz", 1972, true, "super carrier", "United States Navy");

		// Create an array named "fleet" and add data from each object
		Ship[] fleet = {ship1, ship2, cargo1, cargo2, warship1};
		
		// Display all ship information by having code scan through "fleet" list
		System.out.println("AN ARRAY OF SHIPS IN MAIN");
		for (int i = 0; i < fleet.length; i++) {
			System.out.println(fleet[i]);
		}
		// Create an ArrayList of type Ship (Superclass) with the just created "fleet" array.
		// Convert the "fleet" array into a list to be used within ArrayList
		ArrayList<Ship>  fleetArrayList = new ArrayList<>(Arrays.asList(fleet));
		
		// Pass the new fleetArrayList to shipShow method.
		System.out.println("ARRAYLIST OF SHIPS FROM A METHOD");
		int notAfloat = shipShow(fleetArrayList); 
		System.out.println(notAfloat + " of these ships sank! ");
		}
		
		
	
	
		// Create a method named shipShow
		public static int shipShow (ArrayList<Ship> fleetAList) {
			// remove CargoShip w/ declared type Ship
			Ship removeShip = null;
			for (Ship ship : fleetAList) {
				if (ship instanceof Ship && ship instanceof CargoShip) {
					removeShip = ship;
					break;
				}
			}
			if (removeShip != null) {
				fleetAList.remove(removeShip);
			}
			//Add new WarShip object to ArrayList
			fleetAList.add(new WarShip("USS John Warner", 2015, true, "attack submarine", "United States Navy"));
			
			//Print new information in ArrayList and keep track of ships not at sea.  Return this number to be printed.
			int notAFloat = 0;
			for (Ship ship : fleetAList) {
				System.out.println(ship);
				if (!ship.isAfloat()) {
					notAFloat+=1;
				}
			}
			return notAFloat;
		
	}
}