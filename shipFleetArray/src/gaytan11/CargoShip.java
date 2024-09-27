//KendraG23
/*
 * The follow code will create a SUB class of (Ship) type Cargo Ship.
 * It will contain private data fields cargo and capacity.
 * The constructor CruisShip, which will create an object w/ parameters.
 * Method(s):
 * 	toString - Print general information about WarShip object.
 *	getter - Retrieve capacity amount for Warship object/
 */
package gaytan11;

public class CargoShip extends Ship {
	// Private data fields
	private String cargo;
	private int capacity;
	
	// Contractor to create Cargo Ship object
	public CargoShip (String name, int year, boolean isAfloat, String cargo, int capacity) {
		super (name, year, isAfloat);
		this.cargo = cargo;
		this.capacity = capacity;
	}
	// Retrieve capacity number for Cargo Ship object
	public int getcapacity() {
		return capacity;
	}
	/* Retrieve some general information about the CargoShip object, remember toString()
	 * method must override the toString method in Super class.  This method should
	 * add additional information to the Super class toString()
	 */
	public String toString() {
		return super.toString()+ "\nCapacity of " + cargo + " is " + capacity + "\n";
	}
}
