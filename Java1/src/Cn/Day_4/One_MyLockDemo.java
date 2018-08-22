package Cn.Day_4;

public class One_MyLockDemo implements Runnable {
	private boolean flag = false;

	public One_MyLockDemo(boolean flag) {
		this.flag = flag;
	}

	@Override
	public void run() {
		// System.out.println(flag);
		if (flag) {
			synchronized (One_MyLock.object1) {
				System.out.println("MyLock.object1");
				synchronized (One_MyLock.object2) {
					System.out.println("MyLock.object1--2");

				}
			}

		} else {
			synchronized (One_MyLock.object2) {
				System.out.println("MyLock.object2");
				synchronized (One_MyLock.object1) {
					System.out.println("MyLock.object2---1");

				}

			}

		}
	}

	public static void main(String[] args) {
		One_MyLockDemo demo = new One_MyLockDemo(true);
		One_MyLockDemo demo1 = new One_MyLockDemo(false);
		Thread thread = new Thread(demo);
		Thread thread1 = new Thread(demo1);
		thread.start();
		//
		thread1.start();

	}

}
