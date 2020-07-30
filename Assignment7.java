package JVMConcepts;
import java.util.*;
public class Assignment7 {
	public static int fact(int num) {
		if (num == 0)
			return 1;
		else
			return num*fact(num-1);
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	System.out.println("The factorial of given number is :"+fact(num));
	
}
}
