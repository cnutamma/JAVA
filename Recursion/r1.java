//print numbers from 5 to 1 using recursion.

package Recursion;

public class r1 {
    public static void printNumbers(int n){
        //base function
        if(n==0){
        return;
        }
        //printing
        System.out.print(n+" ");
        //recursion
        printNumbers(n-1);
    }
    public static void main(String[] args) {
        //calling the function
        printNumbers(5);

        
    }
    
}
