package exceptions;

public class InvalidCreditCardException extends Exception {
	public InvalidCreditCardException(){
		super("\nInvalid credit card number! Please check the number you entered.\n");
	}

}
