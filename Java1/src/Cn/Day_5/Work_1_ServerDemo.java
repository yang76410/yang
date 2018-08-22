package Cn.Day_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Work_1_ServerDemo {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(12000);
		// 获得连接
		Socket socket = serverSocket.accept();
		InputStream in = socket.getInputStream();
		InputStreamReader reader = new InputStreamReader(in);
		BufferedReader reader2 = new BufferedReader(reader);
		// int c = reader.read();
		while(true) {
			String str = reader2.readLine();
			System.out.println(str);
		}
	}
}
