package Cn.Day_2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class InputStreamBufferDemo {
	File file = new File("src/file/note.txt");
	@Test
	public void read() throws IOException {
		InputStream in = new FileInputStream(file);
		BufferedInputStream bid = new BufferedInputStream(in);
		byte[] byts = new byte[1024];
		int len = 0;
		while ((len = bid.read(byts)) != -1) {
			System.out.println(new String(byts, 0, len));
		}
	}

	@Test
	public void write() throws IOException {
		OutputStream os = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(os);
		bos.write("你好".getBytes());
		bos.flush();
		bos.close();

	}

	@Test
	public void writeObject() throws IOException {
		OutputStream os = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(os);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		List<TeacherForm> teacherForms = new ArrayList<TeacherForm>();
		teacherForms.add(new TeacherForm(1002, "b"));
		teacherForms.add(new TeacherForm(1003, "c"));
		oos.writeObject(teacherForms);
		oos.flush();
		oos.close();

	}

	@Test
	public void readObject() throws IOException {
		InputStream in = new FileInputStream(file);
		BufferedInputStream bid = new BufferedInputStream(in);
		ObjectInputStream ois = new ObjectInputStream(bid);
		try {
			List<TeacherForm> teacherForms = (List<TeacherForm>) ois.readObject();
			System.out.println(teacherForms);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
