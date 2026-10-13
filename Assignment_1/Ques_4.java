package com.sunbeam;

import java.util.Scanner;

public class Ques_4 {

	public static int binarSearch(int[] arr, int key) {
		int left=0, right=arr.length-1, mid;
		
		while(left <= right) {
			mid = (left+right) / 2;
			if(key==arr[mid]) {
				return mid;
			}
			else if(key < arr[mid]) {
				left = mid-1;
			}
			else {
				right = mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {99, 88, 77, 66, 55, 44, 33, 22, 11};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a key to be searched : ");
		int key = sc.nextInt();
		int index = binarSearch(arr, key);
		
		if(index != -1) {
			System.out.println("Key is at index : "+index);
		}else
			System.out.println("Key is not found");

	}

	

}
