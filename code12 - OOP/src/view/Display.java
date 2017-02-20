package view;

//display the car objects

import model.Car;
public class Display {
	public static void print(Car kotse){ // kotse is the object
		// the dot symbol is being used to access 
		// the attributes and methods of an object
		System.out.println("\nName: " + kotse.model + " " + kotse.name);
		System.out.println("Color: "  + kotse.color);
		System.out.println("Transmission type: " + ((kotse.isAutomatic) ? "Automatic" : "Manual"));
		
		// now print the capabilities of the car;
		kotse.start();
		kotse.accelerate();
		kotse.brake();
		kotse.stop();
		
	}
	

}
