package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호 : ");
		String mark = sc.nextLine();
		
		System.out.print("숫자1 : ");
		double num1 = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("숫자2 : ");
		double num2 = sc.nextDouble();
		
		double result;
		
		switch(mark) {
		
		case "+":
			result = num1+num2;
			System.out.println("결과는 :"+result);
			break;
		
		case "-":
			result = num1-num2;
			System.out.println("결과는 :"+result);
			break;
			
		case "*":
			result = num1*num2;
			System.out.println("결과는 :"+result);
			break;

		case "/":
			if(num2==0) {
				System.out.println("계산할 수 없습니다");
				break;
			}else {
				result = num1/num2;
				System.out.println("결과는 :"+result);
				break;
			}
		
		}
		sc.close();

	}

}
