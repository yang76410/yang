package Cn.Day_3.Thread;

public class ThreadDemo extends Thread {
	@Override
	public void run() {
		System.out.println("线程名:" + Thread.currentThread().getName());
	}

}
