package com.jisuanke.nanti;

import java.util.Scanner;
/**
 * 
 * 创建者：scepter
 * 创建时间：20182018年5月31日上午9:56:18
 */
public class Main3 {
	public static void main(String[] args){
	    Scanner input = new Scanner(System.in);
	    int n=input.nextInt();
	    input.close();
	     //根据质数的特性：不能被除了1和它本身外的任何整数整除
	     //从2开始循环（被1整除），直到n-1次（被它本身整除）
	    for(int i=2;i<n;i++){
	        if(n%i==0){//判断是否能被整除
	            System.out.println("NO");
	            return;
	            	//能被整除，则输出NO并结束循环（return）
	          }
	    }
	    //循环结束，不能被整除，输出YES
	   System.out.println("YES");
	}
}
