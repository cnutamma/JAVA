package strings.stringmethods;

public class method4 {
    public static void main(String[] args) {
    //Compare2 strings-equals() method  &&(== Operator)
    String name1="Tony";
    String name2="Tony";
    if(name1.equals(name2)){
         System.out.println("They are the same string");
     }
    else{
         System.out.println("They are different strings");
    } 
    //DO NOT USE == to check for string equality 
    //Gives correct answer here
    if(name1==name2){
         System.out.println("They are the same string");
     }
     else{
         System.out.println("They are different strings"); 
        } 
    //Gives incorrect answer here
    if(new String("Tony")==new String("Tony")){ 
        System.out.println("They are the same string"); 
    }else{
         System.out.println("They are different strings");
    } 
}
}

// output:
// They are the same string
// They are the same string
// They are different strings