package com.greatlearning.dsalabsession.main;

import com.greatlearning.dsalabsession.service.SearchPairSum;
import com.greatlearning.dsalabsession.service.BinarySearchTree;
import com.greatlearning.dsalabsession.service.BinarySearchTree.Node;

import java.util.HashSet;
import java.util.Scanner;


public class CheckingPairSum {
	public static void main(String[] args) {
		BinarySearchTree bs = new BinarySearchTree();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the root of the Tree");
		Node root = BinarySearchTree.createNode(sc.nextInt());
		System.out.println("Enter the number of nodes: ");
		int elementscount = sc.nextInt();
		while (elementscount > 0){
			BinarySearchTree.insertNode(root,sc.nextInt());
			elementscount--;
		}
		System.out.println("Elements loaded in the BST, Printing Inorder Traversal");
		
		bs.printInorder(root);
		
		System.out.println();
		System.out.println("Enter the Sum to Look Up for a Pair in BST");
		int sum = sc.nextInt();
		sc.close();			
		
		// Static Method invocation using Class.
		
		SearchPairSum.searchPairs(root,sum);
	}

}
