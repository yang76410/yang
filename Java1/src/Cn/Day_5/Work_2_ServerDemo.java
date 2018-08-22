package Cn.Day_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Work_2_ServerDemo {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(12001);
		Socket socket = ss.accept();
		InputStream in = socket.getInputStream();
		InputStreamReader r = new InputStreamReader(in);
		BufferedReader reader = new BufferedReader(r);

		/**
		 * 1.读取信息
		 */
		// for(int i=0;i<10;i++) {
		// String str = reader.readLine();
		// System.out.println(str);
		// }
		String str = null;
		while ((str = reader.readLine()) != null) {
			System.out.println(str);
		}

		/**
		 * 2. 编写内容
		 */

	}
}
