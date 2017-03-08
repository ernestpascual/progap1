package model;

/* This extends keyword represents inheritance in Java. 
 * Please do note it only performs one inheritance at a time.
 *  Multiple class inheritance per class declaration is not
 *  allowed in Java.
 *  
 *  Inheritance in Java represents an IS-A object relationship
 */

public class Airplane extends Vehicle {
	private int numberOfWheels;
	private int wingspan;
	private int passengers;
	
	/*  This example is a HAS-A relationship or composition relationship
	 * - meaning that an object is inside another object.
	 * 
	 * Aside from inheriting methods from its parent class,
	 * Inheritance also promotes additional methods/and/or attributes that can be added
	 * to a child class
	 */

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public int getWingspan() {
		return wingspan;
	}

	public void setWingspan(int wingspan) {
		this.wingspan = wingspan;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	private Engine engine;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
	}

