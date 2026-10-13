package com.sunbeam;

import java.util.Scanner;

class Queue{
	private int arr[];
	private final int SIZE;
	private int front, rear;
	
	public Queue(int size) {
		SIZE=size;
		arr = new int[SIZE];
		front = rear = 0;
	}
	
	public void offer(int value) {
		if(isFull()) {
			System.out.println("Queue is full");
		}else {
			rear++;
			arr[rear]=value;
		}
	}
	
	public int poll() {
		int temp = -1;
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}else {
			temp=arr[front + 1];
		}
		if(front == rear) {
			front = rear = 0;
		}
		return temp;
	}
	
	public int peek() {
		int temp = -1;
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}else {
			temp=arr[front + 1];
		}
		return temp;
	}
	
	public boolean isEmpty() {
		return front == rear;
	}
	
	public boolean isFull() {
		return rear == SIZE - 1;
	}


}

public class Ques_1 {
	
public static Scanner sc = new Scanner(System.in);
	
	public static int menuList() {
		System.out.println("1.Offer");
		System.out.println("2.Poll");
	    System.out.println("3.Peek");
	    System.out.println("4.Exit");
	    System.out.println("Enter a choice : ");
	    int choice = sc.nextInt();
	    
	    return choice;
	}

	public static void main(String[] args) {
		
		Queue q = new Queue(4);
		
		int choice;
		
		while((choice = menuList())!=4) {
			
			switch(choice) {
			case 1:
				System.out.println("Enter value to be pushed : ");
				int value = sc.nextInt();
				q.offer(value);
				break;
				
			case 2:
				System.out.println("Popped value : "+q.poll());
				break;
				
			case 3:
				System.out.println("Peeked value : "+q.peek());
				break;
			}
		}
		

	}

}
