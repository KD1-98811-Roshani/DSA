package com.sunbeam;

import java.util.Scanner;

public class Ques_3 {

	public static int nth_occurence(int[] arr, int key, int occur) {
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(key==arr[i]) {
				count++;
				if(occur==count) {
					return i;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {15, 58, 25, 39, 18, 44, 25, 58, 25, 47};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a key to be searched : ");
		int key = sc.nextInt();
		System.out.println("Enter an occurence : ");
		int occur = sc.nextInt();
		int index = nth_occurence(arr, key, occur);
		
		if(index != -1) {
			System.out.println("Key is at index : "+index);
		}else
			System.out.println("Key is not found");

	}

}
