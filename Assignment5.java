package threadsCollectioframeworkGarbageCollection;

import java.util.HashSet;
import java.util.Iterator;

public class Assignment5 {
public static void main(String[] args) {
	HashSet<Employee> arr = new HashSet<Employee>();
	arr.add(new Employee("Abhishek","10",24000,"DAAI"));
	arr.add(new Employee("Abhimanyu","11", 35000, "MFG"));
	arr.add(new Employee("Pandey","12", 12000,"MFG"));
	Iterator<Employee> i = arr.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
}
}
