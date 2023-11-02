//Instance variable:If variable has varied from one object to another object we use instance variable.
//It is declared in class and outside the main function.
//For every instance if we want to declare we need to create an object in the main fn.
//Multiple copies is created for each object.

class srinu{
    int a=100;


    public static void main(String[] args){
        srinu t1=new srinu();
        srinu t2=new srinu();



        System.out.println(t1);
        System.out.println(t2);
        //it prints only address of the object like  srinu@some hexa decimal value.


        System.out.println(t1.a);
        System.out.println(t2.a);
        //it prints the output of a value i.e 100



    
    }






}
