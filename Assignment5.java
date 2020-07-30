package ExceptionsStringConcepts;
import java.util.*;
public class Assignment5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String sentence = sc.nextLine();
	String c = sc.nextLine();
	int diff = sentence.length() - sentence.replace(c, "").length();
	System.out.println("The number of occurences of "+c+" is :"+diff);
	}
}
