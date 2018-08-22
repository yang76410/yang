package Cn.Day_4;

/**
 * ������
 * 
 * @author fan
 *
 */
public class Two_SetStuForm implements Runnable {
	private Two_StuForm stuForm;

	public Two_SetStuForm(Two_StuForm stuForm) {
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
			stuForm.setId(1002 + i);
			stuForm.setName("b" + i);

		}

	}
}
