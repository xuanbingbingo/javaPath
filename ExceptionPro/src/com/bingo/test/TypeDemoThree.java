package com.bingo.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TypeDemoThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int result = test();
			System.out.println("one/two:"+result);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.print("��������Ϊ0");
			e.printStackTrace();
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.out.print("����������");
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static int test() throws Exception{
		Scanner input = new Scanner(System.in);
//		try{
			int one = input.nextInt();
			int two = input.nextInt();
			throw new Exception("fajdkfjadsklfjadskl");
//			return one/two;
//		}catch(ArithmeticException e){
//			e.printStackTrace();
//			System.out.println("��������ˣ�");
//			return 0;
//		}catch(InputMismatchException e){
//			System.exit(1);//��������ִֹ��
//			e.printStackTrace();
//			System.out.println("���������,���벻������");
//			return -1;
//		}catch(Exception e){
//			e.printStackTrace();
//			System.out.println("��������ˣ�");
//			return -2;
//		}finally{
//			System.out.println("������ζ���ִ��������");
//		}
	}

}
