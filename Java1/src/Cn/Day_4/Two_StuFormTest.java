package Cn.Day_4;

import static org.junit.Assert.*;

import org.junit.Test;

public class Two_StuFormTest {

	// @Test
	// public void test() {
	// StuForm form = new StuForm();
	// form.setId(1001);
	// form.setName("a");
	// System.out.println(form);
	// }

	public static void main(String[] args) {
		// for (int i = 0; i < 10; i++) {
		Two_StuForm stuForm = new Two_StuForm();
		Two_SetStuForm form = new Two_SetStuForm(stuForm);
		Two_GetStuForm getStuForm = new Two_GetStuForm(stuForm);
		Thread thread = new Thread(form);
		Thread thread2 = new Thread(getStuForm);
		thread.start();
		thread2.start();
		// }

	}

}
