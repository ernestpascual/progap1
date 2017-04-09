package exceptions;

public class InvalidCreditCardException extends Exception {
	public InvalidCreditCardException(){
		super("Invalid credit card number! Please check the number you entered");
	}

}
