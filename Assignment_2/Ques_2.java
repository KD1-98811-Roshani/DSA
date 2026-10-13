package com.sunbeam;

import java.util.Scanner;

class Stack{
	private int arr[];
	private final int SIZE;
	private int top;
	
	public Stack(int size) {
		SIZE = size;
		arr = new int[SIZE];
		top = SIZE;
	}
	
	public void push(int value) {
		if(isFull()) {
			System.out.println("Stack is full");
		}else {
			top--;
			arr[top]=value;
		}
	}
	
	public int pop() {
		int temp = -1;
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}else {
			temp=arr[top];
			top++;
		}
		return temp;
	}
	
	public int peek() {
		int temp = -1;
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		}else {
			temp = arr[top];
		}
		return temp;
	}
	
	public boolean isEmpty() {
		return top == SIZE;
	}
	
	public boolean isFull() {
		return top == -1;
	}
	
}

public class Ques_2 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Push");
		System.out.println("2.Pop");
		System.out.println("3.Peek");
		System.out.println("Enter a choice : ");
		int choice = sc.nextInt();
		
		return choice;
	}

	public static void main(String[] args) {
		Stack st = new Stack(5);
		
		int choice;
		
		while((choice = menuList())!=0) {
			
			switch(choice) {
			case 1:
				System.out.println("Enter a key to be pushed : ");
				int key = sc.nextInt();
				st.push(key);
				System.out.println("key pushed successfully");
				break;
				
			case 2:
				System.out.println("Popped value  : "+st.pop());
				break;
				
			case 3:
				System.out.println("Peeked value : "+st.peek());
				break;
			}
		}
		
		

	}

}
