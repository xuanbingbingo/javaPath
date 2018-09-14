package com.bingo.test;

import com.bingo.model.Student;
import com.bingo.model.Subject;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject subject = new Subject("¼ÆËã»ú","18",4);
		Student student = new Student("13540","Àî±ó","ÄĞ",18,subject);
		System.out.println(student.indruction());
	}

}
