package model;

public class EmployeeSalary {
	// they are encapsulated to protect data
	// use set; get; (setter and getter)
	// fond of using setter and getter methods
	
	// input values
	
	private double hoursWorked;
	private double payRate;
	
	// computed values
	private double basicPay;
	private double overtimePay;
	private double grossPay;
	private double withHoldingTax;
	private double netPay;
	
	// setter and getter methods
	public void setHoursWorked(double hoursWorked){
		// populate the owned  hoursWorked from the given 
		// function parameter
		
		this.hoursWorked = hoursWorked;
	}
	
	
	public double getHoursWorked(){
		return hoursWorked;
	}
	
	public void setPayRate(double payRate){
		this.payRate = payRate;
	}
	
	public double getPayRate(){
		return payRate;
	}
	
	public void setBasicPay(double basicPay){
		this.basicPay = basicPay;
	}
	
	public double getBasicPay(){
		return basicPay;
	}
	
	public void setOvertimePay(double overtimePay){
		this.overtimePay = overtimePay;
	}
	
	public double getOvertimePay(){
		return basicPay;
	}


	public double getGrossPay() {
		return grossPay;
	}


	public void setGrossPay(double grossPay) {
		this.grossPay = grossPay;
	}


	public double getWithHoldingTax() {
		return withHoldingTax;
	}


	public void setWithHoldingTax(double withHoldingTax) {
		this.withHoldingTax = withHoldingTax;
	}


	public double getNetPay() {
		return netPay;
	}


	public void setNetPay(double netPay) {
		this.netPay = netPay;
	}
	
	// perform business functions
	public void computeSalary(){
		computeBasicPay();
		computeOvertimePay();
		computeGrossPay();
		computeWithHoldingTax();
		computeNetPay();
	}
	
	private void computeBasicPay(){
		basicPay = (hoursWorked > 40)
				? 40 * payRate
						:hoursWorked * payRate;
		
	}
	private void computeOvertimePay(){
		overtimePay = (hoursWorked > 40)
				? (hoursWorked - 40) * payRate * 1.5
						:0;
		
	}
	
	private void  computeGrossPay(){
		grossPay = basicPay + overtimePay;
		
	}
	
	private void computeWithHoldingTax(){
		withHoldingTax = grossPay * 0.15;
	}
	
	private void computeNetPay(){
		netPay = grossPay - withHoldingTax;
		
	}
	
	
	
	
}
