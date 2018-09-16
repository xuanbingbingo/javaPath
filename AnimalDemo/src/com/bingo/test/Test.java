package com.bingo.test;

import com.bingo.animal.Cat;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat one = new Cat();
		one.setName("花花");
		System.out.println(one.getName());
		one.setSpeciaes("中华田园猫");
		one.run();
	}

}
