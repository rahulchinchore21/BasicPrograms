package package1;

import java.util.Scanner;

public class PrimeNO {

	public static void main(String[] args) {
		int count = 0;
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number to check prime::");
		num = sc.nextInt();
		if(num == 0 || num == 1) {
			System.out.println("Number is neither prime or composite");
		}
		else {
		for(int i =2; i<num;i++) {
			if(num % i == 0) {
				count = count + 1;	
			}
			
		}
		if(count == 0) {
			System.out.println("Number is Prime");
		}
		else
			System.out.println("Number is not Prime");

	}
	
	}
}
