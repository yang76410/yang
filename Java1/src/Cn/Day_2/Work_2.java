package Cn.Day_2;
/** 
 * @author  洋  
 * @ClassName:Work_2.java
 * @Description:
 * @date 创建时间:2018-6-28 下午5:22:32  
 */
public class Work_2 {
	private int id;
	private String name;
	private String sex;
	private int age;
	public Work_2() {
		this(1001,"null",null,12);
	}
	@Override
	public String toString() {
		return "EmpForm [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}

	public Work_2(byte id) {
		System.out.println("23");
	}
	public Work_2(int id) {
		System.out.println("2");
	}
	public  Work_2(double id) {
		System.out.println("4");
	}
	public  Work_2(float id) {
		System.out.println("5");
		this.age=30;
	}
	public Work_2(String name) {
		super();
		System.out.println("3");
		this.name=name;
	}
	public Work_2(int id, String name, String sex, int age) {
		this.id = id;
		this.sex = sex;
		this.age = age;
	}
	public Work_2(int id, String name,  int age,String sex) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	
	public static void main(String[] args) {
		Work_2 e=  	new Work_2(); 
		Work_2 e1= new Work_2(1.4F);
		new Work_2("");
		new Work_2(12,"","",12); 
		new Work_2(12,"",12,""); 
		byte as=12;
		new Work_2(as);
		System.out.println(e);
		System.out.println(e1);
	}
	
	
	
	

}
