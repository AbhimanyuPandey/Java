package ExceptionsStringConcepts;

public class Assignment3 {
public static void main(String[] args) throws IndexOutOfBoundsException{
	try {
		double avg = 0;
		for (int i = 0; i < 5; i++) {
			avg = +Integer.parseInt(args[i]);
		}
		avg/=5;
		System.out.println("The average of 5 numbers is: "+avg);
	} catch (IndexOutOfBoundsException e) {
		System.out.println(e.getMessage());
		System.out.println("Please enter 5 numbers");
	}
	
}
}
