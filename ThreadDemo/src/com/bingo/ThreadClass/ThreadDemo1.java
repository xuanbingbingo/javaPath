package com.bingo.ThreadClass;

class MyThread extends Thread{
	public MyThread(String name){
		super(name);
	}
	public void run(){
		String name = this.getName();
		for(int i = 0; i < 10; i++){
			System.out.println(name+"线程正在执行！");
		}
		
	}
}

public class ThreadDemo1 {

	public static void main(String[] args) {
		
		int mainPriority = Thread.currentThread().getPriority();
		// TODO Auto-generated method stub
		MyThread mt1 = new MyThread("1");
		mt1.setPriority(Thread.MAX_PRIORITY);
		MyThread mt2 = new MyThread("2");
		mt2.setPriority(2);
		mt1.start();
		
		try {
			mt1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mt2.start();
//		try {
//			mt2.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
//		try {
//			mt1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("线程一的优先级为："+mt1.getPriority());
	}

}
