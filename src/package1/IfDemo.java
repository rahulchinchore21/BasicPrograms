package package1;
import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Person age::");
		age=sc.nextInt();
		if(age>=0 && age<=17) {
			System.out.println("You are Kid!!!");
		}
		else if (age>17 && age<120) {
			System.out.println("You can vote!!");
	}
		else
			System.out.println("Incorrect Age!!");
		sc.close();
}
}
