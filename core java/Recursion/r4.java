//print factorial of a numbers.
package Recursion;

public class r4 {
    public static int factorial(int n){
        if (n==1 || n==0) {
            return 1;        
        }
        int fact_new=factorial(n-1);
        int fact=n*fact_new;
        return fact;      
    }
    public static void main(String[] args) {
        int ans=factorial(2);
        System.out.println(ans);
        
    }
    
}
