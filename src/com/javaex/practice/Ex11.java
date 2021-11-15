package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int save=sc.nextInt();
		int x=12;
		System.out.print("월급을 입력하세요 : ");
		System.out.println("10년동안 최대 저축액은 "+x*save);
		}

}
