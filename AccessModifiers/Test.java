
//if you are using abstract class we can't create objects directly.Then who is responsible?
//child classes is responsible for implementation.
//if we are using abstract method the class name should be also in abstract.
abstract class Srinu{
            public abstract int age();  // only method declartion
}

//child class is  resposbile to provide implementation.(inheritance)
class Srinu_Re extends Srinu{
                    public int age(){
                        return 21;
                     }

}


public class Test{
    public static void main(String[] args){

        int age=new Srinu_Re().age();
        System.out.println(age);


    }
}