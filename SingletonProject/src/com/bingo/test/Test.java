package com.bingo.test;

import com.bingo.singleton.SingletonTwo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SingletonOne one = SingletonOne.getInstance();
//		SingletonOne two = SingletonOne.getInstance();
//		System.out.println(one);
//		System.out.println(two);
		SingletonTwo one = SingletonTwo.getInstance();
		SingletonTwo two = SingletonTwo.getInstance();
		System.out.println(one);
		System.out.println(two);
	}

}
