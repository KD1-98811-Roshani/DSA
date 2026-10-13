package com.sunbeam;

import java.util.Scanner;

public class Ques_2 {

	public static int lastOccurence(int[] arr, int key) {
		int index = 0;
		for(int i=0; i<arr.length; i++) {
			if(key==arr[i]) {
				index = i;
			}
		}
		return index;
		
	}
	
	public static void main(String[] args) {
		int arr[] = {22, 33, 88, 55, 44, 66, 11, 88, 77};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a key to be searched : ");
		int key = sc.nextInt();
		
		int index = lastOccurence(arr, key);
		
		if(index != -1) {
			System.out.println("Key ia at index : "+index);
		}else {
			System.out.println("Key is not found");
		}

	}

	

}
