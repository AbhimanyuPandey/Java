package threadsCollectioframeworkGarbageCollection;

import java.util.Random;

public class Assignment1 {
public static void main(String[] args) {
	for(int i = 0;i<5;i++) {
		Random r = new Random();
		int num = r.nextInt(10);
		Thread t1 = new Thread() {
			public void run() {
				System.out.println("Number: "+num);
			}
		};
		Thread t2 = new Thread() {
			int fact = 1;
			public void run() {
				
				for(int j = 1;j<=num;j++) {
					fact = fact*j;
				}
				System.out.println("Factorial of "+num+" is :"+fact);
			}
		};
		t1.run();
		t2.run();
	}
}
}
