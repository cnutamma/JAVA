package strings.stringmethods;

public class method3 {
    public static void main(String[] args) {
    //Access characters of a string-charAt() method
    String firstName="Tony";
    String secondName="Stark"; 
    String fullName=firstName+""+secondName;
     for(int i=0;i<fullName.length();i++) {
         System.out.println(fullName.charAt(i));
         }
    }
}
