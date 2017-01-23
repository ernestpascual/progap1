package dls.csb.proap1.demo;

public class HelloWorld {

	public static void main(String[] args) {   // entry point of execution
		// TODO Auto-generated method stub
		
		// Hello world sequence
		/*
		System.out.println("Hello World");
		System.out.println("Learning and programming Java is fun.");
		System.out.println("programmed by ernest");
		System.out.println("DLS-CSB");
		System.out.println("Adding 5 and 3" + " is " + (5+3));
		*/
		
		//data types
		/*
		byte number1 = 10;
		short number2 = 15;
		int number3 = 100;
		long number4 = 1500 + number1 + number2 + number3;
		float number5 = 10.0F;
		double number6 = 10.0;
		System.out.println("Value of byte is " + number1);
		System.out.println("Value of short is " + number2);
		System.out.println("Value of int is " + number3);
		System.out.println("Value of long is " + number4);
		
		*/
		
		

		
		// Print out the ASCII table
		System.out.println("Dec\t ASCII");
		for (int counter=0; counter < 256; counter ++){
			System.out.println(counter +"\t" + (char)counter);
		}
		
	}

}
