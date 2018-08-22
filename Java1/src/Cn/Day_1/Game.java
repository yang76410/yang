package Cn.Day_1;

import java.util.Scanner;

/** 
 * @author  洋  
 * @ClassName:Game.java
 * @Description:
 * @date 创建时间:2018-6-28 下午2:36:56  
 */
public class Game {
	private People jia;
	private Computer yi;
	private int num;			
	private Scanner input = new Scanner(System.in);
	public void	initial(People jia,Computer yi) {
		this.jia=jia;
		this.yi=yi;
		num=0;
		System.out.println("---------------欢迎进入游戏世界----------------");
		System.out.println("\t**********************" +
							"\n\t**      猜拳,开始                 **" +
							"\n\t**********************\n");
		System.out.println("出拳规则:1.剪刀 2.石头 3.布");
	}
	public void startGame() {
		System.out.print("请选择对方角色（1：刘备 2：孙权 3：曹操）：");
		int k = input.nextInt();
		switch (k) {
			case 1:this.yi.setName("刘备");break;
			case 2:this.yi.setName("孙权");break;
			case 3:this.yi.setName("曹操");break;
			default:break;
		}
		System.out.print("请输入你的角色名:");
		this.jia.setName(input.next());
		System.out.println(jia.getName() + " VS " + yi.getName() + " 对战");
		System.out.print("要开始吗？(y/n):");
		String str = input.next();
		while(str.equals("y")){
			System.out.print("请出拳:1.剪刀 2.石头 3.布(输入相应数字):");
			int j=this.jia.Pk(input.nextInt());
			int y=this.yi.Pk();
			if(j==y){
				System.out.println("结果:平局");
				this.num+=1;
			}
			else if ((j==1&&y==2)||(j==2&&y==3)||(j==3&&y==1)) {
				System.out.println("结果:呵呵，笨笨，你输了");
				this.num+=1;
				this.yi.setCount(this.yi.getCount()+1);
			}
			else if((j==1&&y==3)||(j==2&&y==1)||(j==3&&y==2)){
				System.out.println("结果:恭喜，你赢了");
				this.num+=1;
				this.jia.setCount(this.jia.getCount()+1);
			}
			System.out.print("是否开始下一轮？(y/n):");
			str = input.next();
		}
		
	}
	public void endGame(){
		System.out.println("------------------------------");
		if(this.num==0){
			System.out.println("临阵脱逃啊！!!!!!!");
			return;
		}
		System.out.println(jia.getName() + " VS " + yi.getName());
		System.out.println("对战次数:" + this.num);
		System.out.println("姓名\t得分");
		System.out.println(this.jia.getName() + "\t" + this.jia.getCount());
		System.out.println(this.yi.getName() + "\t" + this.yi.getCount());
		if(this.jia.getCount()<this.yi.getCount()){
			System.out.println("你输了耶!");
		}
		else if(this.jia.getCount()==this.yi.getCount()){
			System.out.println("平局，差点就赢啦!");
		}
		else {
			System.out.println("nice,赢啦赢啦!");
		}
	}
	public static void main(String[] args) {
		Game g = new Game();
		People p = new People();
		Computer c = new Computer();
		g.initial(p, c);
		g.startGame();
		g.endGame();
	}
}
