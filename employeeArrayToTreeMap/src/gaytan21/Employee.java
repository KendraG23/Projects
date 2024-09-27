//KendraG23
/*
 * Pseudocode
 * Copy of Employee class from Chapter 20 assignment
 */

package gaytan21;

public class Employee {
	// Private data fields
	private String id;
	private String lastName;
	private String firstName;
	private int salary;
	
	//Employee constructor method to create an object of type Employee
	public Employee (String id, String lastName, String firstName, int salary){
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.salary = salary;
	}
	
	//Getter methods to retrieve information about object
	public String getID(){
		return id;
	}

	public String getLastName(){
		return lastName;
	}

	public String getFirstName(){
		return firstName;
	}

	public int getSalary(){
		return salary;
	}
// Remember toString() method is located within super Object class, therefore we need to override method
// to insert new properties.  Convert the int salary to double so it can display correctly
@Override
public String toString(){
	return "ID " + id + ":" + lastName + ", " + firstName + ", " + "SALARY $" + String.format("%,.2f", (double)salary);
}
}


