abstract class Srinu{
   abstract void value();


}
class Srinu1 extends Srinu{
    void value(){
     int a=21;
     System.out.println(a);    //we need to implement here only and print the value
    }
}
class Dao{
     public static void main(String[] args){
        Srinu a1=new Srinu1();
        a1.value();            //we need to call the function here
        
       
    }
}