package com.greatlearning.dsalabsession.service;

public class BinarySearchTree {
	BinarySearchTree root;
	//BST Node
	public static class Node{
		int data;
		Node left,right;

		public Node(){
			this.data = 0;
			this.left = null;
			this.right = null;
		}
		public Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	// BST Create a new node
	public static Node createNode(int data){
		Node temp = new Node();
		temp.data = data;
		temp.left = null;
		temp.right = null;
		return temp;
	}

	//BST Insert a new node
	public static Node insertNode(Node root,int data){
		Node newnode = new Node(data);
		Node temp = root;
		Node current_parent = null;
		while(temp!=null){
			current_parent = temp;
			if (data < temp.data){
				temp = temp.left;
			}
			else if (data > temp.data) {
				temp= temp.right;
			}
			else {
				System.out.println("Value Exist");
				return newnode;
			}
		}
		if (current_parent == null){
			current_parent = newnode;
		}
		else if (current_parent.data<data){
			current_parent.right=newnode;
		}
		else if (current_parent.data > data){
			current_parent.left=newnode;
		}
		return current_parent;
	}

	public void printInorder(Node root){
 		if (root == null){
			return;
		}
		else {
			printInorder(root.left);
			System.out.print(root.data + " ,");
			printInorder(root.right);
		}
	}
}



