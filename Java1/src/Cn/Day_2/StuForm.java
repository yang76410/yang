package Cn.Day_2;

import java.io.Serializable;

public class StuForm implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StuForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StuForm(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "StuForm [id=" + id + ", name=" + name + "]";
	}

}
