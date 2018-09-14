package com.bingo.model;

public class Subject {
	private String subjectName;
	private String subjectNo;
	private int subjectLife;
	private Student[] myStudents;
	
	public Student[] getMyStudents() {
		if(myStudents == null){
			this.myStudents = new Student[200];
		}
		return myStudents;
	}
	public void setMyStudents(Student[] myStudents) {
		this.myStudents = myStudents;
	}
	public Subject(){
		
	}
	public Subject(String subjectName, String subjectNo, int subjectLife, Student[] myStudents) {
		this.subjectName = subjectName;
		this.subjectNo = subjectNo;
		this.subjectLife = subjectLife;
		this.myStudents = myStudents;
	}
	public Subject(String subjectName, String subjectNo, int subjectLife) {
		//this.subjectName = subjectName;
		//this.subjectNo = subjectNo;
		//this.subjectLife = subjectLife;
		this.setSubjectName(subjectName);
		this.setSubjectNo(subjectNo);
		this.setSubjectLife(subjectLife);
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getSubjectNo() {
		return subjectNo;
	}
	public void setSubjectNo(String subjectNo) {
		this.subjectNo = subjectNo;
	}
	public int getSubjectLife() {
		return subjectLife;
	}
	public void setSubjectLife(int subjectLife) {
		this.subjectLife = subjectLife;
	}
	
	public String info(){
		String str = "\n" + this.getSubjectName()+"\n"+this.getSubjectLife()+"\n"+this.getSubjectNo();
		return str;
	}
	
	
}

