package stackdemos;


class CircularArrayQueue{
	int arr[];
	int front;
	int size; // size;
	public CircularArrayQueue(int n) {
		arr = new int[n];
		size = front = 0;
	}
	void enqueue(int element) {
		if(size == arr.length) {
			throw new RuntimeException("Queue is Full");
		}
		int rear = (front + size) % arr.length;
		arr[rear] = element;
		size++;
	}
	int dequeue() {
		if(size==0) {
			throw new RuntimeException("QUeue is Empty");
		}
		int val = arr[front];
		arr[front] = 0;
		front = front + 1 % arr.length;
		size--;
		return val;
	}
	
}

class MyQueue{
	int data[];
	int front;
	int rear;
	int size;
	MyQueue(int n){
		data = new int[n];
		front = rear = -1;
		size = 0;
	}
	int getSize() {
		return size;
		
	}
	boolean isEmpty() {
		return size == 0;
	}
	int getFront() {
		if(size==0) {
			throw new RuntimeException("Queue is Empty");
		}
		return data[front];
	}
	void enqueue(int element) {
		if(size == data.length) {
			throw new RuntimeException("Queue is Full");
		}
		if(size==0) {
			front = 0;
		}
		rear++;
		size++;
		if(rear == data.length) {
			rear = 0;
		}
		data[rear] = element;
	}
	int dequeue() {
		if(isEmpty()) {
			throw new RuntimeException("Queue is Empty so Can't do Dequeue");
		}
		int temp =data[front];
		front++;
		if(front == data.length) {
			front = 0;
		}
		size--;
		if(size ==0) {
			front = rear = -1;
		}
		return temp;
	}
//	void dequeue2() {
//		if(isEmpty()) {
//			throw new RuntimeException("Queue is Empty so Can't do Dequeue");
//		}
//		for(int i = 0 ;i<size-1; i++) {
//			data[i] = data[i+1];
//		}
//		size--;
//	}
}

public class SimpleQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
