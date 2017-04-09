package view;

import model.StoreDetails;

public class receiptPrint {

	public static void printReceipt(){
	System.out.println("\t\tJOLIBEE E-STORE PHILIPPINES");
	System.out.println("\t\tLevel 1 Robinsons Place Manila");
	System.out.println("\t\t   Midtown Ermita, Manila");
	System.out.println("\t\t  TIN# 224-985-526-007 VAT");
	System.out.println("\n\n\t\tTHIS SERVE AS OFFICIAL RECEIPT");
	System.out.println("\n\n\nOfficial Receipt # 00000016536");
	System.out.println("\nCashier:Aileen\t\t\t\t04/09/2017");
	System.out.println("Order Type: E-Delivery");
	System.out.println("Menu: Delivery Menu\n\n");
	//TODO input order
	System.out.println("1 Items");
	//TODO tax, subtotal, total
	System.out.println("PAID USING CREDIT CARD");
	System.out.println("\t\t--- Check Closed ---");
	}
	
	public static void printTotals(StoreDetails store){
		System.out.println("Total: " + store.getOrder()*store.getOrderAmount());
		System.out.println("VAT: " + store.getVat());
		System.out.println("Grand Total: " + store.getTotalPayment());
		
	}
}
