package exceptions;

public class InvalidMenuItemException extends Exception {
	public InvalidMenuItemException(){
		super("\nInvalid Menu item! Try again.\n");
	}
	
	
}
