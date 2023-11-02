package langPackage.stringbuilder;

import java.util.Scanner;

public class ReverseStringSB {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String:");
    String n =sc.nextLine();
    StringBuilder sb=new StringBuilder(n);

    for(int i=0;i<n.length()/2;i++){              //length/2 bcoz we are taking only half of the string 
    int front=i;
    int back=n.length()-1-i;

   char frontchar= sb.charAt(front);
   char backchar= sb.charAt(back);

   sb.setCharAt(front, backchar);                //setting front backstring and back as frontstring
   sb.setCharAt(back, frontchar);

    }
    System.out.println(sb);

        
    }
    
    
}

// output:
// Enter a String:
// srinivas
// savinirs
