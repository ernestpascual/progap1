package exceptions;

public class InvalidPurchaseQuantityException extends Exception {
	public InvalidPurchaseQuantityException(){
		super("Invalid quantity! Try again.");
	}

}
