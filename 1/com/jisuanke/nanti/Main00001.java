package com.jisuanke.nanti;//“计蒜客”答案中未包含此代码，请删除，以免误导

import java.util.Scanner;//导入java.util包中的Scanner类
/**
 * 
 * 创建者：scepter
 * 创建时间：20182018年5月31日上午9:55:53
 */
public class Main00001 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);//创建对象用于获取键盘输入
		int a=input.nextInt(),b=input.nextInt(),c=input.nextInt();//定义变量a,b,c并将键盘输入的int类型值赋给变量
		input.close();//键盘输入关闭
		System.out.println(a+b+c);//输出3个变量的值相加的结果
	}
}
