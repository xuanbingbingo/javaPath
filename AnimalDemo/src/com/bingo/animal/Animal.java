package com.bingo.animal;

public class Animal {
	private String name;//�ǳ�
	private String month;//�·�
	private String speciaes;//����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getSpeciaes() {
		return speciaes;
	}
	public void setSpeciaes(String speciaes) {
		this.speciaes = speciaes;
	}
	
	//�Զ���
	public void eat(){
		System.out.println(this.getName()+"�ڳԶ���");
	}
}
