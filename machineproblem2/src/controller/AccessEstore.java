package controller;

import exceptions.*;
import view.*;
import utility.Reader;
import java.io.*;


public class AccessEstore {

	public static void main(String[] args) {
		
		IntroDisplay.print();
		try{
			int order = Reader.readInt("Enter item number: ");
			if(order <= 0){
				throw new InvalidMenuItemException();
			}
			int orderAmount = Reader.readInt("Enter quantity: ");
			if(orderAmount <= 0){
				throw new InvalidPurchaseQuantityException();
			}
		} catch(InvalidMenuItemException imie){
			System.err.println(imie.getMessage());
		} catch(InvalidPurchaseQuantityException ipqe){
			System.err.println(ipqe.getMessage());
		}catch(IOException ioe){
			System.err.println(ioe.getMessage());
		}
		
		
		
		

	}

}
