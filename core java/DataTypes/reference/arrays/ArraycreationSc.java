import java.util.Scanner;

class ArrayCreate{


    public static void main(String[] args){
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of elements:");
        n=sc.nextInt();

        int a[]=new int[n];
        System.out.println("Enter array elements:");


        for(i=0;i<n;i++){
            a[i]=sc.nextInt();

        }

        System.out.println("Array elements are:");
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }



    }
}