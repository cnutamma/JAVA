//if we are using class as public then the file name should also be same as the class name.

class Srinu{
            public int age(){
                return 21;
            }  //direct implementation without of using child class
}
public class Test1{
    public static void main(String[] args){

        int age=new Srinu().age();
        System.out.println(age);


    }
}