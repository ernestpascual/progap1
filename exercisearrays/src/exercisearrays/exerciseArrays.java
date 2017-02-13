package exercisearrays;
import java.io.IOException;

import utility.Reader;

public class exerciseArrays {
	public static void main(String[] args) 
			throws IOException{
		
		int [] sortNumber = new int[5];
		int temp = 0;
		sortNumber[0]= Reader.readInt("Enter first number: ");
		sortNumber[1]= Reader.readInt("Enter second number: ");
		sortNumber[2]= Reader.readInt("Enter third number: ");
		sortNumber[3]= Reader.readInt("Enter fourth number: ");
		sortNumber[4]= Reader.readInt("Enter fifth number: ");
		

		 // sort 
		for (int i = 0; i < sortNumber.length; i++) 
        {
            for (int j = i + 1; j < sortNumber.length; j++) 
            {
                if (sortNumber[i] > sortNumber[j]) 
                {
                    temp = sortNumber[i];
                    sortNumber[i] = sortNumber[j];
                    sortNumber[j] = temp;
                    
                }
            }
        }
		
		
		System.out.println("\nThe second highest value is " + sortNumber[3]);
		System.out.println("The second lowest value is " + sortNumber[1]);
		
		
    }
		
		

		
		
	}


