package bitwisedemo;

import java.util.Scanner;

public class CountSetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number");
		int num = new Scanner(System.in).nextInt();
		int count = 0;
		while(num>0) {
			num = (num & (num-1));
			count++;
		}
		System.out.println(count);
		/*
		System.out.println("Enter the Number");
		int num = new Scanner(System.in).nextInt();
		int count = 0;
		while(num>0) {
//			if(num%2!=0) {
			if((num & 1)==1) {
				count++;
			}
			num = num>>1;
			//num = num/2;
		}
		
		System.out.println(count);
		*/
	}

}
