package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수익을 입력해 주세요");
		System.out.print("수익 : ");
		int income = sc.nextInt();
		
		double tax;
		
		if(income>8000) {
			tax = 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(income-8000);
			System.out.println("소득세는 "+ tax + " 입니다.");
		}else if (income>4000) {
			tax = 1000*0.09 + 3000*0.18 + 0.27*(income-4000);
			System.out.println("소득세는 "+ tax + " 입니다.");
		}else if (income>1000) {
			tax = 1000*0.09 + 0.18*(income-1000);
			System.out.println("소득세는 "+ tax + " 입니다.");
		}else if (income>=0){
			tax = 0.09*income;
			System.out.println("소득세는 "+ tax + " 입니다.");
		}else {
			System.out.println("잘못 입력했습니다");
		}
		
		sc.close();

	}

}
