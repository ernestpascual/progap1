package model;

public class Child extends Parent {
	
	public String className = "Child class";
	
	
	public Child(){
		System.out.println("This is the Child class default constructor.");
	}
	
	@Override
	public void displayName(){
		System.out.println("This is the " + this.className);
		System.out.println("Please note that this " + this.className 
				+ " is created from its " + super.className);
		System.out.println("The content of the original method is ");
		super.displayName();
	}
}
