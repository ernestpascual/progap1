package exceptions;

public class InvalidPurchaseQuantityException extends Exception {
	public InvalidPurchaseQuantityException(){
		super("\nInvalid quantity! Try again.");
	}

}
