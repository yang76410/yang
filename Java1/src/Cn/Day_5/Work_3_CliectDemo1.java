package Cn.Day_5;
/** 
 * @author  洋  
 * @ClassName:Work_3_ClientDemo.java
 * @Description:
 * @date 创建时间:2018-7-12 上午9:56:53  
 */

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

public class Work_3_CliectDemo1 {
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 12345);
		// 转换成流
		OutputStream outputStream = socket.getOutputStream();
		OutputStreamWriter out = new OutputStreamWriter(outputStream);
		BufferedWriter writer = new BufferedWriter(out);
		File file = new File("PrintOne.txt");
		InputStream in = new FileInputStream(file);
		InputStreamReader r = new InputStreamReader(in);
		BufferedReader reader = new BufferedReader(r);
		String str = null;
		while ((str = reader.readLine()) != null) {
			writer.write(str);
			writer.newLine();
			writer.flush();
		}
		/*读取服务器读取完毕返回回来，显示成功*/
		socket.shutdownOutput();
		in = socket.getInputStream();
		r = new InputStreamReader(in);
		reader = new BufferedReader(r);
		str = reader.readLine();
		System.out.println(str);
	}
}
