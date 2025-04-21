package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 2개를 입력해주세요");
		System.out.print("숫자1 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("숫자2 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		int result = num1-num2;
		
		if(result>0) {
			System.out.println("큰수 : " + num1 + " 작은수 : " + num2);
		}else {
			System.out.println("큰수 : " + num2 + " 작은수 : " + num1);
		}
		
		sc.close();

	}

}
