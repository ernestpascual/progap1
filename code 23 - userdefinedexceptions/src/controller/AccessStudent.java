// assigned class to access everything
package controller;

import java.io.IOException;

import model.Student;
import view.Display;
import utility.Reader;
import exceptions.InvalidMidtermGradeException;
import exceptions.InvalidPreFinalGradeException;
import exceptions.InvalidYearLevelException;

public class AccessStudent {

	public static void main(String[] args) {
	
		try{
			String id = Reader.readString("Enter Student ID: ");
			String name = Reader.readString("Enter name: ");
			int yearLevel = Reader.readInt("Enter year level: ");
			// perform validation for year level 1-4 only
			if(yearLevel <1 || yearLevel > 4){
				throw new InvalidYearLevelException();
			}
						
			int midtermRawGrade = Reader.readInt("Enter midterm raw grade: ");
			// perform validation for midtermRawGrade
			
			if (midtermRawGrade < 0 || midtermRawGrade > 100){
				throw new InvalidMidtermGradeException();
			}
			int preFinalRawGrade = Reader.readInt("Enter pre-final raw grade: ");
			if (preFinalRawGrade < 0 || preFinalRawGrade > 100){
				throw new InvalidPreFinalGradeException();
			}
			
			// if there are no exceptions at this point meaning all the input values are valid
			
			Student student = new Student (id, name, yearLevel, midtermRawGrade, preFinalRawGrade);	
			
			// then print values
			Display.print(student);
		} catch(NumberFormatException nfo){
			System.err.println(nfo.getMessage());
			
		} catch (IOException ioe){
			System.err.println(ioe.getMessage());
		} catch (InvalidYearLevelException iyle){
			System.err.println(iyle.getMessage());
		} catch (InvalidMidtermGradeException imge){
			System.err.println(imge.getMessage());
		} catch (InvalidPreFinalGradeException ipge){
			System.err.println(ipge.getMessage());
		} 
		
		
		
	}

}
