package model;

public class Child extends Parent {
	
	public Child(){
		System.out.println("This is the Child class default constructor.");
	}
	
	public Child(int number){
		System.out.println("Child constructor 2 - int parameter");
	}
	
	public Child(String word){
		this("a", 2);
		System.out.println("Child constructor 3 - String parameter");
	}
	
	public Child(String word,int number){
		
		System.out.println("Child constructor 4 - String and int parameter");
	}
	
	public Child(int number, String word){
		System.out.println("Child constructor 5 - String and int parameter");
	}
	@Override
	public void displayName(){
		System.out.println("This is the Child class.");
	}
}
