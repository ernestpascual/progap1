package controller;

import java.io.IOException;

import utility.Reader;



public class KeyboardInputDemo {

		public static void main(String[] args)
		throws IOException {
			//must also throw IO exception, import java.io.IOException
			String name = Reader.readString("Enter your name: ");
			int age = Reader.readInt("Enter your age: ");
			
			String message = (age > 12)
					?"You will be allowed to vote in the 2022 National Elections"
							:"You are NOT allowed to vote in the 2022 National Elections";
			
			System.out.println("Hello, " + name);
			System.out.println(message);
		}
}	
