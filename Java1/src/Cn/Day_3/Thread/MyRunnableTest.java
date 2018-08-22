package Cn.Day_3.Thread;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyRunnableTest {

	@Test
	public void test() {

	}

	public static void main(String[] args) {
		// System.out.println(Thread.currentThread().getName());
		MyRunnable runnable = new MyRunnable();
		Thread thread1 = new Thread(runnable);
		thread1.start();
		Thread thread2 = new Thread(runnable);
		thread2.start();
		 int tak = runnable.getTak();
		 System.out.println(tak);
	}
}
