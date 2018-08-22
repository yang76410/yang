package Cn.Day_3.Thread;
/** 
 * @author  洋  
 * @ClassName:ThreadMain.java
 * @Description:
 * @date 创建时间:2018-7-11 上午2:28:16  
 */
public class ThreadMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThreadDemo td = new ThreadDemo();
		td.run();
		td.start();

	}

}
