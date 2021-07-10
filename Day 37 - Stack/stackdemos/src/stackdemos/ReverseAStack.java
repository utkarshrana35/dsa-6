package stackdemos;
import java.util.Stack;
public class ReverseAStack {
	static Stack<Integer> stack = new Stack<>();
	
	static void reverse() {
		if(stack.size()>0) {
			int currentElement = stack.peek();
			//System.out.println(currentElement);
			stack.pop();
			reverse();
			//System.out.println("Stack Push "+currentElement);
			insertAtBottom(currentElement);
		}
	}
	
	static void insertAtBottom(int currentElement) {
		if(stack.isEmpty()) {
			stack.push(currentElement);
		}
		else {
			int ce = stack.peek();
			stack.pop();
			insertAtBottom(currentElement);
			stack.push(ce);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println("Org "+stack);
		reverse();
		
		System.out.println(stack);
		

	}

}
