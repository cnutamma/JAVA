import java.util.Scanner;

class TwoDArray{


    public static void main(String[] args){
        int m,n,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of rows:");
        m=sc.nextInt();
        System.out.println("Enter no.of columns:");
        n=sc.nextInt();


        int a[][]=new int[m][n];
        System.out.println("Enter array elements:");


        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("Array elements are:");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
            System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }



    }
}