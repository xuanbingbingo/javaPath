package com.bingo.singleton;

public class SingletonTwo {
	//1.创建类中私有构造
	private SingletonTwo(){
		
	}
	
	//2.创建该类型的私有静态实例
	private static SingletonTwo instance = null;
	
	//3.创建公有静态方法，返回静态实例对象
	public static SingletonTwo getInstance(){
		if(instance==null)
			instance = new SingletonTwo();
		return instance;
	}
}
