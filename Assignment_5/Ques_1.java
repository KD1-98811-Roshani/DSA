
public class Ques_1 {
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
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    int findDepth(Node root, int key) {
        int depth = 0;
        Node curr = root;

        while (curr != null) {
            if (curr.data == key) {
                return depth;
            }
            if (key < curr.data) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
            depth++;
        }

        return -1; 
    }
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

	public static void main(String[] args) {
		
		Ques_1 tree = new Ques_1();

         int[] values = {50, 30, 70, 20, 40, 60, 80};

        for (int value : values) {
            tree.root = tree.insert(tree.root, value);
        }

        System.out.print("BST Inorder: ");
        tree.inorder(tree.root);

        int key = 40;

        int depth = tree.findDepth(tree.root, key);

        if (depth == -1) {
            System.out.println("\nNode " + key + " not found");
        } else {
            System.out.println("\nDepth of node " + key + " = " + depth);
        }

	}

}
