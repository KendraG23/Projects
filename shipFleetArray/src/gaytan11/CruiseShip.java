//KendraG23
/*
 * The follow code will create a SUB class of (Ship) type Cruise Ship.
 * It will contain private data fields passengers and zone.
 * The constructor CruisShip, which will create an object w/ parameters.
 * Method(s):
 * 	getter - retrieve # of passengers of CruiseShip object.
 * 	getter - retrieve zone operation of CruiseShip object.
 * 	toString - Print general information about CruiseShip object.
 */
package gaytan11;

public class CruiseShip extends Ship {
	// Private data fields, can only be used within CruiseShip class
	private int passengers;
	private String zone;
	
	// Constructor of CruiseShip object
	public CruiseShip (String name, int year, boolean isAfloat, int passengers, String zone) {
		/* Some parameters will be inherited from super class. 
		 * New parameters added as it relates to CruiseShip objects only. 
		 */
		super(name, year, isAfloat);
		this.passengers = passengers;
		this.zone = zone;
	}
	// Methods within the CruiseShip class.
	// Retrieve the amount of passengers on CruiseShip object.
	public int getPassengers() {
		return passengers;
	}
	// Retrieve the operation location on CruiseShip object.
	public String getZone() {
		return zone;
	}
	/* Retrieve some general information about the CruiseShip object, remember toString()
	 * method must override the toString method in Super class.  This method should
	 * add additional information to the Super class toString()
	 */
	@Override 
	public String toString() {
		return super.toString() + "\n"
				+ passengers + " passenger capacity, operating in the " +
				zone + "\n";
	}
}
