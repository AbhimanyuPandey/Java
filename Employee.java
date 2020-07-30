package threadsCollectioframeworkGarbageCollection;

public class Employee {
	String name;
	String empid;
	double salary;
	String domain;
	public Employee(String name, String empid, double salary, String domain) {
		super();
		this.name = name;
		this.empid = empid;
		this.salary = salary;
		this.domain = domain;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + ", salary=" + salary + ", domain=" + domain + "]";
	}
	

}
