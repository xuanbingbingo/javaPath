package com.bingo.test;

import com.bingo.model.Student;
import com.bingo.model.Subject;

public class SchoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[100];
		Subject subject = new Subject("�������ѧ��Ӧ��","j0001",4,students);
		System.out.println(subject.getMyStudents().length);
	}

}
