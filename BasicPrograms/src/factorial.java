import java.util.Scanner;

class Factorial{
    public static void main(String[] args){
        int fact=1;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=sc.nextInt();
    
        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("factorial of a number:"+fact);
    }


}