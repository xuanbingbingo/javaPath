package com.bingo.innerClass;

public class Person {
	int age;
	public Heart getHeart(){
		return new Heart();
	}
	public void say(){
		System.out.println("1");
	}
	class Heart{
		public String beat(){
			Person.this.age = 2;
			return age+"Ìø¶¯";
		}
	}
}
