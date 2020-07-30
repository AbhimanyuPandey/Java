package ExceptionsStringConcepts;

public class Assignment1 {
public static void main(String[] args) throws AgeException {
	String name = args[0];
	int age = Integer.parseInt(args[1]);
	if(age<18||age>=60) {
		AgeException e = new AgeException();
		System.out.println(e.getMessage());
	}
	else
		System.out.println("name = "+name+" and age = "+age);
}
}
