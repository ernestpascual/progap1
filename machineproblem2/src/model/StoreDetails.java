package model;

public class StoreDetails {
	// input variables
	private int orderAmount;
	private int price;
	private String creditCardNumber;
	private String order;
	
	public String getOrder() {
		return order;
	}

	// derivables
	private int total;
	

	public void setOrder(String order) {
		this.order = order;
	}

	private double vat;
	private double totalPayment;
	
	// constructor
	public StoreDetails(){
		
	}
	
	// overload constructor to place input variables
	public StoreDetails(int orderAmount){
	
		this.orderAmount = orderAmount;
	}
	
	public StoreDetails(String creditCardNumber){
		this.creditCardNumber = creditCardNumber;
	}
	
	// getters and setters
	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getTotalPayment() {
		return totalPayment;
	}

	public void setTotalPayment(double totalPayment) {
		this.totalPayment = totalPayment;
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

	// function and operations
	
	public void priceSelector(int menu){
		switch (menu){
		case 1:
			// 1 pc CJ
			this.price = 80;
			this.order = "1pc Chicken Joy Value Meal\t\t\tPhp 80.00";
			break;
		case 2:
			// 2 pc CJ
			this.price = 139;
			this.order = "2pc Chicken Joy Value Meal\t\t\tPhp 139.00";
			break;
		case 3:
			// 1pc CJ with Spag
			this.price = 105;
			this.order = "1pc Chicken Joy with Spaghetti Value Meal\t\t\tPhp 105.00";
			break;
		case 4:
			// 1pc CJ with Palabok
			this.price = 130;
			this.order = "1pc Chicken Joy with Palabok Value Meal\t\t\tPhp 130.00";
			break;
		case 5:
			// Yum
			this.price = 69;
			this.order = "Yum Value Meal\t\t\tPhp 69.00";
			break;
		case 6:
			// Yum with cheese
			this.price = 80;
			this.order = "Yum with Cheese Value Meal\t\t\tPhp 80.00";
			break;
		case 7:
			// Yum With TLC
			this.price = 95;
			this.order = "Yum with TLC Value Meal\t\t\tPhp 95.00";
			break;
		case 8:
			// Aloha
			this.price = 179;
			this.order = "Amazing Aloha Value Meal\t\t\tPhp 179.00";
			break;
		case 9:
			// Champ
			this.price = 155;
			this.order = "Champ Value Meal\t\t\tPhp 155.00";
			break;
		case 10:
			// BS
			this.price = 129;
			this.order = "Ultimate Burger Steak\t\t\tPhp 69.00";
			break;
		}
	}
	
	public void computeTotal(){
		this.total = this.price * this.orderAmount;
	}
	public void computeVat(){
		this.vat = (this.price * this.orderAmount)*0.12;
	}
	
	public void computeTotalPayment(){
		this.totalPayment = this.vat + (this.price * this.orderAmount);
	}
	
	
	
	
	}
	


