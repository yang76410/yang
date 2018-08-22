package Cn.Day_1;

import java.util.Scanner;

/** 
 * @author  洋  
 * @ClassName:People.java
 * @Description:
 * @date 创建时间:2018-6-28 下午2:37:39  
 */
public class People {
	private String name;
	private int count;
	private Scanner input = new Scanner(System.in);
	public int Pk(int k){
		String s = null;
		switch (k) {
			case 1:s="剪刀";break;
			case 2:s="石头";break;
			case 3:s="布";break;
			default:break;
		}
		System.out.println("你出拳:" + s);
		return k;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
}
