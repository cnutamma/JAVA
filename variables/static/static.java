//static variable:If varaiable values has same data which not be varied from object to object we use static variable.
//we can create static variable by using static keyword.
//There are three ways to read the data in static varaiable i.e
// 1.we can read directly
// 2.we can read by creating objects
// 3.we can read by calling class
//Only one copy will be create for all the objects.

class srinu{
    //create
    static int a=10;
     
    public static void main(String[] args){

    //read1 i'm reading here directly.
    System.out.println(a);
    //read2 i'm creating objects and with that objects i'm reading the data.
    srinu a1=new srinu();
    srinu a2=new srinu();
    System.out.println(a1);
    System.out.println(a2);
    System.out.println(a1.a);
    System.out.println(a2.a);
    //read3 By using class name with the variable name i'm reading the data.
    System.out.println(srinu.a);




    }




}