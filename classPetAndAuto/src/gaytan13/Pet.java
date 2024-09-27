//KendraG23
//Psuedocode
/*Create a supper class named Pet (Note: possibly abstract class)
 *Data Fields (String name, char gender, Date acquired)
 *Constructor Pet(String name, char gender, date acquired)
 *Getter Methods
 *		Retrieve pet name String getName()
 *		Retrieve pet gender char getGender()
 *		Retrieve acquired date Date getAcquired()
 *Behavior Method
 *		String sound() (Note: From UML sound() is universal to all Pet object types)
 */
package gaytan13;
import java.util.Date;
public abstract class Pet {
	protected String name;
 	protected char gender;
 	protected java.util.Date acquired;
 	
 	public Pet(String name, char gender){
 		this.name = name;
 		this.gender = gender;
 		acquired = new Date();  //New Date(); creates a current obeject of time.
 	}
 	
 	public String getName(){
 		return name;
 	}
 	
 	public char getGender(){
 		return gender;
 	}
 	
 	public java.util.Date getAcquired(){
 		return acquired;
 	}
 	
 	public abstract String sound();
}
