package JVMConcepts;

public class Assignment6 {
public static void main(String[] args) {
	int[] arr = new int[] {24,89,45,67,4};
	int max = 0;
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]>max)
			max = arr[i];
	}
	System.out.println("The greatest number in the array is : "+max);
}
}
