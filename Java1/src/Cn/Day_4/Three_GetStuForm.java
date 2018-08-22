package Cn.Day_4;

public class Three_GetStuForm implements Runnable {
	private Three_StuForm stuForm = new Three_StuForm(true);

	public Three_GetStuForm(Three_StuForm stuForm) {
		this.stuForm = stuForm;
	}

	@Override
	public void run() {
		while (true) {
			stuForm.get();
		}

	}

}
