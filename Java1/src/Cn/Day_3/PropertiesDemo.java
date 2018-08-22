package Cn.Day_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

import org.junit.Test;

/** 
 * @author  洋  
 * @ClassName:Properties.java
 * @Description:
 * @date 创建时间:2018-7-11 上午12:33:25  
 */
public class PropertiesDemo {
	/*
	 * 特殊map：Properties
	 * */
	@Test
	public void read() throws IOException{
		String path = "src/a.properties";
		Reader read = new FileReader(path);
		Properties pro = new Properties();
		pro.load(read);
		System.out.println("name="+pro.getProperty("name"));
		System.out.println("age="+pro.getProperty("age"));
	}
	@Test
	public void write() throws IOException {
		String path = "src/a.properties";
		Properties pro = new Properties();
		pro.setProperty("name","pzz");
		pro.setProperty("age","16");
		Writer write = new FileWriter(path);
		pro.store(write, "1111");
	}
	@Test
	public void write1() throws IOException {
		String path =  "src/a.properties";
		Properties pro =  new Properties();
		pro.setProperty("name", "asdd");
		pro.setProperty("age", "19");
		//Writer write = new FileWriter(path);
		OutputStream out = new FileOutputStream(path);			//输出的是字符，中文会变成ascll码
		OutputStreamWriter osw = new OutputStreamWriter(out);	//
		pro.store(osw, "1111");
	}
}
