package exceptions;

@SuppressWarnings("serial")
public class InvalidPreFinalGradeException extends Exception {
	public InvalidPreFinalGradeException(){
		super("Invalid prefinal grade. Make sure that it is an integer "
				+ "between 1-100 only");
	}

}
