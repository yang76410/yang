package Cn.Day_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.junit.Test;

public class InputStreamDemo {
	File file = new File("src/file/note.txt");
	@Test
	public void read() throws IOException {
		InputStream in = null;
		in=new   FileInputStream(file);
		int c=0;
		while((c=in.read())!=-1) {
			System.out.println(c);
		}
	}
	@Test
	public void write() throws IOException {
		OutputStream out = null;
		out = new FileOutputStream(file);
		out.write(97);
		out.write(98);
		out.write(99);
		out.flush();
		out.close();

	}

}
