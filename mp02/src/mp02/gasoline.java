package mp02;

import java.io.IOException;

import utility.Reader;

public class gasoline {

	public static void main(String[] args) 
		throws IOException{
		prompter();
		
	}
	
	//prompts for the user input
	public static void prompter()
		throws IOException{
			String gasType = Reader.readString
					("Enter your gasoline type: ").toLowerCase();
			gasVerify(gasType);
			int gasLiters = Reader.readInt("Enter number of Liters: ");
			receiptHeader();
			gasTypePerLiter(gasType, gasLiters);
	}
	
	//format heading of the receipt
	// TO BE EDITED
	public static void receiptHeader(){
		System.out.println("\t\t\tGasoline Station");
	}
	
	/* validates if the input string is within the choices
	 else it will output error message and loop again
	 */
	public static void gasVerify(String gasType)
			throws IOException{
		switch(gasType){
		case "premium":
			break;
		case "diesel":
			break;
		case "unleaded":
			break;
		default:
			System.out.println("\tGas type not found! ");
			prompter();
		}
	}
	
	// method in adding the vat
	public static void addVat(int price){
		// two decimal points
		double vat = price * 0.12;
		System.out.println("\tVAT: Php " + vat);
		double total = price + vat;
		System.out.println("\tTOTAL AMOUNT: Php" + total);
		}

	//computing the total amount to be paid with VAT
	public static void gasTypePerLiter(String gasType, int liters)
		throws IOException{
	int total =0;
	switch(gasType){
	//premium
	case "premium": 
		System.out.println("\tFuel Type: Premium");
		total = liters * 50;
		break;
	//diesel
	case "diesel": 
		System.out.println("\tFuel Type: Diesel");
		total = liters * 38;
		break;
	//unleaded
	case "unleaded": 
		System.out.println("\tFuel Type: Unleaded");
		total = liters * 44;
		break;
	}
	System.out.println("\tPurchase amount: Php " + total);
	addVat(total);
	continueApp();
	}
	
	//asks the user if he wants another transaction
	public static void continueApp()
		throws IOException{
		String cont = Reader.readString
				("\tContinue? Y/N: ").toUpperCase();
		if(cont.equals("Y")){
			prompter();
		} else if (cont.equals("N")){
			System.out.println("Program Terminated");
		} else {
			Reader.readString
			("\tContinue? Y/N: ");
		}

	}

	
	}
	
// format
// Note: Fix decimal points (2 decimal points)



