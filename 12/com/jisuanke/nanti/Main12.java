package com.jisuanke.nanti;

import java.util.Scanner;
public class Main12 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String a=input.nextLine(),b=" ";char c;
		input.close();
		int y=0;
		for(int i=a.length();i>=0;i--) {
			c=a.charAt(i);
			if(b.equals(c)) {
				return;
			}
			y++;
		}
		System.out.println(y);
		//未完待续
	}
}
