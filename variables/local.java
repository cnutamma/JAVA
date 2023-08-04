//local varaible:It declared within the main function itself.
//we can use the variable in that main function only we can't access in another main function.
//we can  read it in two ways by declaring variable in the main function itself and we can call by using another function
class srinu{

   public static void main(String[] args){
   int a=10;
   System.out.println(a);



   }

}

class Srinu{

   public static void srinu(){
    int a=100;
    System.out.println(a);  //100

   }

   public static void main(String[] args){
   srinu();



   }

}