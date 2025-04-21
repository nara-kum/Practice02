package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		System.out.print("알파벳 : ");
		String aphb = sc.nextLine();
		
		if(aphb.equals("a")||aphb.equals("e")||aphb.equals("i")||aphb.equals("o")||aphb.equals("u")) {
			System.out.println("모음입니다.");
		}else {
			System.out.println("자음입니다.");
		}
		
		sc.close();
		
	}

}
