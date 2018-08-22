package Cn.Day_3.Thread;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyThreadTest {

	@Test
	public void test() {
		MyThread myThread1 = new MyThread();
		MyThread myThread2 = new MyThread();
		myThread1.start();
		myThread2.start();
	}

}
