package com.bingo;

import java.util.Scanner;

public class HelloBingo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = (char)65;
		char c = '\u0041';
		final String a = String.valueOf(true);
		double b = 1.23e5;
		int ac = 'a';
		int a1 = 13;
		int a2 = 3;
		System.out.println(a1/a2+"Hello,bingo"+"\r"+ch+c+a+b+ac);
		char[] arr;
		arr = new char[]{'a','b','c','d','e'};
		System.out.println(arr[1]);
		HelloBingo bingo = new HelloBingo();
		bingo.say(1,2,3,4);
	}
	/**
	 * 
	 * @param n
	 */
	public void say(int... n){
		for(int i:n)
		System.out.println(i);
	}
}
