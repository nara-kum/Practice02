package com.javaex.practice;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사번(정수)를 입력해주세요");
		System.out.print("사번 : ");
		int num = sc.nextInt();
		
		String team;
		
		if (num==0){
			team = "잘못된 사번입니다.";
		}else if (num%3==0) {
			team = "A팀 입니다.";
		}else if (num%3==1) {
			team = "B팀 입니다.";
		}else if (num%3==2)  {
			team = "C팀 입니다.";
		}else {
			team = "잘못 입력하셨습니다.";
		}
		
		System.out.println(team);
		
		sc.close();

	}

}
