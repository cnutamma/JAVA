import java.util.Arrays;

public class array1 {
    public static void main(String[] args) {
        int[] a1={1,4,5,8};
        int a2[]={2,7,3,9};

        int al=a1.length;
        int bl=a2.length;

        int n[]=new int[al+bl];

        System.arraycopy(a1, 0, n,0, bl);
        System.arraycopy(a2,0, n,al, bl);

        System.out.println(Arrays.toString(n));

    }

    
}
