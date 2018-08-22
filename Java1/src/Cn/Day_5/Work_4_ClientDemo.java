package Cn.Day_5;
/** 
 * @author  洋  
 * @ClassName:Work_3_ClientDemo.java
 * @Description:
 * @date 创建时间:2018-7-12 上午11:29:33  
 */
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Work_4_ClientDemo {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		/***************** 网络通讯 ****************************/
		@SuppressWarnings("resource")
		Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 11111);
		OutputStream out = socket.getOutputStream();
		OutputStreamWriter writer = new OutputStreamWriter(out);
		BufferedWriter writer2 = new BufferedWriter(writer);
		while (true) {
			System.out.print("输入:");
			writer2.write(scanner.next());
			writer2.newLine();
			writer2.flush();
		}
	}
}
