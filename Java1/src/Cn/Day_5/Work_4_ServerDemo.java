package Cn.Day_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/** 
 * @author  洋  
 * @ClassName:Work_4_ServerDemo.java
 * @Description:
 * @date 创建时间:2018-7-12 上午11:30:01  
 */
public class Work_4_ServerDemo implements Runnable{
	private Socket socket;
	public Work_4_ServerDemo(Socket socket) {
		super();
		this.socket = socket;
	}
	@Override
	public void run() {
		InputStream in;
		try {
			while (true) {
			in = socket.getInputStream();
			InputStreamReader reader = new InputStreamReader(in);
			BufferedReader reader2 = new BufferedReader(reader);
			String str = reader2.readLine();
			System.out.println(str);
			//socket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
