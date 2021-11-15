package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("500원 동전 갯수 : ");
	int fh=sc.nextInt();
	System.out.print("100원 동전 갯수 : ");
	int h=sc.nextInt();
	System.out.print("50원 동전 갯수 : ");
	int ft=sc.nextInt();
	System.out.print("10원 동전 갯수 : ");
	int ten=sc.nextInt();
	
	int a=fh*500;
	int b=h*100;
	int c=ft*50;
	int d=ten*10;
	
	int sum=a+b+c+d;
	
	System.out.println("동전의 총합은 "+sum	+" 원 입니다 .");
}
}
