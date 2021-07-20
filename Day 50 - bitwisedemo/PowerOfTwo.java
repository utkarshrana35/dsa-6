package bitwisedemo;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		System.out.println("Enter the Number");
		int num = new Scanner(System.in).nextInt();
		if((num & (num-1))==0) {
			System.out.println("Power of 2 => "+num);
		}
		else {
			System.out.println("Not Power of 2");
			
		}

	}

}
