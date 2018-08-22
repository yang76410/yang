package Cn.Day_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import org.junit.Test;

public class ReaderDemo2 {

	String path = "src/file/com/stu.txt";
	@Test
	public void write() throws Exception {
		File file = new File(path);			//生成文件对象
		OutputStream out=new FileOutputStream(file);		//字节流
		OutputStreamWriter writer=new OutputStreamWriter(out, "utf-8"); //字符流
	    BufferedWriter bufferedWriter=new BufferedWriter(writer);		//缓冲流
	    bufferedWriter.write("你好");
	    bufferedWriter.newLine();
	    bufferedWriter.write("bb");
	    bufferedWriter.flush();
	    bufferedWriter.close();
	    writer.close();
	    out.close(); 
	}

	@Test
	public void read() throws Exception {
		File file = new File(path);
		InputStream in = new FileInputStream(file);
		InputStreamReader reader = new InputStreamReader(in);
		BufferedReader reader2 = new BufferedReader(reader);
		String str = null;
		while ((str = reader2.readLine()) != null) {
			System.out.println(str);

		}

	}

	@Test
	public void creatFile() throws IOException {
		String path = "src/file/com";
		File file = new File(path);
		file.mkdirs();
		path = "src/file/com/stu.txt";
		file = new File(path);
		file.createNewFile();

	}
}
