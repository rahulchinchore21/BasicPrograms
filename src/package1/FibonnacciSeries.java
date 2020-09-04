package package1;

import java.util.Scanner;

public class FibonnacciSeries {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int n3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number upto u want fibinnacci series::");
		int end = sc.nextInt();
		for(int i=0;i<end;i++) {
			System.out.print(n2+" ");
			n3=n1+n2;
			n1=n2;
			n2=n3;
			
		}

	}

}
