//KendraG23
/*
 * The follow code will create a SUB class of (Ship) type War Ship.
 * It will contain private data fields type and nation.
 * The constructor CruisShip, which will create an object w/ parameters.
 * Method(s):
 * 	toString - Print general information about WarShip object.
 */
package gaytan11;

public class WarShip extends Ship {
	// Private date fields
	private String type;
	private String nation;
	// Constructor to create War Ship object
	public WarShip (String name, int year, boolean isAfloat, String type, String nation) {
		super (name, year, isAfloat);
		this.type = type;
		this.nation = nation;
	}
	/* Retrieve some general information about the WarShip object, remember toString()
	 * method must override the toString method in Super class.  This method should
	 * add additional information to the Super class toString()
	 */
	@Override
	public String toString() {
		return super.toString()+ "\nType: " + type + ", operated by " + nation + "\n";
	}
}
