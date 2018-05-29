package com.jisuanke.nanti;

import java.util.Scanner;//导入java.util包中的Scanner类
/**
 * 此class由scepter于20182018年5月25日上午9:11:56创建
 * 通常class中的第一行代码：package *
 * 并不存在于“计蒜客”原答案中，是IDE创建class时不得不生成的
 * 可以，且建议删除，以免造成不必要的麻烦与误导
 * 计蒜客的类名要求必须是Main,请自行修改
 * 我的class命名规则为Main题库页码_当前页中的题目号码
 * 如Main1_1，意为题库第一页第一题
 */
public class Main1_3 {
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
