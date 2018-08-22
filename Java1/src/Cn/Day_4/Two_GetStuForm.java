package Cn.Day_4;
public class Two_GetStuForm implements Runnable {
	private Two_StuForm stuForm;

	public Two_GetStuForm(Two_StuForm stuForm) {
		this.stuForm = stuForm;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(stuForm);

		}

	}
}
