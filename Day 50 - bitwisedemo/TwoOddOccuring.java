package bitwisedemo;

public class TwoOddOccuring {

	public static void main(String[] args) {
		int arr[] = {3,4,3,4,5,4,4,6,7,7};
		int xor = 0;
		for(int i : arr) {
			xor = xor ^ i;
		}
		//System.out.println(xor);
		int rightMostBit  = (xor & ~(xor-1));
		int g1 = 0;
		int g2 = 0;
		for(int i : arr) {
			if((i & rightMostBit)!=0) {
				g1 = g1 ^ i;
			}
			else {
				g2 = g2^i;
			}
		}
		System.out.println(g1);
		System.out.println(g2);

	}

}
