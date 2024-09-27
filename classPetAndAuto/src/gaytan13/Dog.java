//KendraG23
//Psuedocode
/*Create a sub class named Dog (Note: From UML Dog inherits Pet superabstract class)
 *Data Fields (String breed, int weight)
 *Constructor Dog(String name, char gender, date acquired, String breed, int weight)
 *Getter Methods
 *		Retrieve dog breed String getBreed()
 *		Retrieve dog weight int  getWeight()
 *Behavior Methods
 *		How does the dog String move()
 *		What String sound() does the dog make? (Note: sound() is an abstract method, needs @override)
 *Display featured of dog object with String toString() (Note: toString() is from Object class, needs @override)
 *Compare dog objects by weight, with compareTo() method (Note: implement Comparable interface)
 */
package gaytan13;

public class Dog extends Pet implements Cloneable,Comparable<Dog>, Mobility {
	//Protected data fields
	 	protected String breed;			//Need to use Cloaneable interface for date to generate properly
	 	protected int weight;
	 	
	 	//Constructors of an Dog object
	 	public Dog(String name, char gender, String breed, int weight){
	 			super(name, gender);
	 			this.breed = breed;
	 			this.weight = weight;
	 	}
	 	
	 	//Getter methods of the Dog class
	 	public String getBreed(){
	 		return breed;
	 	}
	 	
	 	public int getWeight(){
	 		return weight;
	 	}
	 	//move() is apart of the Mobility interface, must override method to fit characteristics of Dog
	 	@Override
	 	public String move(){
	 		return "Walks on a leash";
	 	}
	 	
	 	//sound() is an abstract method of Pet, therefore MUST be used and overridden
	 	@Override
	 	public String sound(){
	 		return "Barks or howls";
	 	}
	 	
	 	//toString() is a method defaulted in the Object class, must be overridden
	 	@Override
	 	public String toString(){
	 		return "Dog Name = " + super.getName() + ", " + breed + ", " + super.getGender() + "\n" + move()
	 						+ ", Weight " + weight + "\n"
	 						+ sound() + ", acquired " + super.getAcquired();
	 	}
	 	
	 	//Compare objects based on weight of each dog
	 	@Override
	 	public int compareTo(Dog object){
	 		if (getWeight() > object.getWeight())
	 			return 1;
	 		else if (getWeight() < object.getWeight())
	 			return -1;
	 		else 
	 			return 0;
	 	}
}
