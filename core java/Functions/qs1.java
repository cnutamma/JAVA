//Enter 3 numbers from the user & make a function to print their average.
package Functions;
import java.util.Scanner;

public class qs1 {
    public static float average(float a,float b,float c){
        return (a+b+c)/3;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        System.out.println("Enter third number:");
        int c=sc.nextInt();

        System.out.println("Average of the numbers:"+average(a, b, c));


        
    }
}
