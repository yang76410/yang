package Cn.Day_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/** 
 * @author  洋  
 * @ClassName:Work_1.java
 * @Description:
 * @date 创建时间:2018-6-28 下午12:07:30  
 */
public class Work_1 {
	/*
	 * 红球+球=6+1
	 * 球=1-16
	 * 红球=1-33
	 * */
	
	public static void main(String[] args) {
		int a[]=Init();		//随机生成双色球
		Scanner input = new Scanner(System.in);
		int b[] = new int[a.length];
		b=Buy();
		System.out.println("本期双色球号码为:"+Arrays.toString(a));
		System.out.println("你所购买的双色球号码为:"+Arrays.toString(b));
		if(D(a,b)){
			System.out.println("恭喜你，中奖哦");
		}
		else {
			System.out.println("很遗憾，你没有中奖");
		}
	}
	public static int[] Init(){
		int[] a = new int[7];
		Random r = new Random();
		for(int i=0;i<a.length-1;i++){
			a[i]=r.nextInt(33)+1;
		}
		a[6]=r.nextInt(16)+1;
		return a;
	}
	public static int[] Buy(){
		int[] b = new int[7];
		int k=0;
		Scanner input = new Scanner(System.in);
		for(int i=0;i<b.length-1;i++){
			System.out.print("购买第"+i+"个红球:(1-33之间):");
			k=input.nextInt();
			if(k>0&&k<34){
				b[i]=k;
			}
			else {
				i=i-1;
			}
		}
		while (k!=0) {
			System.out.print("购买的球:");
			k=input.nextInt();
			if(k==0){
				k=-1;
			}
			if(k>0&&k<17){
				b[6]=k;
				k=0;
			}
		}
		return b;
	}
	public static Boolean D(int a[],int b[]){		//判断是否中奖
		Boolean f = true;
		for(int i=0;i<a.length;i++){
			if(a[i]!=b[i]){
				f=false;
			}
		}
		return f;
	}
	public static boolean W(int k,int b[]){			//判断是否重复
		return Arrays.asList(b).contains(k);		
	}
}
