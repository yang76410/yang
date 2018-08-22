package Cn.Day_2;

import java.io.Serializable;

public class TeacherForm implements Serializable{
	private int id;
	private String name;
	private String sex;

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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public TeacherForm(int id, String name, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
	}

	public TeacherForm(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}

	public TeacherForm() {
		super();
	}

	public TeacherForm(int id, String name) {
		this.id=id;
		this.name=name;
	}

	@Override
	public String toString() {
		return "TeacherForm [id=" + id + ", name=" + name + ", sex=" + sex + "]";
	}

}
