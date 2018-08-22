package Cn.Day_5;
/** 
 * @author  洋  
 * @ClassName:Work_3_ServerDemo.java
 * @Description:
 * @date 创建时间:2018-7-12 上午9:57:12  
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Work_3_ServerDemo {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(12345);
		Socket socket = ss.accept();
		InputStream in = socket.getInputStream();
		InputStreamReader r = new InputStreamReader(in);
		BufferedReader reader = new BufferedReader(r);
		/* 1.读取信息*/
		String str = null;
		while ((str = reader.readLine()) != null) {
			System.out.println(str);
		}
		/*服务端读取数据成功写入“成功”*/
		 OutputStream outputStream = socket.getOutputStream();
		 OutputStreamWriter out = new OutputStreamWriter(outputStream);
		 BufferedWriter writer = new BufferedWriter(out);
		 writer.write("成功");
 		 writer.newLine();
 		 writer.flush();

	}
}
