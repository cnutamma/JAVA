package Operators.Bitmanuplation.getMethod;
import java.util.Scanner;

public class method {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println("Enter a get position number:");
        int pos=sc.nextInt();
        int bitmask=1<<pos;    //(1<<i position)

        if((bitmask & n) ==0){
            System.out.println("bit was zero");
        }
        else{
            System.out.println("bit was one");
        }
    }
}
/* 
output:
Enter a deciaml number:
5    0101-binary number
Enter a position number:
2
bit was one             */
