package patterns;

public class invertedHP180 {
    public static void main(String[] args) {
        int n=4;
        //outer loop
        for (int i = 1; i <=n ; i++) {
            //inner loop->space print
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
                
            }
            //inner loop->to print spaces
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
                
            }
            System.out.println();

            
        }
    }
    
}

/*
 output:Inverted 180 degree half-pyramid:
   *
  **
 ***
****

 */
