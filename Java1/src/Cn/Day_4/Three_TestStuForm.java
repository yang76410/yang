package Cn.Day_4;

public class Three_TestStuForm {
	public static void main(String[] args) {
		Three_StuForm stuForm = new Three_StuForm(false);
		Thread thread1=new Thread(new Three_SetStuForm(stuForm));
		Thread thread2=new Thread(new Three_GetStuForm(stuForm));
		thread1.start();
		thread2.start();
	}

}
