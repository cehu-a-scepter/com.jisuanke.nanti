package com.jisuanke.nanti;

import java.util.Scanner;
/**
 * 
 * 创建者：scepter
 * 创建时间：20182018年5月31日上午9:57:12
 */
public class Main8{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		System.out.println(str_len(str));
		input.close();
	}
	static int str_len(String str)
	{//请在这里完成代码
		return str.length();//直接使用length方法
	}

}