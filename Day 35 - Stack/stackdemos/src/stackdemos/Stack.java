package stackdemos;

import java.util.ArrayList;

public class Stack<T> {
	//T arr[];
	//int arr[];
	ArrayList<T> arr ;
	int capacity;
	int top;
	Stack(int capacity){
		top = -1;
		this.capacity = capacity;
		//arr = new T[capacity];
		arr = new ArrayList<T>(capacity);
		
	}
	
	public void peek() {
		//System.out.println(top);
		for(int i = top; i>=0; i--) {
			System.out.println(arr.get(i)); // arr[i]
		}
	}
	
	public void push(T element) {
		if(getSize() == capacity-1) {
			throw new RuntimeException("Stack Full");
		}
		top++;
		arr.add(top,element); // arr[top] = element;
	}
	public T pop() {
		if(isEmpty()) {
			throw new RuntimeException("Stack is Empty");
		}
		T element = arr.remove(top); // arr[top];
		System.out.println("Pop "+element);
		top--;
		return element;
		
		
	}
	boolean isEmpty() {
		return (top ==-1);
	}
	int getSize() {
		return top;
	}

}
