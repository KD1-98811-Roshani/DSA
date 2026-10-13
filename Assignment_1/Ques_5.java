package com.sunbeam;

import java.util.Scanner;

public class Ques_5 {
	
	public static int fibonacci(int n) {
		
		if(n==1) {
			return 0;
		}
		if(n==2) {
			return 1;
		}
		return fibonacci(n-1) + fibonacci(n-2);
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		int res = fibonacci(n);
		
		System.out.println("nth term of fibbonacci series is : "+res);
	}

}
