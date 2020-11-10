package package1;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		//find Cube of each digit and make their sum, should equal to the number--Armstrong Num for ex. 153 is Armstrong num
		Scanner sc = new Scanner(System.in);
		int i, sum = 0;
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int num = n;
		while(n > 0) {
			i = n % 10;
			sum = sum+ (i*i*i);
			n = n / 10;
		}

		if(sum == num) {
			System.out.println("Armstrong Number");
		}
		else
			System.out.println("Not a Armstrong Number");
	}

	}

