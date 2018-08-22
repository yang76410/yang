package Cn.Day_5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Work_2_ClientDemo {
	public static void main(String[] args) throws IOException {
		 Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 12001);
		 // 转换成流
		 OutputStream outputStream = socket.getOutputStream();
		 OutputStreamWriter out = new OutputStreamWriter(outputStream);
		 BufferedWriter writer = new BufferedWriter(out);

		/**
		 * 读取内容
		 */
		File file = new File("PrintOne.txt");
		InputStream in = new FileInputStream(file);
		InputStreamReader r = new InputStreamReader(in);
		BufferedReader reader = new BufferedReader(r);
//		int len = 0;
		String str = null;
		while ((str = reader.readLine()) != null) {
             //System.out.println(str);
         	 writer.write(str);
     		 writer.newLine();
     		 writer.flush();
		}

		/**
		 * 写入通讯
		 */
		// for(int i=0;i<10;i++) {
		// writer.write("你好");
		// writer.newLine();
		// writer.flush();
		// }
		writer.close();
		out.close();
		socket.close();

	}
}
