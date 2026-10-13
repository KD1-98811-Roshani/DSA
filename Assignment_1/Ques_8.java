package com.sunbeam;

public class Ques_8 {
	
	public static int nonRepElement(int arr[]) {
		
		for(int i=0; i<arr.length; i++) {
			int count = 0;
			for(int j=0; j<=arr.length-1; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count==1) {
				return arr[i];
			}
		}
		return -1;
		
		
	}

	public static void main(String[] args) {
		
		int arr[] =  { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8};
        
		int index = nonRepElement(arr);
		
		if(index != -1) {
			System.out.println("Key value is : "+index);
		}else
			System.out.println("Key is not found");
	}

}
