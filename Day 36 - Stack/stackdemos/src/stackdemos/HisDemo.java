package stackdemos;
import java.util.Stack;
public class HisDemo {

	public static void main(String[] args) {
		int bars[] = {2,1,6,5,2,3};
		Stack<Integer> stack = new Stack<>();
		stack.push(-1);
		int maxArea = 0;
		for(int i = 0; i<bars.length; i++) {
			
			// if current bar is > than the stack peek (top)
			// pop the value till we find the stack peek > current bar
			while(stack.peek()!=-1 && bars[stack.peek()]>=bars[i]) {
				int topElement = stack.pop();
				int rightIndex = i;
				int leftIndex = stack.peek();
				maxArea = bars[topElement] *((rightIndex - leftIndex ) -1);
			}
			// Checking current bar is less than the stack peek (top) element
			// push in stack
			stack.push(i);
			
		}
		while(stack.peek()!=-1) {
			maxArea = Math.max(maxArea, bars[stack.pop()] * ((bars.length - stack.peek())-1));
		}
		System.out.println(maxArea);

	}

}
