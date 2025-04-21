package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이 : ");
		
		int age = sc.nextInt();
		String group;
		
		if(age>=19 && age <65) {
			group = "1번그룹";
		}else {
			group = "2번그룹";
		}
		
		System.out.println(group + " 입니다.");
		
		sc.close();
		
	}

}
