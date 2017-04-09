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
	public StoreDetails(int order, int orderAmount){
		this.order = order;
		this.orderAmount = orderAmount;
		
	}
	
	public StoreDetails(String creditCardNumber){
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

	
	
	// function and operations
	public void computeVat(){
		this.vat = (this.price * this.orderAmount)*0.12;
	}
	
	public void totalPayment(){
		this.totalPayment = this.vat + this.price;
	}
	
	
	
	

}
