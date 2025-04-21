package com.javaex.practice;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("태어난 년도를 입력해주세요");
		System.out.print("년도 : ");
		int boarn = sc.nextInt();
		int year = 2025;
		System.out.println("올해 : "+ year);
		System.out.println("태어난 해 : "+ boarn);
		int age = 2025-boarn;
		System.out.println("나이 : "+ age);
		
		System.out.println("=================================");
		
		if(age>=20) {
			System.out.println("20세 이상");
			if(boarn%2==0&&year%2==0) {
				System.out.println("건강검진해");
				if(age>=40) {
					System.out.println("암 검사");
				}
			}else if (boarn%2==0&&year%2!=0) {
				System.out.println("건강검진해 아님");
			}else if (boarn%2==1&&year%2==1) {
				System.out.println("건강검진해");
				if(age>=40) {
					System.out.println("암 검사");
				}
			}else if (boarn%2==0&&year%2!=1) {
				System.out.println("건강검진해 아님");
			}
		}else {
			System.out.println("20세 미만");
			System.out.println("건강검진 대상 아님");
		}
		
		sc.close();

	}

}
