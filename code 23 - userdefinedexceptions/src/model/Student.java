package model;

public class Student {
	// input define variables
	private String id;
	private String name;
	private int yearLevel;
	private int midtermRawGrade;
	private int preFinalRawGrade;
	
	
	
	// create constructor
	public Student(){
		
	}
	
	public Student(String id, String name, int yearLevel, int midtermRawGrade, int prefinalRawGrade, int preFinalRawGrade){
		this.id = id;
		this.name = name;
		this.yearLevel = yearLevel;
		this.midtermRawGrade = midtermRawGrade;
		this.preFinalRawGrade = preFinalRawGrade;
		computeFinalGrade();
		determineRemarks();
		
		
	}
	
	// derivative from function
	private double finalGrade;
	private String remarks;
	
	
	// generate getters and setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYearLevel() {
		return yearLevel;
	}
	public void setYearLevel(int yearLevel) {
		this.yearLevel = yearLevel;
	}
	public int getMidtermRawGrade() {
		return midtermRawGrade;
	}
	public void setMidtermRawGrade(int midtermRawGrade) {
		this.midtermRawGrade = midtermRawGrade;
	}
	public int getPreFinalRawGrade() {
		return preFinalRawGrade;
	}
	public void setPreFinalRawGrade(int preFinalRawGrade) {
		this.preFinalRawGrade = preFinalRawGrade;
	}
	public double getFinalGrade() {
		return finalGrade;
	}
	public void setFinalGrade(double finalGrade) {
		this.finalGrade = finalGrade;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	// functions
	public void computeFinalGrade(){
		this.finalGrade = this.midtermRawGrade * 0.5 + this.preFinalRawGrade*0.5;
	}
	
	public void determineRemarks(){
		this.remarks = (this.finalGrade >= 70) 
				? "Passed" 
						: "Failed";
	}
	
}
