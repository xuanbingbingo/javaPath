package com.bingo.animal;

public class Cat extends Animal{
	private double weight;//����
	
	public Cat(){
		
	}

	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	//�ܶ��ķ���
	public void run(){
		super.eat();
		System.out.println(this.getName()+"����,Ʒ����"+this.getSpeciaes());
	}

	@Override
	public void eat(){
		System.out.println(this.getName()+"�ڳԶ���."+"������д�ķ���");
	}
}
