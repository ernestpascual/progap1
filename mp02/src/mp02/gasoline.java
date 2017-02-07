package mp02;

import java.io.IOException;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import utility.Reader;
import java.text.*;


public class gasoline {

	public static void main(String[] args) 
		throws IOException{
		prompter();
	}
	
	//prompts for the user input
	@SuppressWarnings("resource")
	public static void prompter()
		throws IOException{
			String gasType = Reader.readString
					("Enter your gasoline type: ").toLowerCase();
			gasVerify(gasType);
	// int gasLiters = Reader.readInt("Enter number of Liters: "); --- alternate solution
	//gas liters validator
			Scanner sc = new Scanner(System.in);
			// scans input value
				try{
					System.out.print("Enter Number of Liters: ");
					int gasLiters = sc.nextInt();
					if (gasLiters < 0){
						System.out.println("Invalid number.");
						prompter();
					}else {
						receiptHeader();
						gasTypePerLiter(gasType, gasLiters);
					}		
				} catch(InputMismatchException except){
					System.out.println("Invalid number.");
					prompter();
			}
	}
	
	
	//format heading of the receipt
	public static void receiptHeader(){
		 Date dNow = new Date( );
	      SimpleDateFormat ft = 
	      new SimpleDateFormat ("yyyy.MM.dd '\n\t\t\tat' hh:mm:ss");
		System.out.println("\n\n\n\n\t\t\tEEP Gasoline Station" 
							+ "\n\t\t\tTaft Ave., Malate" 
							+ "\n\t\t\tMetro Manila"
							+"\n\t\t\tPhilippines"
							+"\n\n\t\t\tDate: " + ft.format(dNow)
							+"\n\t\t\tReceipt No. 983923\n");
	}
	
	/* validates if the input string is within the choices
	 else it will output error message and loop again
	 */
	// bug reverts to prompter if executed
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
			break;
		
		}
		
		}
	
	// method in adding the vat
	public static void addVat(int price){
		// two decimal points
		double vat = price * 0.12;
		System.out.println("\t\t\tVAT: Php " + (new DecimalFormat("##.##").format(vat)));
		double total = price + vat;
		System.out.println("\t\t\tTOTAL AMOUNT: Php " + total);
		}

	//computing the total amount to be paid with VAT
	public static void gasTypePerLiter(String gasType, int liters)
		throws IOException{
	int total = 0;
	switch(gasType){
	//premium
	case "premium": 
		System.out.println("\t\t\tFuel Type: Premium");
		total = liters * 50;
		break;
	//diesel
	case "diesel": 
		System.out.println("\t\t\tFuel Type: Diesel");
		total = liters * 38;
		break;
	//unleaded
	case "unleaded": 
		System.out.println("\t\t\tFuel Type: Unleaded");
		total = liters * 44;
		break;
	}
	System.out.println("\t\t\tPurchase amount: Php " + total);
	addVat(total);
	continueApp();
	}
	
	//asks the user if he wants another transaction
	public static void continueApp()
		throws IOException{
		String cont = Reader.readString
				("\n\t\t\tContinue? Y/N: ").toUpperCase();
		if(cont.equals("Y")){
			prompter();
		} else {
			System.out.println("Press any key to exit.");
			System.exit(0);
		}
		}

	}

	
	
	

/*
 * NOTE - The gasoline type must be correct (either unleaded, diesel or premium) 
 * and number of liters ordered must not be negative or zero. If one is invalid or 
 * both of them are invalid, any computations MUST NOT be performed. You have to repeat its 
 * data entry until the data entered is correct. 
 */

/* LOG (02-04-17)
 * Receipt format OK
 * Update to java 1.8 OK
 * case OK
 * Continue option OK
 * VAT calculation OK
 * TOTAL SALES calculation OK
 * Two decimal points OK
 * Fix exceptions for negative and decimal values
 * Fix repeat data entry for negative and decimal values
 * Fix prompter() bug
 */

/* LOG (02-07-17)
 * exceptions for negative and decimal values OK (use try catch with InputMismatchException for decimal and ifelse x < 0
 * for negative value. 
 * NOTE: Don't forget the else statement to direct the logic when the expression is false.
 * repeat data entry on exception  OK 
 * prompter() bug  OK (use System.exit(0))
*/



