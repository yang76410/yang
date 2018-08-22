package Cn.Day_2;
/** 
 * @author  洋  
 * @ClassName:Work_1.java
 * @Description:
 * @date 创建时间:2018-6-28 下午4:47:39  
 */
public class Work_1 {
	private int age;
	private String name;
	public Work_1() {
	}

	public void setAge(int  age) {
		/**
		 * 使用参数
		 */
		this.age = age;  
	}
	public static void main(String[] args) {
		Work_1 demo=new Work_1();
		demo.setAge(20);
		System.out.println(demo.age);
	}
}
