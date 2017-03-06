package controller;
import java.io.IOException;

import model.EmployeeSalary;
import view.display;
import utility.Reader;

public class AccessEmployeeSalary {

	public static void main(String[] args) throws IOException {

		double hoursWorked = Reader.readDouble("Enter hours worked: ");
		double payRate = Reader.readDouble("Enter rate per hour: ");
	
		
		// create object 
		EmployeeSalary employee = new EmployeeSalary();
		
		
		// call all setter method for input
		
		employee.setHoursWorked(hoursWorked);
		employee.setPayRate(payRate);
		
		
		// call the compute salary
		employee.computeSalary();
		
		display.print(employee);
		
		

	}

}
