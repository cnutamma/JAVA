
import java.util.Scanner;


class Bubblesort1{
    public static void sortting(int a[]){
        int n=a.length,i,j,p,temp;
        for (i = 0;i < n-1; i++) 
        { 
            for (j=0; j<n-i-1; j++)
            { 
                if(a[j+1]<a[j])
                {
                    temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                    }

             }
        }
    }


    public static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }

    public static void main(String[] args){
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements in the array:");
        n=sc.nextInt();
        
        int a[]=new int[n];
        System.out.println("Enter"+" "+n+" "+"Elements:");

        for (i=0;i<n;i++){
             a[i]=sc.nextInt();

        }
       System.out.println("Elements in the array:");
        printArray(a);

        System.out,println("Elements after sorting:");






    }
}