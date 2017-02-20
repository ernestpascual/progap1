package controller;


//import all classes
import java.io.IOException;

import model.Car;
import view.Display;
import utility.Reader;


public class AccessCar {

	public static void main(String[] args) throws IOException {
		// to create an on object in Java, use the new keyword
		// THe new keyword means object instantiation
		// using new, the car object is fully initialized
		
		Car car = new Car();
		
		car.name = Reader.readString("Enter car name: ");
		car.model = Reader.readInt("Enter year model: ");
		car.color = Reader.readString("Enter color: ");
		car.manufacturer = Reader.readString("Enter manufacturer: ");
		
		String transmissionType =
				Reader.readString("Is it automatic? (y/n) ");
		car.isAutomatic = (transmissionType.toUpperCase().equals("Y"))
				? true
				:false;
		
		Display.print(car);
		String decision = Reader.readString("\nDo you want to continue? (y/n)");
	    if (decision.toUpperCase().equals("Y")){
	    	main(null);
	    } else {
	    	System.out.println("\nBye!");
	    }

	}
	

	
		
	    
	    
		
	}


