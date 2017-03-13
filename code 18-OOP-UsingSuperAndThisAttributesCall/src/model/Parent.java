package model;

public class Parent {
// default constructor - 

	public String className 
		= "Parent class";
	
	public Parent(){
		System.out.println("This is a Parent"
				+ "class default constructor.");
	}
	
	public void displayName(){
		System.out.print("This is " + className);
	}
	
	
}
