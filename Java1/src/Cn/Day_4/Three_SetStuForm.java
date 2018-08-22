package Cn.Day_4;

public class Three_SetStuForm implements Runnable {
	private Three_StuForm stuForm = new Three_StuForm(true);

	public Three_SetStuForm(Three_StuForm stuForm) {
		this.stuForm = stuForm;
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			stuForm.set(i, "a" + i++);
		}

	}

}
