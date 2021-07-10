package stackdemos;

public class StackCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>(5);
		stack.push("hi");
		stack.push("hello");
		stack.push("how");
		stack.push("are");
		stack.push("you");
		//stack.push("fine");
		stack.peek();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println("******************");
		stack.peek();
		
		
	}

}
