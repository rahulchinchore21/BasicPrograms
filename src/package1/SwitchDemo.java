package package1;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number between 0 to 3");
		choice=sc.nextInt();
		switch(choice) {
		case 0: System.out.println("You entered 0");
		break;
		case 1: System.out.println("You Entered 1");
		break;
		case 2: System.out.println("You entered 2");
		break;
		case 3: System.out.println("You Entered 3");
		break;
		}
		sc.close();
	}
}
