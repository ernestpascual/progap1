package view;

import model.Student;

public class Display {
	public static void print(Student student){
		System.out.println("Student Details");
		System.out.println("ID: " + student.getId());
		System.out.println("Name: " + student.getName());
		System.out.println("Midterm Grade: " + student.getMidtermRawGrade());
		System.out.println("Prefinal Grade: " + student.getPreFinalRawGrade());
		System.out.println("FINAL GRADE: " + student.getFinalGrade());
		System.out.println("REMARKS: " + student.getRemarks());
		

	}

}
