package stackdemos;


class NStack{
	int arr[];
	int top[];
	int next[];
	int capacity;
	int n;
	int free;
	NStack(int capacity, int n){
		this.capacity = capacity;
		this.n = n;
		arr= new int[capacity];
		next = new int[capacity];
		top = new int[n];
		// initalize next
		for(int i = 0; i<capacity-1; i++) {
			next[i] = i +1;
		}
		next[capacity-1] = -1;
		
		for(int i = 0; i<n; i++) {
			top[i] = -1;
		}
		//free = 0;
		
		// init top
	}
	void push(int stackNumber, int element) {
		if(free==-1) {
			System.out.println("Stack Full");
			return ;
		}
		int index = free; // start free (0)
		// next free
		free = next[index];
		next[index] = top[stackNumber];
		top[stackNumber] = index;
		arr[index] = element;
		
	}
	
	void pop(int stackNumber) {
		if(top[stackNumber]==-1) {
			System.out.println("Stack is Empty ");
			return ;
		}
		int index = top[stackNumber];
		int element = arr[index];
		System.out.println("Pop "+element);
		top[stackNumber] = next[index];
		next[index] = free;
		free = index;
	}
}

public class NthStack {

	public static void main(String[] args) {
		NStack nstack = new NStack(10,3);
		nstack.push(0, 10);
		nstack.push(0, 20);
		nstack.push(0, 30);
		nstack.pop(0);
		nstack.push(1, 1000);
		nstack.push(1, 2000);
		nstack.push(2, 1);
		nstack.push(2, 2);
		
		

	}

}
