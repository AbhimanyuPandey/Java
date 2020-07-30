package ExceptionsStringConcepts;

public class Assignment2 {
	public static void main(String[] args) throws NumberFormatException {
		try {
			String name1 = args[0];
			int num1 = Integer.parseInt(args[1]);
			int num2 = Integer.parseInt(args[2]);
			int num3 = Integer.parseInt(args[3]);
			String name2 = args[4];
			int num4 = Integer.parseInt(args[5]);
			int num5 = Integer.parseInt(args[6]);
			int num6 = Integer.parseInt(args[7]);
			double avg = (num1+num2+num3+num4+num5+num6)/2;
			System.out.println("the average marks of "+name1+" and "+name2+"is: "+avg);
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
			System.out.println("Please enter marks in integer");
		}
		
	}

}
