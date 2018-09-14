package com.bingo.model;

public class Student {
	//��Ա���� ѧ�š��������Ա�����
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
	 * ���ҽ��ܵķ���
	 * @return
	 */
	public String indruction(){
		return "�ҵ������ǣ�" + this.getStudentName() + "\n �ҵ�רҵ��" + this.getStudentSubject().getSubjectName();
	}
	
}
