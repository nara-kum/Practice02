package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("키과 몸무게를 입력해주세요.");
		System.out.print("키 : ");
		int tall = sc.nextInt();
		sc.nextLine();
		
		System.out.print("몸무게 : ");
		int weight = sc.nextInt();
		sc.nextLine();

		double std = (tall-100)*0.9;

		String result;
		
		if(weight>std) {
			result = "과체중";
		}else if (weight<std) {
			result = "저체중";
		}else {
			result = "표준";
		}
		
		System.out.println(result + " 입니다");
		System.out.println("표준체중 : "+ std);
		
		sc.close();

	}

}
