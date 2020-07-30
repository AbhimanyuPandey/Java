package threadsCollectioframeworkGarbageCollection;

import java.util.HashMap;
import java.util.*;
public class Assignment4 {
public static void main(String[] args) {
	HashMap<String, String> map = new HashMap<>();
	map.put("Abhimanyu", "9064477801");
	map.put("Abhishek","872371678");
	map.put("Shivantu", "983227346");
	Scanner sc = new Scanner(System.in);
	String name = sc.nextLine();
	if(map.containsKey(name)) {
		System.out.println("The phone number corresponding to the given name is :"+map.get(name));
	}
	else
		System.out.println("The name doesnot exist in Phonebook");
	
}
}
