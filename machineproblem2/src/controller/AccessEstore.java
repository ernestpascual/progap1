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
			StorePrices price = new StorePrices(order);
			// TODO: set price for the getVat() and getTotalPayment() to function
			StoreDetails payment = new StoreDetails(order, orderAmount);
			receiptPrint.printTotals(payment);
			
			// TODO: Handle credit card validation and exception
			
		} catch(InvalidMenuItemException imie){
			System.err.println(imie.getMessage());
			main(args);
		} catch(InvalidPurchaseQuantityException ipqe){
			System.err.println(ipqe.getMessage());
			main(args);
		}catch(IOException ioe){
			System.err.println(ioe.getMessage());
			main(args);
		}
	}
}
