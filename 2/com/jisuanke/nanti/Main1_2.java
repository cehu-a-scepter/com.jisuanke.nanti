package com.jisuanke.nanti;

import java.util.Scanner;//导入java.util包中的Scanner类
/**
 * 此class由scepter于20182018年5月23日上午12:50:10创建
 * 通常class中的第一行代码：package *
 * 并不存在于“计蒜客”原答案中，是IDE创建class时不得不生成的
 * 可以，且建议删除，以免造成不必要的麻烦与误导
 * 计蒜客的类名要求必须是Main,请自行修改
 * 我的class命名规则为Main题库页码_当前页中的题目号码
 * 如Main1_1，意为题库第一页第一题
 */
public class Main1_2 {
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
