package model;

public class StoreDetails {
	// input variables
	private int order;
	private int orderAmount;
	private int price;
	private String creditCardNumber;
	
	// derivables
	
	private double vat;
	private double totalPayment;
	
	// constructor
	public StoreDetails(){
		
	}
	
	// overload constructor to place input variables
	public StoreDetails(int order, int orderAmount, int creditCardNumber, int price){
		this.order = order;
		this.orderAmount = orderAmount;
		this.price = price;
		this.creditCardNumber = creditCardNumber;
		
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public int getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public double getVat() {
		return vat;
	}

	public void setVat(double vat) {
		this.vat = vat;
	}

	public double getTotalPayment() {
		return totalPayment;
	}

	public void setTotalPayment(double totalPayment) {
		this.totalPayment = totalPayment;
	}
	
	
	// function and operations
	public void computeVat(){
		this.vat = (this.price * this.orderAmount)*0.12;
	}
	
	
	
	

}
