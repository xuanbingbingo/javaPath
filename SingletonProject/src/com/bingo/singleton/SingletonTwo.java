package com.bingo.singleton;

public class SingletonTwo {
	//1.��������˽�й���
	private SingletonTwo(){
		
	}
	
	//2.���������͵�˽�о�̬ʵ��
	private static SingletonTwo instance = null;
	
	//3.�������о�̬���������ؾ�̬ʵ������
	public static SingletonTwo getInstance(){
		if(instance==null)
			instance = new SingletonTwo();
		return instance;
	}
}
