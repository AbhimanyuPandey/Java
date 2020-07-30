package ExceptionsStringConcepts;
import java.util.*;
public class Assignment4 {
static boolean isPal(String s) {
	int i =0;
	int j = s.length()-1;
	while(i<j) {
		if(s.charAt(i)!=s.charAt(j))
			return false;
		i++;
		j--;
	}
	return true;
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	String t = s.toLowerCase();
	if(isPal(t))
		System.out.println("The String is Palindrome");
	else
		System.out.println("The String is not Palindrome");
}
}
