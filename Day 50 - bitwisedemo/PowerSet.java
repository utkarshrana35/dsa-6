package bitwisedemo;

public class PowerSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		int size = str.length();
		int power = (int) Math.pow(2, size);
		for(int i = 0; i<power; i++) {
			for(int j = 0; j<size; j++) {
				if((i & (1<<j))!=0) {
					System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}

	}

}
