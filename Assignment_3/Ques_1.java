
public class Ques_1 {
	
	static class Node{
		private int data;
		private Node next;
		
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	private Node head;
	
	public Ques_1() {
		head = null;
	}
	
	public void addFirst(int value) {
		Node newnode = new Node(value);
		
		newnode.next = head;
		head = newnode;
		
	}
	
	public void display() {
		Node trav = head;
		while(trav != null) {
			System.out.println(" "+trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}
	
	public void insertAfterData(int value, int after) {
		Node newnode = new Node(value);
		
		Node trav = head;
		
		while(trav != null && trav.data != after) {
			trav = trav.next;
		}
		if(trav == null) {
			System.out.println(" "+after);
			return;
		}else {
				newnode.next = trav.next;
			    trav.next = newnode;
		}
			
	}
	
	public void insertBeforeData(int value, int before) {
		Node newnode = new Node(value);
		
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		
		if(head.data == before) {
			newnode.next = head;
			head = newnode;
			return;
		}
		
		Node trav = head;
		
		while(trav.next != null && trav.next.data != before) {
			trav = trav.next;
		}
		if (trav.next == null) {
            System.out.println(before + " ");
            return;
        }
		else {
        	newnode.next = trav.next;
        	trav.next = newnode;
        }
			
	}

	public static void main(String[] args) {
		
		Ques_1 list = new Ques_1();
		
		list.addFirst(40);
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);
		
		list.display();
		
		list.insertAfterData(25, 40);
		
		list.insertBeforeData(15, 10);
		
		list.display();

	}

}
