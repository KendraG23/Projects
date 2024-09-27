//KendraG23
/*
 * The follow code will create a Super class of the Ship type.
 * It will contain private data fields name, year, isAfloat.
 * The constructor Ship, which will create an object w/ parameters.
 * Method(s):
 * 	isAfloat True/False
 * 	setter - setAfloat to True/False
 * 	getter - retrieve Name and Year of Ship object
 * 	toString - Print general information about Ship object.
 */

package gaytan11;

public class Ship {
	// Private data fields can only be accessed "directly" within class.
	private String name;
	private int year;
	private boolean isAfloat;
	
	// Constructor of Ship object.
	public Ship (String name, int year, boolean isAfloat) {
		this.name = name;
		this.year = year;
		this.isAfloat = isAfloat;
	}
	// Methods within Ship class, which can be used in future subclasses.
	// True/False is the Ship object at sea?
	public boolean isAfloat() {
		return isAfloat;
	}
	// Set the at sea status to True/False. Does not return data.
	public void setAfloat(boolean isAfloat) {
		this.isAfloat = isAfloat;
	}
	// Get the Ship object name. This is found during constructor process.
	public String getName() {
		return name;
	}
	// Get the Ship object year. This is found during constructor process.
	public int getYear() {
		return year;
	}
	/* Retrieve some general information about the Ship object, remember toString()
	 * method must override the toString default method in Object class.
	 */
	
	public String toString() {
		return "\nShip name: " + name + ", year launched: " + year + ", is a float: "
				+ isAfloat;
	}
}


