package Cn.Day_5;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Work_1_CliectDemo {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		/***************** 网络通讯 ****************************/
		Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 12000);
		OutputStream out = socket.getOutputStream();
		OutputStreamWriter writer = new OutputStreamWriter(out);
		BufferedWriter writer2 = new BufferedWriter(writer);
		// writer.write("你好");
		while(true) {
			System.out.print("输入:");
			writer2.write(scanner.next());
			writer2.newLine();
			writer2.flush();
		}
//		writer.close();
//		out.close();
//		socket.close();

	}
}
