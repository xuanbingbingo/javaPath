package com.bingo.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int one = 12;
//		int two = 0;
//		System.out.print("one,two相除结果是："+one/two);
		
		Scanner input = new Scanner(System.in);
		try{
			int one = input.nextInt();
			int two = input.nextInt();
			System.out.println("one,two相除结果是："+one/two);
		}catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println("程序出错了！");
		}catch(InputMismatchException e){
			System.exit(1);//无条件终止执行
			e.printStackTrace();
			System.out.println("程序出错了,输入不是整数");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("程序出错了！");
		}finally{
			System.out.println("无论如何都会执行这句代码");
		}
		
	}

}
