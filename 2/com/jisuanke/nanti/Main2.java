package com.jisuanke.nanti;

import java.util.Scanner;//导入java.util包中的Scanner类
/**
 * 
 * 创建者：scepter
 * 创建时间：20182018年5月31日上午9:56:09
 */
public class Main2 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
	   int m=input.nextInt(),n=input.nextInt();
	   input.close();
	   if(m%n==0){//使用取余算术运算符判断是否有余数
	       System.out.println("YES");//没有余数，则能被整除
	   }else{
	       System.out.println("NO");//反之，无法整除
	    }
    }
}
