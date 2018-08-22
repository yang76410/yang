package Cn.Day_1;

import java.util.Scanner;

import org.junit.Test;

/** 
 * @author  洋  
 * @ClassName:Computer.java
 * @Description:
 * @date 创建时间:2018-6-28 下午12:05:52  
 */
public class Computer {
	private String name;
	private int count;
	public int Pk(){
		int k = (int) (Math.random()*3)+1;
		String s = null;
		switch (k) {
			case 1:s="剪刀";break;
			case 2:s="石头";break;
			case 3:s="布";break;
			default:break;
		}
		System.out.println(this.name + "出拳:" + s);
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
