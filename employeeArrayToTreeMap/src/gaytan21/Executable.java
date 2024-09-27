//KendraG23
/*Pseudocode
 * Create a program that will take a list employees from and ArrayList
 * and convert the list to a TreeMap<String k, Employees v>
 * Display the list of employees ordered by ID
 */
package gaytan21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Executable {

	public static void main(String[] args) {
		//Create an array of 8+ employee objects
		Employee[] newEmployees = {
		new Employee("2096957","Gaytan","Kendra",44320),
		new Employee("2001234","Smith","John",55250),
		new Employee("2019876","Nguyen","Sarah",65700),
		new Employee("2023456","Davis","Michael",70300),
		new Employee("2034567","Brown","Jessica",60800),
		new Employee("2045678","Lee","David",75100),
		new Employee("2067890","Patel","Aiden",62400),
		new Employee("2089012","Nguyen","Ethan",58600),
		new Employee("2090123","Martinez","Olivia",72200),
		new Employee("2056789","Gaytan","Jesse",101950),
		new Employee("2078901","Garcia","Sophia",68900),
		new Employee("2101234","Smith","Emily",57800),
		new Employee("2119876","Johnson","Michael",63500),
		new Employee("2145678","Lee","Sophia",76300) };
				
		//Convert array to an ArrayList
		ArrayList<Employee> employeeList = new ArrayList<>(Arrays.asList(newEmployees));
				
		//Enhanced for loop to print all employees
		//Call the toString() from Employee class
		System.out.println("All Employees");
		System.out.println();
		for (Employee employee : employeeList) {
			System.out.println(employee.toString());
		}
		System.out.println();
		// Create a blank TreeMap to hold employee information
		Map<String, Employee> employeeTreeMap = new TreeMap<>();
		/* Read through the ArrayList and retrieve the ID to place as Key
		 * and the remaining employee data will be considered the Value.
		 * Remember the Value is of the Employee class type.
		 */
		for (Employee employee : employeeList) {
			employeeTreeMap.put(employee.getID(), employee);
		}
		
		/*
		 * Display employees by ID's in ascending order.
		 * Use the forEach method w/lambda expression. 
		 * Reminder TreeMaps are naturally in increasing order by Key
		 * Employee toString() method has preset print template. If you
		 * call toString() method, the employee ID will repeat as ID is 
		 * set to return upon call.  
		 * Printing from a TreeMap w/ forEach() method requires reading through
		 * elements containing key-value pairs.  Since the "value" is of the 
		 * Employee object type, we can access methods to extract individual data
		 * for each Key.
		 */		
		System.out.println("Employees By ID# ");
		System.out.println();
		employeeTreeMap.forEach((id, data)-> System.out.println(
				"ID " + id +": " + data.getLastName()+", " 
				+ data.getFirstName() + ", "
				+ "salary " + String.format("$%,.2f", (double)data.getSalary())	
			));
	}

}
