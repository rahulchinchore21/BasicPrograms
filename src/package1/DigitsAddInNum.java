package package1;

import java.util.Scanner;

public class DigitsAddInNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, sum = 0, x;
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		while(n > 0) {
			i = n % 10;
			sum = sum+ i;
			n = n / 10;
		}

		System.out.println("Addition of digits is: "+ sum);
	}

}
//     123=    1 + 2 +3 = 6