package com.bingo.animal;


public class Cat {
	//成员属性：昵称、年龄、体重、品种
	private String name;
	private int month;
	private double weight;
	private String speices;
	public Cat(String name, int month, double weight, String speices) {
		this.name = name;
		this.month = month;
		this.weight = weight;
		this.speices = speices;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getSpeices() {
		return speices;
	}
	public void setSpeices(String speices) {
		this.speices = speices;
	}
	public void run(){
		System.out.println(this.name);
	}
}
