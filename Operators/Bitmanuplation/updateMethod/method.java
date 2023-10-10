package Operators.Bitmanuplation.updateMethod;

import java.util.Scanner;

public class method {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println("Enter a update position number:");
        int pos=sc.nextInt();
        System.out.println("Enter an operation:");
        int op=sc.nextInt();    //op==1 we are setting if op==o we are clearing

        int bitmask=1<<pos; 
        if(op==1){
            //set operation
        int new_number= bitmask | n ;
        System.out.println("Updated number:"+new_number);
        }
        else{
            //clear operation
        int newbitmask=~(bitmask);
        int new_number= newbitmask & n ;
        System.out.println("Updated number"+new_number);

        }

    }
}

/*
Output:
Enter a number:
5      0101=>0111=>7 in decimal
Enter a update position number:
1
Enter an operation:
1
Updated number:7          */
