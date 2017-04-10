package controller;

import exceptions.*;
import model.*;
import view.*;
import utility.Reader;

import java.io.*;


public class AccessEstore {

	

	public static void main(String[] args) {
		
		IntroDisplay.print();
		try{
			int order = Reader.readInt("Enter item number: ");
			if(order <= 0){
				// if order is zero or negative
				throw new InvalidMenuItemException();
			} else if (order > 10){
				// if menu item number input is greater than the displayed menu
				throw new InvalidMenuItemException();
			} 
			int orderAmount = Reader.readInt("Enter quantity: ");
			if(orderAmount <= 0){
				// quantity is negative or zero
				throw new InvalidPurchaseQuantityException();
			}
			
			// calculating for amount to be paid
			StoreDetails payment = new StoreDetails(orderAmount);
			payment.priceSelector(order);
			payment.computeTotal();
			payment.computeVat();
			payment.computeTotalPayment();
			receiptPrint.printTotals(payment);
			
			// confirm payment
			String proceed = Reader.readString("Proceed to payment? (Y or N): ").toUpperCase();
			if (proceed.equals("Y")){
				String creditCardNumber = Reader.readString("Enter your credit card number: ");
				if (creditCardNumber.length() != 16){
					// if credit card number is not equal to 16
					throw new InvalidCreditCardException();
				} else {
					// validate if credit card number is numeric
				if (isInteger(creditCardNumber)){
					// validate if valid credit card number by luhn's test
				if (ValidateCreditCard.luhnTest(creditCardNumber)){
				System.out.println("Processing....\n\n");
				payment.setCreditCardNumber(creditCardNumber);
				receiptPrint.printReceipt(payment);
				String newOrder = Reader.readString("\n\nNew order? (Y or N)").toUpperCase();
				if (newOrder.equals("Y")){
					main(args);
				}else{
					System.out.println("Thank you for order! Come Again!");
				}
				} else{
					throw new InvalidCreditCardException();
				}
				}else {
					throw new InvalidCreditCardException();
				}
				}
			}else {
				main(args);
			}
			
		// catch exceptions
		} catch(InvalidMenuItemException imie){
			System.err.println(imie.getMessage());
			main(args);
		} catch(InvalidPurchaseQuantityException ipqe){
			System.err.println(ipqe.getMessage());
			main(args);
		}catch(InvalidCreditCardException icce){
			System.err.println(icce.getMessage());
			main(args);
		}
		catch(IOException ioe){
			System.err.println(ioe.getMessage());
			main(args);
		}
		catch (NumberFormatException nfe){
			System.err.println("\nPlease enter a valid integer!\n");
			main(args);
		}
	}
	
	
	// check if the credit card number is numeric
	// source: http://stackoverflow.com/questions/237159
	//         /whats-the-best-way-to-check-to-see-if-a-string-represents-an-integer-in-java
	
	public static boolean isInteger(String str) {
	    if (str == null) {
	        return false;
	    }
	    int length = str.length();
	    if (length == 0) {
	        return false;
	    }
	    int i = 0;
	    if (str.charAt(0) == '-') {
	        if (length == 1) {
	            return false;
	        }
	        i = 1;
	    }
	    for (; i < length; i++) {
	        char c = str.charAt(i);
	        if (c < '0' || c > '9') {
	            return false;
	        }
	    }
	    return true;
	}
	
	
}
