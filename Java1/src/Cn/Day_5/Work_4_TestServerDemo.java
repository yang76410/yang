package Cn.Day_5;
/** 
 * @author  洋  
 * @ClassName:Work_4_TestServerDemo.java
 * @Description:
 * @date 创建时间:2018-7-12 上午11:30:14  
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Work_4_TestServerDemo {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(11111);
		Socket socket = ss.accept();
		Work_4_ServerDemo demo3 = new Work_4_ServerDemo(socket);
		Thread thread = new Thread(demo3);
		thread.start();

	}
}
