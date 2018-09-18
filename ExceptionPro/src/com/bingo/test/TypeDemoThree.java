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
			System.out.print("除数不能为0");
			e.printStackTrace();
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.out.print("请输入整数");
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
//			System.out.println("程序出错了！");
//			return 0;
//		}catch(InputMismatchException e){
//			System.exit(1);//无条件终止执行
//			e.printStackTrace();
//			System.out.println("程序出错了,输入不是整数");
//			return -1;
//		}catch(Exception e){
//			e.printStackTrace();
//			System.out.println("程序出错了！");
//			return -2;
//		}finally{
//			System.out.println("无论如何都会执行这句代码");
//		}
	}

}
