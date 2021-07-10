package stackdemos;

import java.util.ArrayList;
import java.util.LinkedList;


class A{
	
}
class B extends A{
	
}
class C extends A{
	
}

public class GenericDemo {
	
	// It can  take A object , B Object, C Object (Same type and sub type)
	static void show(A a[]) {
		
	}

	// It can  take A object 
		static void show(ArrayList<A> list) {
		}
		
		// wildcard
		static void show1(ArrayList<?> list) {
		}
		
		static void show2(ArrayList<? extends A> list) { // A and A Child
		}
		
		static void show3(ArrayList<? super A> list) { // A and A Parent
		}
		
			
	
	public static void main(String[] args) {
		A a[] = {new A(), new B(), new C()};
		A obj = new B();
		
		ArrayList<B> b = new ArrayList<>();
		show1(b);
		show2(new ArrayList<A>());
		show2(new ArrayList<B>());
		show2(new ArrayList<C>());
		
//		LinkedList l = new LinkedList();
//		l.add(10);
//		l.add("Hello");
//		l.add(true);
		
		LinkedList<Integer> l = new LinkedList<>(); 
		l.add(10);
		
		
		//Object e = 100;
		//e = "Hello";
		//e = 90.20;

	}

}
