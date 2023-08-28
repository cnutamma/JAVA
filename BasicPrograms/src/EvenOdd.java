//check whether the given number is even or odd.

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		sc.close();
//		String check = (data % 2 == 0) ? "even" : "odd";
//
//		    System.out.println("The entered number "+ data + " is: " + check);
		if(data%2==0) {
			System.out.println("Given number is an even number");
		}
		else {
			System.out.println("Given number is a odd number");
		}

	}
}