package patterns;

public class HalfPyramidWithNumbers {
    public static void main(String[] args) {
        int n=4;
       for (int i = 1; i <=n ; i++) {
        for (int j = 1; j <=i ; j++) {
            System.out.print(j);
            
        }
        System.out.println();
        
       }
    }
    
}

/*
output:Half-Pyramid with Numbers
1
12
123
1234


*/