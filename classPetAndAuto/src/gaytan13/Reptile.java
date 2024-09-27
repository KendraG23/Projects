//KenddraG23
//Psuedocode
/*Create a sub class named Reptile (Note: From UML Reptile inherits Pet super abstract class)
 *Data Fields (String type)
 *Constructor Reptile(String name, char gender, date acquired, String type)
 *Behavior Methods
 *		How does the reptile String move() (Note: move() is a method in Mobility interface, needs @Override)
 *		What String sound() does the reptile make? (Note: sound() is an abstract method, needs @override)
 *Display features of reptile object with String toString() (Note: toString() is from Object class, needs @override)
 */

package gaytan13;



public class Reptile extends Pet implements Mobility {
 	//Private date fields
 	private String type;
 	
 	//Constructor to create Reptile object
 	public Reptile(String name, char gender, String type){
 		super(name, gender);
 		this.type = type;
 	}
 	
 	//Override move() method from interface
 	@Override
 	public String move() {
 		return "Must be caged, crawls or slithers";}
 		
 	//Override sound() method from super class
 	@Override
 	public String sound() {
 		return "Not much sound, maybe a hiss"; }
 		
 	//Override toString() method from Object Super class
 	@Override
 	public String toString() {
 		return "Reptile name = " + super.getName() + ", " + type + ", " + super.getGender() + "\n"
 				+ move() + "\n" + sound() + ", acquired " + super.getAcquired();
 	}

}
