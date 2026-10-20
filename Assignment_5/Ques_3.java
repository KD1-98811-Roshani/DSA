import java.util.Scanner;

public class Ques_3 {
	
	 static class Node {
	        int data;
	        Node left, right;

	        Node(int data) {
	            this.data = data;
	            left = right = null;
	        }
	    }
	    Node root;

	    Node insert(Node root, int data) {
	        if (root == null)
	            return new Node(data);

	        if (data < root.data)
	            root.left = insert(root.left, data);
	        else if (data > root.data)
	            root.right = insert(root.right, data);

	        return root;
	    }
	    Node findMin(Node root) {
	        while (root != null && root.left != null) {
	            root = root.left;
	        }
	        return root;
	    }

	    Node successor(Node root, int key) {
	        Node curr = root;
	        Node succ = null;

	        while (curr != null) {
	            if (key < curr.data) {
	                succ = curr;
	                curr = curr.left;
	            } else if (key > curr.data) {
	                curr = curr.right;
	            } else {
	                if (curr.right != null) {
	                    return findMin(curr.right);
	                }
	                break;
	            }
	        }
	        return succ;
	    }
	    void inorder(Node root) {
	        if (root == null)
	            return;

	        inorder(root.left);
	        System.out.print(root.data + " ");
	        inorder(root.right);
	    }

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        Ques_3 tree = new Ques_3();

        int[] values = {50, 30, 70, 20, 40, 60, 80};

        for (int value : values) {
            tree.root = tree.insert(tree.root, value);
        }

        System.out.print("Inorder: ");
        tree.inorder(tree.root);

        System.out.print("\nEnter node to find successor: ");
        int key = sc.nextInt();

        Node result = tree.successor(tree.root, key);

        if (result != null)
            System.out.println("Successor = " + result.data);
        else
            System.out.println("Successor does not exist.");

        sc.close();
	}

}
