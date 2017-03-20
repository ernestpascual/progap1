package model;

public class Vehicle {
	public String name;
	public int year;
	public String color;
	public String manufacturer;
	public double price;
	
	private Engine engine;
	
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void printDetails(){
		System.out.println("Name: " + year + " " + name);
		System.out.println("Manufacturer: " + manufacturer);
		System.out.println("Color: " + color);
		System.out.println("Price: " + price);
	}

}
