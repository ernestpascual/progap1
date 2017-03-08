package model;

public class Vehicle {
	public String name;
	public int year;
	public String color;
	public String manufacturer;
	public double price;
	
	public void printDetails(){
		System.out.println("Name: " + year + " " + name);
		System.out.println("MAnufacturer: " + manufacturer);
		System.out.println("Color: " + color);
		System.out.println("Price: " + price);
	}

}
