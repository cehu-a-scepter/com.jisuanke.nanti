package com.jisuanke.nanti;

import java.util.Scanner;
/*import java.util.Arrays;附加功能，答案中不需要此项*/
/**
 * 
 * 创建者：scepter
 * 创建时间：20182018年5月31日上午9:57:33
 */
public class Main9 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int x=0,del;
		int[] arr=new int[input.nextInt()];//升级优化，直接输入数组长度
		for(int a=0;a<arr.length;a++) {
			arr[a]=input.nextInt();//输入数据到数组arr
		}
		del=input.nextInt();//选择要忽略的元素
		for(int b=0;b<arr.length;b++) {//循环过滤要忽略的元素
			if(arr[b]==del) {//检测是否忽略
				continue;//忽略，跳过本次循环
			}
			x++;
		}
		System.out.println(x);//输出忽略后的数组长度
		input.close();
		/*
		 * 附加功能，从原数组中剔除忽略元素然后转储到新数组
		int[] newarr=new int[x];//定义一个新数组
		int y=0;
		for(int c=0;c<arr.length;c++) {//循环录入数据到新数组
			if(arr[c]==del) {//判断该元素是否被忽略，若忽略则跳过此次循环
				continue;
			}
			newarr[y]=arr[c];//录入数据到新数组
			y++;
		}
		System.out.println(Arrays.toString(arr));//原数组
		System.out.println(Arrays.toString(newarr));//输出新数组中的元素
		*/
	}
}
