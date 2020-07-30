package JVMConcepts;
import java.util.*;
public class Assignment5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int sum = 0;
	for (int i = 0; i < 4; i++) {
		sum+=num%10;
		num = num/10;
	}
	System.out.println("The sum of digits is: "+sum);
	}
}
