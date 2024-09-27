//KendraG23
//Psuedocode
/*This program will test the Pet class and all subclass/interfaces.
 * First create a new objects of the Reptile class & display
 * Second create an ARRAY of Dog objects.
 * 		SORT the Dog objects by Weight
 * 		Use a FOREACH loop to display Dog objects
 */

package gaytan13;


public class TestPet {

	public static void main(String[] args) {
		// Create an instance of Reptile and display data.
		Pet reptile1 = new Reptile("Charles", 'M', "Boe Constrictor");
		Pet reptile2 = new Reptile("RyAnn", 'F', "Black Mamba");
		System.out.println(reptile1);
		System.out.println(reptile2);
		
		// Create multiple instances of Dog within an Array
		Pet dog1 = new Dog("King", 'M', "American Pit-Bull Terrier", 88);
		Pet dog2 = new Dog("Maestro", 'M', "Black Russian Terrier", 120);
		Pet dog3 = new Dog("Biggie Smalls", 'M', "Pug", 18);
		Pet dog4 = new Dog("Elsa", 'F', "Giant Schnauzer", 75);
		Pet dog5 = new Dog("Freedom",'F', "Belgian Malinois", 60);
		
		// Add Dog object(s) to an Array
		Pet[] dogs = {dog1, dog2, dog3, dog4, dog5};
		
		// Sort the newly created array
		java.util.Arrays.sort(dogs);
		
		// Display all data in the newly created Array.
		System.out.println("\nARRAY OF DOGS SORTED BY WEIGHT");
		for(Pet dog: dogs) {
			System.out.println(dog);
		}
	}

}
