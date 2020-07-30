package threadsCollectioframeworkGarbageCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeDB {
	public boolean addEmployee(Employee e, ArrayList arr) {
		arr.add(e);
		return true;
	}
	public boolean deleteEmployee(String empid, ArrayList arr) {
		Iterator<Employee> i = arr.iterator();
		while(i.hasNext()) {
			Employee e = i.next();
			if (e.empid == empid) {
				arr.remove(e);
				return true;
			}
			
		}
		return false;
	}
public String showPayslip(String empid, ArrayList arr) {
		Iterator<Employee> i = arr.iterator();
		while(i.hasNext()) {
			Employee e = i.next();
			if (e.empid == empid) {
				return " The salary of the employee is ;"+ e.salary;
			}
		}
		return "Employee not found";
	}
public void listAll(ArrayList arr) {
	Iterator<Employee> i = arr.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	
}
public static void main(String[] args) {
	EmployeeDB  d = new EmployeeDB();
	ArrayList<Employee> arr = new ArrayList<Employee>(5);
	arr.add(new Employee("Abhishek","10",24000,"DAAI"));
	arr.add(new Employee("Abhimanyu","11", 35000, "MFG"));
	arr.add(new Employee("Pandey","12", 12000,"MFG"));
	if(d.addEmployee(new Employee("ShahRukh","13",55000,"Acting"), arr)) {
		System.out.println("Employee added Successfully");
	}
	if(d.deleteEmployee("12", arr)) {
		System.out.println("Employee deleted successfully");
	}
	System.out.println(d.showPayslip("13", arr));
	d.listAll(arr);
	
}
}
