package tree;

import java.util.ArrayList;
import java.util.Scanner;

class Node{
	int data;
	ArrayList<Node> children;
	Node(int data){
		this.data = data;
		children = new ArrayList<>();
	}
	public String toString() {
		return String.valueOf(data);
	}
}
class GenericTreeOperations{
	Scanner scanner = new Scanner(System.in);
	
	/*
	 * Add Child in Depth Wise Manner
	 */
	public Node addASubTree() {
		System.out.println("Enter the Data of a Node");
		int data = scanner.nextInt();
		Node parentNode = new Node(data);
		System.out.println("Enter the Number of Children of  "+data);
		int children = scanner.nextInt();
		for(int i = 1; i<=children; i++) {
			Node child = addASubTree(); 
			parentNode.children.add(child);
			
		}
		return parentNode;
		
	}
	
	public void print(Node root) {
		System.out.print(root.data + " => ");
		for(Node child : root.children) {
			System.out.print(child+",");
		}
//		for(int i = 0; i<root.children.size(); i++) {
//			System.out.print(root.children.get(i)+",");
//		}
		System.out.println(); // new line added
		for(Node child : root.children) {
			print(child);
		}
	}
	
	
	public int height(Node root) {
		// reach to the end (cross root)
		if(root == null) {
			return 0;
		}
		// reach to the leaf so return 1
		if(root.children.size()==0) {
			return 1;
		}
		int maxDepth = 0;
		for(Node child : root.children) {
			int currentHeight = height(child);
			maxDepth = Math.max(maxDepth, currentHeight);
		}
		return maxDepth + 1;
	}
	
	/*
	 * find the largest node in a tree.
	 */
	public int max(Node root) {	
		if(root == null) {
			return 0;
		}
		int result = root.data;
		for(Node child : root.children) {
			int currentChildValue  = max(child);
			if(currentChildValue>result) {
				result = currentChildValue;
			}
		}
		return result;
	}
	
	/*
	 * Count No of Leaf Nodes
	 * 
	 */
	
	public int countLeaf(Node root) {
		int leafCounter = 0;
		if(root == null) {
			return 0;
		}
		if(root.children.size()==0) {
			return 1;
		}
		for(Node child : root.children) {
			int leafValue = countLeaf(child);
			leafCounter= leafCounter + leafValue;
		}
		return  leafCounter;
	}
}

	


public class GenericTree {

	public static void main(String[] args) {
		GenericTreeOperations obj = new GenericTreeOperations();
		Node root = obj.addASubTree();
		obj.print(root);

	}

}
