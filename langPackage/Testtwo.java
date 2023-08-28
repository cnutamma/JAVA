//import java.lang.Object;
//class Child extends Object{

class Child{

    public String toString(){
        return "srinivas";
    }
    public static void main(String[] args){
      Child c1=new Child();
      
      System.out.println(c1.toString());
      System.out.println(c1);    //no need to specify even tostring we can call direct object name to get meaningful name to the object.
    }
}