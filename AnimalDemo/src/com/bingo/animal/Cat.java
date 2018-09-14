package com.bingo.animal;

public class Cat extends Animal{
	private double weight;//体重
	
	public static int str = 2;
	static {
		System.out.println("cat静态代码块");
	}
	{
		System.out.println("cat构造代码块");
	}
	public Cat(){
		System.out.println("cat构造函数");
	}

	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	//跑动的方法
	public void run(){
		super.eat();
		System.out.println(this.getName()+"奔跑,品种是"+this.getSpeciaes());
	}

	@Override
	public void eat(){
		System.out.println(this.getName()+"在吃东西."+"子类重写的方法");
	}
}
