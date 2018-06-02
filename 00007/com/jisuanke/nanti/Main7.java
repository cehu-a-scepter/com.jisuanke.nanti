package com.jisuanke.nanti;

import java.util.Scanner;
/**
 * 
 * 创建者：scepter
 * 创建时间：20182018年5月31日上午9:57:02
 */
public class Main7 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String a=input.nextLine(),b=input.nextLine();//用String变量来储存输入
		for(int i=0;i<a.length();i++) {//循环检测
			if(a.charAt(i)==b.charAt(i)) {//使用charAt方法导出字符串中指定位置的字符
				System.out.print("1");//比较两个字符串中指定位置的字符，相等则输出1
			}else {
				System.out.print("0");//相反则输出0
			}
		}
		input.close();
	}
}