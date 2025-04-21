package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		int result = num1-num2;
		int share;
		int left;
		
		if(result>0) {
			share = num1/num2;
			System.out.println("몫 : " + share);
			left = num1%num2;
			System.out.print("나머지 : " + left);
		}else if(result<0) {
			share = num2/num1;
			System.out.println("몫 : " + share);
			left = num2%num1;
			System.out.print("나머지 : " + left);
		}else {
			share = num2/num1;
			System.out.println("몫 : " + share);
			left = num2%num1;
			System.out.print("나머지 : " + left);
		}
	
		
		sc.close();

	}

}
