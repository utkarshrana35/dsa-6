package bitwisedemo;

import java.util.Scanner;

public class KthBitSetOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = scanner.nextInt();
		System.out.println("Enter the kth Bit Position");
		int k = scanner.nextInt();
		System.out.println((num & (1<<k-1))!=0);
		scanner.close();

	}

}
