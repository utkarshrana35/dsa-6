package stackdemos;

import java.util.Stack;

public class PreviousGreaterElement {

	public static void main(String[] args) {
		int arr[] = {10,4,2,20,40,12,30};
		Stack<Integer> stack = new Stack<>();
		stack.push(arr[0]); 
		System.out.print(-1);
		for(int i = 1; i<arr.length; i++) {
			
			while(!stack.isEmpty() && stack.peek()<= arr[i] ) {
				stack.pop();
			}
			System.out.print(" "+(stack.isEmpty()?-1:stack.peek()));
			stack.push(arr[i]);
		}

	}

}
