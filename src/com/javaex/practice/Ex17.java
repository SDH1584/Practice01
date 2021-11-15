package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("반지름 : " );
		double radius=sc.nextDouble();
		double volume=4*3.14*radius*radius*radius/3;
		System.out.println("구의 부피는 : "+volume+"입니다");
	
	}
}
