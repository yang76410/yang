package Cn.Day_4;

public class Three_StuForm {
	private int id;
	private String name;
	private boolean falg = false;

	public Three_StuForm(boolean falg) {
		this.falg = falg;

	}

	public synchronized void set(int id, String name) {
		if (!this.falg) { // !this.falg=false
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.id = id;
		this.name = name;
		this.falg = false;
		this.notify();

	}

	public synchronized void get() {
		if (this.falg) { // this.falg=true
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(this);
		this.falg = true;
		this.notify();

	}

	@Override
	public String toString() {
		return "StuForm [id=" + id + ", name=" + name + ", falg=" + falg + "]";
	}

}
