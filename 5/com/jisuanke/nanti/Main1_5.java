package com.jisuanke.nanti;

import java.util.Scanner;
/**
 * 此class由scepter创建于20182018年5月27日下午1:54:39
 * 通常class中的第一行代码：package *
 * 并不存在于“计蒜客”原答案中，是IDE创建class时不得不生成的
 * 可以，且建议删除，以免造成不必要的麻烦与误导
 * 计蒜客的类名要求必须是Main,请自行修改
 * 我的class命名规则为Main题库页码_当前页中的题目号码
 * 如Main1_1，意为题库第一页第一题
 */
public class Main1_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m=input.nextInt();//行数
		int n=input.nextInt();//列数
		int t=input.nextInt();//翻转方向
		input.close();
		int h=0;//矩阵标识
		int[][] arr = new int [m][n];//定义数组用于储存矩阵
		for(int a=0;a<m;a++) {//第一维循环
			for(int b=0;b<n;b++) {//第二维循环
				if(h==10) {//根据题目要求，矩阵标识只能是0到9
					h=0;//当h等于10时归零
				}
				arr[a][b]=h;h++;//将h的值循环输入到数组中
			}
		}
		switch(t) {//选择翻转要求
		case 0:{//左右翻转
			for(int x=0;x<m;x++) {//从第一维的第一位开始
				for(int y=n-1;y>=0;y--) {//从第二维的最后一位开始
					System.out.print(arr[x][y]+" ");//循环输出
				}
				System.out.println();//换行
			}
			break;//执行完毕跳出循环
		}
		case 1:{//上下翻转
			for(int x=m-1;x>=0;x--) {//从第一维的最后一位开始
				for(int y=0;y<n;y++) {//从第二维的第一位开始
					System.out.print(arr[x][y]+" ");//循环输出
				}
				System.out.println();//换行
			}
			break;//执行完毕跳出循环
		}
		case 2:{//输出上下左右翻转的矩阵（附加功能）
			for(int x=m-1;x>=0;x--) {//从第一维的最后一位开始
				for(int y=n-1;y>=0;y--) {//从第二维的最后一位开始
					System.out.print(arr[x][y]+" ");//循环输出
				}
				System.out.println();//换行
			}
			break;//执行完毕跳出循环
		}
		case 3:{//输出正常顺序的矩阵（附加功能）
			for(int q=0;q<m;q++) {//从第一维的第一位开始
				for(int w=0;w<n;w++) {//从第二维的第一位开始
					System.out.print(arr[q][w]+" ");//循环输出
				}
				System.out.println("");//换行
			}
			break;//执行完毕跳出循环
		}
		default :
			System.out.println("请选择翻转顺序！");//输入错误提示
			break;//执行完毕跳出循环
		}
	}
}