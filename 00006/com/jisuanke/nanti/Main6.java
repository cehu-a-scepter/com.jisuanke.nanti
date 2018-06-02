package com.jisuanke.nanti;

import java.util.Scanner;
/**
 * 
 * 创建者：scepter
 * 创建时间：20182018年5月31日上午9:56:53
 */
public class Main6 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();//人数
		while(n!=-1) {//判断是否还有下个班级
			int x,y,z,average,sum=0;
			String victim=null,thief=null;
			int[] volume=new int[n];//定义数组储存粘土体积
			String[] name=new String[n];//定义数组储存姓名
			for(int i=0;i<n;i++) {//循环收集数据
				x=input.nextInt();//长
				y=input.nextInt();//宽
				z=input.nextInt();//高
				volume[i]=x*y*z;//储存每个学生粘土体积
				name[i]=input.next();//储存每个学生姓名
				sum+=x*y*z;//此班粘土总量
			}
			average=sum/n;//计算粘土平均量
			for(int a=0;a<n;a++) {//判断是否有学生的粘土少了
				if(volume[a]<average) {//若粘土少了则标记为受害者
					victim=name[a];//记录受害者姓名
				}else if(volume[a]>average) {//若粘土多了则标记为贼娃子
					thief=name[a];//贼娃子名字
				}
			}
			System.out.println(thief+" took clay from "+victim+".");//输出结果
			n=input.nextInt();//下个班级人数
		}
		input.close();
	}
}