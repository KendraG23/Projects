/*KendraG23
 *Psuedocode
 *Create a program that will have an Employee class and Executable class.
 *You will create a list of employees, with various attributes, and 
 *and interact with the list created via executable class.
 *
 *
*/

package gaytan20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Executable  {

	public static void main(String[] args) {
		//Create an array of 8+ employee objects
		Employee[] newEmployees = {
		new Employee("2026459","Shaw","Kendra",44320),
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
		
		//Sort ArrayList by last name, then by first name.  Print out employees.
		employeeList.sort(Comparator.comparing(Employee :: getLastName).thenComparing(Employee :: getFirstName));
		System.out.println("Employees sorted by last and first name");
		employeeList.forEach(e -> System.out.println(e.toString()));
		System.out.println(" ");
		
		//Create a LinkedList from the ArrayList (clone)
		LinkedList<Employee> linkedList = new LinkedList<Employee>(employeeList);
		
		//Create iterator to cycle forward and backward through LinkedList
		ListIterator<Employee> listIterator = linkedList.listIterator();
		//Iterate forward through list, no output.
		while (listIterator.hasNext()){
			listIterator.next();
		}
		//Iterate backward through list and print in reverse order by names.
		System.out.println("Employees sorted in reverse order");
		while (listIterator.hasPrevious()){
			System.out.println(listIterator.previous());
		}

	}

}
