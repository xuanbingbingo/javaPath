package com.bingo.innerClass;

public class personTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person lili = new Person();
		lili.age = 12;
		
		//��ȡ�ڲ���Ķ���ʵ������ʽ1��
		Person.Heart myHeart = new Person().new Heart();
		System.out.println(myHeart.beat());
	}

}
