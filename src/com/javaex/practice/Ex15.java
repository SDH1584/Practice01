package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("마일을 입력하세요 : ");
		double distance=sc.nextDouble();
		double mile=1.609;
		System.out.println(distance+"마일은 "+ mile*distance+"킬로미터 입니다");

	}
	}
