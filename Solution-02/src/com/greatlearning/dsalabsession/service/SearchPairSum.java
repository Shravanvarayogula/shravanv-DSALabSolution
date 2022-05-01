package com.greatlearning.dsalabsession.service;


import com.greatlearning.dsalabsession.service.BinarySearchTree.Node;
import java.util.HashSet;


public class SearchPairSum{
	public static boolean inOrderTraversalsearch(Node root,int sum,HashSet<Integer> set){
		if (root == null){
			return false;
		}
		if(inOrderTraversalsearch(root.left,sum,set)){
			return true;
		};
		if (set.contains(sum-root.data) && sum-root.data != root.data){
			System.out.println("Pair is found: ("+root.data+ "," + (sum-root.data)+")");
			return true;
		}
		else {
			set.add(root.data);
		}
 		return(inOrderTraversalsearch(root.right,sum,set));		
	}
	// Utility Method to execute the Inorder Traversal search
	
	public static void searchPairs(Node root, int sum){
		HashSet<Integer> diffcontainer = new HashSet<Integer>();
		if (!inOrderTraversalsearch(root,sum,diffcontainer)){
			System.out.println("Pairs Not found");
		}

	}
}
