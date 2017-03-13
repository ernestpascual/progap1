package model;

public class Child extends Parent {
	
	public Child(){
		System.out.println("This is the Child class default constructor.");
	}
	
	@Override
	public void displayName(){
		System.out.println("This is the Child class.");
	}
}
