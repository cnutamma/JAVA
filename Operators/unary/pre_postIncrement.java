package Operators;

public class pre_postIncrement {
    public static void main(String[] args) {
        int a=10;
        int b=0;
/* 
        b=a++;    //post increment   use value and then change value
        System.out.println(a);
        System.out.println(b);
        // output:
        // 11
        // 10
        */
/* 
        b=++a;     //pre increment  change value and use value
        System.out.println(a);
        System.out.println(b);

        //output:
        // 11
        // 11       */

/* 
        b=--a;     //pre decrement change value and use value
        System.out.println(a);
        System.out.println(b);
        output:
        9
        9      */

        b=a--;     //post decrement use value and change value
        System.out.println(a);
        System.out.println(b);
        // output:
        // 9
        // 10
    
    }
    
}
