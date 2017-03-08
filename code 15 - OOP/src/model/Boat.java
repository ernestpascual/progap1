package model;

public class Boat extends Vehicle {
private int speed;
private int passengers;
private String purpose;

public int getSpeed() {
	return speed;
}

public void setSpeed(int speed) {
	this.speed = speed;
}

public int getPassengers() {
	return passengers;
}

public void setPassengers(int passengers) {
	this.passengers = passengers;
}

public String getPurpose() {
	return purpose;
}

public void setPurpose(String purpose) {
	this.purpose = purpose;
}

public Engine getEngine() {
	return engine;
}

public void setEngine(Engine engine) {
	this.engine = engine;
}

private Engine engine;
}
