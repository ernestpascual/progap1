package view;

import model.EmployeeSalary;

public class display {
	
	public static void print (EmployeeSalary payment){
		System.out.println("\nSalary Detailed Computation");
		System.out.println("Hours worked: " + payment.getHoursWorked());
		System.out.println("Payrate: Php: " + payment.getPayRate());
		System.out.println("Basic Pay: Php: " + payment.getBasicPay());
		System.out.println("Overtime Pay: Php: " + payment.getOvertimePay());
		System.out.println("Gross Pay: Php: " + payment.getGrossPay());
		System.out.println("Witholding Tax: Php: " + payment.getWithHoldingTax());
		System.out.println("Net Pay: Php: " + payment.getNetPay());
	}

}
