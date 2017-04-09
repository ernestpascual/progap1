package model;

import exceptions.InvalidCreditCardException;


public class ValidateCreditCard extends StoreDetails {
	
	
	// TODO: method over method to check for exceptions
	public static boolean luhnTest(String number){
        int s1 = 0, s2 = 0;
        String reverse = new StringBuffer(number).reverse().toString();
        for(int i = 0 ;i < reverse.length();i++){
            int digit = Character.digit(reverse.charAt(i), 10);
            if(i % 2 == 0){//this is for odd digits, they are 1-indexed in the algorithm
                s1 += digit;
            }else{//add 2 * digit for 0-4, add 2 * digit - 9 for 5-9
                s2 += 2 * digit;
                if(digit >= 5){
                    s2 -= 9;
                }
            }
        }
        return (s1 + s2) % 10 == 0;
    }

	
	public void validateNumber() throws InvalidCreditCardException{
		if(getCreditCardNumber().length() != 16)
		{
			throw new InvalidCreditCardException();
			
		}
		}
	
	
}
