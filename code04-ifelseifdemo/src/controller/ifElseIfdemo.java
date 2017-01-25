package controller;

import utility.Reader;
import java.io.*;


public class ifElseIfdemo {

	public static void main(String[] args) 
		throws IOException{
			String school = Reader
					.readString("What is your team in UAAP?")
					.toUpperCase();
			// toUpperCase() converts everything to upper case letters
			// To compare strings in Java use the equals() method [compares exact case sensitivity] or the equalsIgnoreCase() [regardless of the case]

	if (school.equals("DLSU")){
		System.out.println("It's the DLSU Green Archers.");
	}else if (school.equals("UP")){
		System.out.println("It's the UP Fighting Maroons.");
	}else if (school.equals("ADMU")){
		System.out.println("It's the ADMU Blue Eagles.");
	}else if (school.equals("UST")){
		System.out.println("It's the UST Growling Tigers.");
	}else if (school.equals("ADU")){
		System.out.println("It's the Adamson Soaring Falcons.");
	}else if (school.equals("NU")){
		System.out.println("It's the NU Bulldogs.");
	}else if (school.equals("FEU")){
		System.out.println("It's the FEU Tamaraws.");
	} else if (school.equals("UE")){
		System.out.println("It's the UE Red Warriors.");
	}else {
		System.out.println("That " + school + " is not a member school of UAAP.");
	}
	
	
	}

	}

