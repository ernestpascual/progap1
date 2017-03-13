package model;

public class Parent {
// default constructor - 
// the name is the same name as a class name and does not contain any data type
//JVM will make a default constructor that contains nothing
	
	public Parent(){
		System.out.println("This is a Parent"
				+ "class default constructor.");
	}
	

	public void displayName(){
		System.out.println("This is the parent class.");
	}
}
