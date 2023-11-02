package Operators.Bitmanuplation.clearMethod;
import java.util.Scanner;

public class method {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println("Enter a clear position number:");
        int pos=sc.nextInt();
        int bitmask=1<<pos;    //(1<<i position)
        int notbitmask=~(bitmask);

        int new_number=notbitmask & n ;
        System.out.println("New Updated number:"+new_number);

       
    }
}

/*
Output:
Enter a number:
5
Enter a clear position number:
2
New Updated number:1   */
