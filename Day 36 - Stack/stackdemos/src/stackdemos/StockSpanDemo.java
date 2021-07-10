package stackdemos;
import java.util.Stack;
public class StockSpanDemo {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40};
		Stack<Integer> stack = new Stack<>();
		stack.push(0); // 1st day
		System.out.print(1);
		for(int i = 1; i<arr.length; i++) {
			
			while(!stack.isEmpty() && arr[stack.peek()]<= arr[i] ) {
				stack.pop();
			}
			int daySpan = stack.isEmpty()?i+1:i - stack.peek();
			stack.push(i);
		}
		

	}

}
