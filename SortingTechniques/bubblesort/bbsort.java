package SortingTechniques.bubblesort;

public class bbsort {
    public static void PrintArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }
        System.out.println();


    }

    public static void main(String[] args) {
        //array
        int[] arr={7,8,1,3,2};

       //bubble sort
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]) {           // greater than > for ascending order and < for descending order.
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                }
                
            }
            
        }
        PrintArray(arr);
        
    }
    
}
