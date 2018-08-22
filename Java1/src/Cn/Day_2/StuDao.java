package Cn.Day_2;

import java.awt.image.BufferedImageFilter;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class StuDao {
	private List<StuForm> stuForms = new ArrayList<StuForm>();
	private File file = new File("src/file/stus.txt");

	private void readStu() {

		if (!file.exists() && file.length() == 0) {
			return;
		}
		try {
			InputStream in = new FileInputStream(file);
			BufferedInputStream bid = new BufferedInputStream(in);
			ObjectInputStream ois = new ObjectInputStream(bid);
			stuForms = (List<StuForm>) ois.readObject();
		} catch (Exception e) {

		}
	}

	@Test
	public void queryAll() {
		readStu();
		System.out.println(stuForms);

	}

	public void delete(int id) {
		readStu();
		int index = 0;
		for (int i = 0; i < stuForms.size(); i++) {
			if (id == stuForms.get(i).getId()) {
				index = i;
			}
		}
		System.out.println(index);
		stuForms.remove(index);
		writeStu();

	}

	@Test
	public void add() {
		delete(1);
		
		queryAll();
	}

	public void addStu(StuForm stuForm) {
		if (file.exists() && file.length() > 0) {
			readStu();
		}
		stuForms.add(stuForm);
		writeStu();

	}

	private void writeStu() {
		try {
			OutputStream os = new FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(os);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(stuForms);
			oos.flush();
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
