package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이 : ");
		int age = sc.nextInt();
		String group;
		String fee;
		
		if(age>=20) {
			group = "성인";
			fee   = "/5000원";
		}else if (age>=17){
			group = "고등학생";
			fee   = "/4000원";			
		}else if (age>=14){
			group = "중학생";
			fee   = "/3000";
		}else if (age>=8){
			group = "초등학생";
			fee   = "/2000";
		}else {
			group = "취학전아동";
			fee   = "/무료";
		}

		System.out.println(group + fee +" 입니다.");
		
		sc.close();

	}

}
