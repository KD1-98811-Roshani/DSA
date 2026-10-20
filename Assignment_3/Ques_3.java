
public class Ques_3 {
		static class Node{
		private int data;
		private Node next;
		
		public Node(int value) {
			data  = value;
			next = null;
			
		}
	}
	
	private Node head,tail;
	int size;
	
	public Ques_3() {
		head = tail = null;
		
	}
	
	public boolean isEmpty() {
		return head == null && tail == null;
	}
		
	public void display() {
		if(isEmpty()) {
			System.out.println("List is Empty");
			return;
		}
		Node trav = head;
		System.out.println("List : ");
		
		do {
			System.out.println(" " + trav.data);
			trav = trav.next;
		}
		while(trav != head) ;
		System.out.println(" ");
	}
		
	
	public void addPosition(int value, int pos) {
		Node newnode = new Node(value);		
		
//		if(pos < 1 || pos > size + 1) {
//			System.out.println("invalid");
//			return;
//		}
		
		if(isEmpty()) {
			head = tail = newnode;
			tail.next = head;
		}
	
		else if(pos ==1) {
			newnode.next = head;
			tail.next = newnode;
			head = newnode;
		}
		
		else if(pos == size + 1)
		{
			newnode.next = head;
			tail.next = newnode;
			tail = newnode;
		}
		else {
			Node trav = head;
			for(int i = 1;i<pos-1;i++) {
				trav = trav.next;
			}
			newnode.next = trav.next;
			trav.next = newnode;
		}
		
				
	}
	
	public void deletePosition(int pos) {
		
//		if(isEmpty() || pos < 1 || pos > size) {
//			System.out.println("Invalid");
//			return;
//		}
		
		if(head == tail) {
			head = tail = null;
		}
		else if(pos == 1) {
			tail.next = head.next;
			head = head.next;
		}
		else if(pos == size) {
			Node trav = head;
			for(int i = 1;i< pos -1;i++) {
				trav = trav.next;
			}
			trav.next = head;
			tail = trav;
		}
		else {
			Node trav = head;
			for(int i = 1;i < pos -1; i++) {
				trav = trav.next;
			}
			trav.next = trav.next.next;
		}
	}
	
	public static void main(String[] args) {
		Ques_3 list = new Ques_3();
		
		list.addPosition(10, 1);
		list.addPosition(20, 2);
		list.addPosition(30, 3);
		
		list.display();
		
		list.deletePosition(2);
		
		list.display();

	}

}
