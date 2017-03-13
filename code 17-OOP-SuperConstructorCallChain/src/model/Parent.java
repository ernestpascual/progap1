package model;

public class Parent {
// default constructor - 
// the name is the same name as a class name and does not contain any data type
//JVM will make a default constructor that contains nothing
	
	public Parent(){
		System.out.println("Parent constructor 1 - no parameter");
	}
	
	public Parent(int number){
	
		System.out.println("Parent constructor 2 - int parameter");
	}
	
	public Parent(String word){
		System.out.println("Parent constructor 3 - String parameter");
	}
	
	public Parent(String word,int number){
		System.out.println("Parent constructor 4 - String and int parameter");
	}
	
	public Parent(int number, String word){
		System.out.println("Parent constructor 5 - String and int parameter");
	}
	

	public void displayName(){
		System.out.println("This is the parent class.");
	}
}
