package Operators.Bitmanuplation.setMethod;

import java.util.Scanner;

public class method {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println("Enter a setting position number:");
        int pos=sc.nextInt();
        int bitmask=1<<pos;    //(1<<i position)

        int new_number=bitmask | n ;
        System.out.println("New updated number:"+new_number);
    }
}

/*
Output:
Enter a number:
5
Enter a setting position number:
1
New updated number:7          */