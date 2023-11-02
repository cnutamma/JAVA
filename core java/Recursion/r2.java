//print numbers from 1 to 5 using recursion.

package Recursion;

public class r2 {
    public static void printNumbers(int n){
        //base function
        if(n==6){
        return;
        }
        //printing
        System.out.print(n+" ");
        //recursion
        printNumbers(n+1);
    }
    public static void main(String[] args) {
        //calling the function
        printNumbers(1);

        
    }
    
}
 
    
