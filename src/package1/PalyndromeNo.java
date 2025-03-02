package package1;

import java.util.Scanner;

#This program is for playndrome number

public class PalyndromeNo {

	public static void main(String[] args) {
		int num;
		int n=0;
		int rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to check palyndrome or not??::");
		num = sc.nextInt();
		int num1 = num;
		while(num>0) {
			rem = num % 10;
			n = n * 10 + rem;
			num = num / 10;
		}

		System.out.println("n="+n);
		if(n == num1) {
			System.out.println("number is palyndrome");
		}
		else
			System.out.println("number is not palyndrome");
	}

}
