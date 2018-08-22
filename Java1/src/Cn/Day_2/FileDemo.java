package Cn.Day_2;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

import org.junit.Test;

public class FileDemo {
	@Test
	public void testFile()  {
		File file = new File("src/note.txt");
		System.out.println("路径：" + file.exists());
		System.out.println("文件：" + file.isFile());
		System.out.println("目录：" + file.isDirectory());
		file = new File("src/file/note/as/a");
		if (!file.exists()) {
			file.mkdirs();
		}
		file = new File("src/file/note/as/a.txt");
		 try {
			file.createNewFile(); 
		} catch (IOException e) {
			e.printStackTrace();
		}
		File file2 = new File("src/file/note/as/b.txt");
		file.renameTo(file2);
		
		
		
	}
	@Test
	public void bianli() {
		File file3=new File("e:");
		String[] files=file3.list();
		for (String string : files) {
			file3=new File(string);
			System.out.println(file3+":"+file3.isFile());
		}
	}
	@Test
	public void bianli2() {
		File file3=new File("e:");
		File[] files=file3.listFiles();
		for (File file : files) {
			if(file.isFile()) {
				System.out.println(file);
			}
		}
	}
}
