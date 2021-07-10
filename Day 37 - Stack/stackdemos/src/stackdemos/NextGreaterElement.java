package stackdemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l = new ArrayList<>();
		int arr[] = {4,5,2,25};
		Stack<Integer> stack = new Stack<>();
		stack.push(arr[arr.length-1]); 
		//System.out.print(-1);
		l.add(-1);
		for(int i = arr.length-2; i>=0; i--) {
			
			while(!stack.isEmpty() && stack.peek()<= arr[i] ) {
				stack.pop();
			}
			int result =(stack.isEmpty()?-1:stack.peek());
			l.add(result);
			//System.out.print(" "+result);
			stack.push(arr[i]);
		}
		Collections.reverse(l);
		System.out.println(l);
	}

}
