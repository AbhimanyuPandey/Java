package JVMConcepts;
import java.util.*;
public class Assignment3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int minutes = sc.nextInt();
	double days = minutes/(24*60);
	double years = days/365;
	System.out.println("No. of days : "+days);
	System.out.println("NO. of years : "+years);
}
}
