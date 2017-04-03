package exceptions;

public class InvalidYearLevelException extends Exception {

	// created a constructor
	public InvalidYearLevelException(){
		// output error message
		super("Invalid input value for the year level.");
	}
}
