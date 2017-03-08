package model;

public class Car extends Vehicle {
private int numberOfWheels;
public int getNumberOfWheels() {
	return numberOfWheels;
}


public int getPassengers() {
	return passengers;
}


public void setPassengers(int passengers) {
	this.passengers = passengers;
}


public String getType() {
	return type;
}


public void setType(String type) {
	this.type = type;
}


public void setNumberOfWheels(int numberOfWheels) {
	this.numberOfWheels = numberOfWheels;
}



private int passengers;
private String type;



private Engine engine;



public Engine getEngine() {
	return engine;
}



public void setEngine(Engine engine) {
	this.engine = engine;
}

}
