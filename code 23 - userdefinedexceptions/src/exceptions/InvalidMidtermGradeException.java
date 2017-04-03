package exceptions;

public class InvalidMidtermGradeException extends Exception {
	public InvalidMidtermGradeException(){
		super("Invalid midterm raw grade. Make sure that it is an integer "
				+ "between 1-100 only");
	}
	
	
}
