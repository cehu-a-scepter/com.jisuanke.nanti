package com.jisuanke.nanti;//“计蒜客”答案中未包含此代码，请删除，以免误导

import java.util.Scanner;//导入java.util包中的Scanner类
/**
 * 题目考验：加法计算
 * 此class由scepter于20182018年5月23日上午12:49:27创建
 * 通常class中的第一行代码：package *
 * 并不存在于“计蒜客”原答案中，是IDE创建class时不得不生成的
 * 可以，且建议删除，以免造成不必要的麻烦与误导
 * 计蒜客的类名要求必须是Main,请自行修改
 * 我的class命名规则为Main题库页码_当前页中的题目号码
 * 如Main1_1，意为题库第一页第一题
 */
public class Main1_1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);//创建对象用于获取键盘输入
		int a=input.nextInt(),b=input.nextInt(),c=input.nextInt();//定义变量a,b,c并将键盘输入的int类型值赋给变量
		input.close();//键盘输入关闭
		System.out.println(a+b+c);//输出3个变量的值相加的结果
	}
}