package com.bingo.model;

public class Student {
	//成员属性 学号、姓名、性别、年龄
	private String studentNo;
	private String studentName;
	private String studentSex;
	private int studentAge;
	private Subject studentSubject;
	
	public Student() {
		
	}
	public Student(String studentNo, String studentName, String studentSex, int studentAge,Subject studentSubject) {
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.studentSex = studentSex;
		this.studentAge = studentAge;
		this.studentSubject = studentSubject;
	}
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentSex() {
		return studentSex;
	}
	public Subject getStudentSubject() {
		return studentSubject;
	}
	public void setStudentSubject(Subject studentSubject) {
		this.studentSubject = studentSubject;
	}
	public void setStudentSex(String studentSex) {
		this.studentSex = studentSex;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	/**
	 * 自我介绍的方法
	 * @return
	 */
	public String indruction(){
		return "我的名字是：" + this.getStudentName() + "\n 我的专业是" + this.getStudentSubject().getSubjectName();
	}
	
}
