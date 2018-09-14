package com.bingo.animal;

public class Animal {
	private String name;//昵称
	private String month;//月份
	private String speciaes;//种类
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
	
	//吃东西
	public void eat(){
		System.out.println(this.getName()+"在吃东西");
	}
}
