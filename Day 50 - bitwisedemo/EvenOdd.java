package bitwisedemo;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number");
		int num = new Scanner(System.in).nextInt();
		if((num & 1) ==0) {
			System.out.println("Even No");
		}
		else {
			System.out.println("Odd No ");
		}

	}

}
