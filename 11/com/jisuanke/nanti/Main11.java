package com.jisuanke.nanti;

import java.util.Scanner;
/**
 * 备注：题库中并没有第10题，这题编号为11
 * 创建者：scepter
 * 创建时间：20182018年6月1日上午7:42:57
 */
public class Main11 {
	public static void main(String[] args) {
		//备注：题目是升序排列的数组！
		Scanner input=new Scanner(System.in);
		int n=input.nextInt(),x=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		for(int i=0;i<n-1;i++) {//因i<n-1所以i+1不会溢出
			if(arr[i]!=arr[i+1]) {//判断
				x++;//统计非重复元素的数量
			}
		}
		System.out.println(x+1);
		input.close();
	}
}