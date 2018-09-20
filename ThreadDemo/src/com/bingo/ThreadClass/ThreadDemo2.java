package com.bingo.ThreadClass;

class PrintRunnable implements Runnable{
	@Override
	public void run(){
		for(int i = 0; i < 1000; i++){
			if(i == 1){
//				Thread.yield();
			}
			System.out.println(Thread.currentThread().getName()+"线程正在运行"+Math.random());
		}
		
	}
}
public class ThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintRunnable pr = new PrintRunnable();
		Thread th = new Thread(pr);
		th.start();
		try {
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread th1 = new Thread(pr);
		th1.start();
	}

}
