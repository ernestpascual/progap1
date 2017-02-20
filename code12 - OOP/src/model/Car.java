package model;

public class Car {
	
// instance variables -- member data initialization
public String name;
public int model;
public String color;
public String manufacturer;
public boolean isAutomatic;

// instance methods
public void start(){
	System.out.println("\nThe " + model + " " + name
			+" is starting.");
}

public void accelerate(){
	System.out.println("\nThe " + model + " " + name
			+" is accelerating.");
}

public void brake(){
	System.out.println("\nThe " + model + " " + name
			+" is slowing down.");
}

public void stop(){
	System.out.println("\nThe " + model + " " + name
			+" stopped.");
}


public Car(){
	// member data initialization
	System.out.println("default construtor executed");
	name = "no car name defined";
	color = "no color name defined";
	manufacturer = "no manufacturer defined";
	
}
}
