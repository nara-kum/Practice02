package com.javaex.practice;

import java.util.Scanner;

public class Ex22 {
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
		
		int max;
		
		if(num1>num2) {
			max = num1;
			if(num1>num3) {
				max = num1;
				System.out.println("가장 큰수는 " + max + " 입니다");
			} else {
				max = num3;
				System.out.println("가장 큰수는 " + max + " 입니다");
			}
		}else if(num1<num2) {
			max = num2;
			if(num2>num3) {
				max = num2;
				System.out.println("가장 큰수는 " + max + " 입니다");
			} else {
				max = num3;
				System.out.println("가장 큰수는 " + max + " 입니다");
			}
		}
		
		sc.close();
		
	}

}
