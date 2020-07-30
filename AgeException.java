package ExceptionsStringConcepts;

public class AgeException extends Exception{

	public AgeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Please enter age between 18 and 60";
	}
	

}
