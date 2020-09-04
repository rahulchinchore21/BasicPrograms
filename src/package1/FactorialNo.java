package package1;

import java.util.Scanner;

public class FactorialNo {

	
	//Recursive function
	public static int fact(int num) {
		if(num == 0) 
			return 1;
		else {
			return (num * fact(num-1));
		}
			
	}
	public static void main(String[] args) {
		System.out.println(fact(4));
		
		/*int fact = 1;
		int num;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num to find factorial::");
		n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			fact = fact * i;
			
		}

		System.out.println("factorial=" +fact);*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
