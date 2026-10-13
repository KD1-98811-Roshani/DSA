package com.sunbeam;

import java.util.Scanner;

class CircularQueue{
	private int arr[];
	private final int SIZE;
	private int front, rear;
	private int count;
	
	public CircularQueue(int size) {
		this.SIZE = size;
		arr = new int[SIZE];
		front = -1;
		rear = -1;
		count = 0;
	}
	
	public void offer(int value) {
		if(isFull())
			System.out.println("Queue is full");
		else {
			rear = (rear + 1) % SIZE;
			arr[rear] = value;
			count++;
		}
	}
	
	public int poll() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}
		front = (front + 1) % SIZE;
		int temp = arr[front];
		count--;
		if(count == 0)
			front = rear = -1;
		return temp;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}
		int temp = arr[front];
		front = (front + 1) % SIZE;
		return temp;
	}
	
	public int display() {
		System.out.println("Queue is : ");
		
		for(int i=0; i<count; i++) {
			System.out.println(" "+arr[front=(front+1)%SIZE]);
		}
		System.out.println("");
		return count;
	}
	
	public boolean isEmpty() {
		return count == 0;
	}
	
	public boolean isFull() {
		return count == SIZE;
	}
}
public class Ques_3 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static int menuList() {
		
		System.out.println("0.Exit");
		System.out.println("1.Offer");
		System.out.println("2.Poll");
		System.out.println("3.Peek");
		System.out.println("4.Display queue");
		
		System.out.println("Enter a choice : ");
		
		int choice = sc.nextInt();
		
		return choice;
	}


	public static void main(String[] args) {
		
		System.out.println("Enter a size of queue : ");
		int size = sc.nextInt();
		
		CircularQueue q = new CircularQueue(size);
		
		int choice;
		
		while((choice = menuList())!=0) {
			
			switch(choice) {
			
			case 1:
				System.out.println("Enter a value to be pushed : ");
				int value = sc.nextInt();
				q.offer(value);
				System.out.println("Value added successfull");
				break;
				
			case 2:
				System.out.println("Removed value : "+q.poll());
				break;
				
			case 3:
				System.out.println("Peeked element : "+q.peek());
				break;
				
			case 4:
				System.out.println("Queue is : "+q.display());
				break;
			}
		}
	}

}
