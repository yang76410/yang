package Cn.Day_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

import org.junit.Test;
/*
 * 字符流，读取一个字符
 * */
public class ReaderDemo {
	String path = "src/file/stu.txt";

	@Test
	public void read() {
		File file = new File(path);
		if (!file.exists()) {
			return;
		}

		try {
			InputStream in = new FileInputStream(file);
			InputStreamReader reader = new InputStreamReader(in, "utf-8");
			int b;
			while((b=reader.read())!=-1){
				System.out.print((char)b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void write() {
		try {
			OutputStream out = new FileOutputStream(path);
			OutputStreamWriter writer = new OutputStreamWriter(out, "UTF-8");
			writer.write("你好");
			writer.flush();
			writer.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void creatFile() {
		path = "src/file";
		File file = new File(path);
		System.out.println(file.mkdirs());
		path = "src/file/stu.txt";
		file = new File(path);
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
