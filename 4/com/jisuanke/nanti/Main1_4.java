package com.jisuanke.nanti;

import java.math.BigInteger;
import java.util.Scanner;
/**
 * 题目考验：斐波那契计算
 * 此class由scepter于20182018年5月25日上午9:12:13创建
 * 通常class中的第一行代码：package *
 * 并不存在于“计蒜客”原答案中，是IDE创建class时不得不生成的
 * 可以，且建议删除，以免造成不必要的麻烦与误导
 * 计蒜客的类名要求必须是Main,请自行修改
 * 我的class命名规则为Main题库页码_当前页中的题目号码
 * 如Main1_1，意为题库第一页第一题
 */
public class Main1_4 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		input.close();
		//因int和long无法储存如此巨大的变量，所以用BigInteger方法来储存
		//BigInteger为无限整型方法，int实测达到47后会数据溢出导致出错
		BigInteger a,b,sum;//定义变量
		a=new BigInteger("1");//new一下，并赋值
		b=new BigInteger("1");
		sum=new BigInteger("0");
		if(n==0){//判断输入的值的大小，满足条件直接输出
			System.out.print(0);
		}else if(n==1||n==2){
			System.out.print(1);
		}else if(n>2){
			for(int q=2;q<n;q++) {//循环相加，直到不满足条件
				//F(n)=F(n-1)+F(n-2)
				//F(n)=sum;F(n-1)=a;F(n-2)=b;
				//F1=1;F2=1;F3=2;
				//第一次运算，将F1+F2的值储存到F3中
				//sum = a+b
				//然后将a变为F2,a=b;b变为F3,b=sum
				//第二次循环，F4=F3+F2,sum则变为F4，每循环一次则向后推进一次。
				sum=a.add(b);//a.add()为BigInteger类的add(加法)方法，在括号中放入要加的变量或常量
				a=b;//将a从F1移到F2
				b=sum;//将b从F2移到F3
			}
			System.out.println(sum);
		}
	}
}
