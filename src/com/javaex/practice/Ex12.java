package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력해주세요");
		System.out.print("숫자1 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("숫자2 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("숫자3 : ");
		int num3 = sc.nextInt();
//		sc.nextLine();
		
		int min;
		
		if(num1>num2) {
			min = num2;
			
			if(num2>num3) {
				min = num3;
				System.out.println("가장 작은수는 " + min + " 입니다");
			} else {
				min = num2;
				System.out.println("가장 작은수는 " + min + " 입니다");
			}
		} else if(num1<num2) {
			min = num1;
			
			if(num1>num3) {
				min = num3;
				System.out.println("가장 작은수는 " + min + " 입니다");
			} else {
				min = num1;
				System.out.println("가장 작은수는 " + min + " 입니다");
			}
		}
		
		sc.close();

	}

}
