package com.bingo.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int one = 12;
//		int two = 0;
//		System.out.print("one,two�������ǣ�"+one/two);
		
		Scanner input = new Scanner(System.in);
		try{
			int one = input.nextInt();
			int two = input.nextInt();
			System.out.println("one,two�������ǣ�"+one/two);
		}catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println("��������ˣ�");
		}catch(InputMismatchException e){
			System.exit(1);//��������ִֹ��
			e.printStackTrace();
			System.out.println("���������,���벻������");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("��������ˣ�");
		}finally{
			System.out.println("������ζ���ִ��������");
		}
		
	}

}
