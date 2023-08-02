//create operation
class Test{
    //if we want to declare static variable
       static int a=100;
    //if we want to declare instance variable
       int b=200;
    public static void main(String[] args){
    // if we want to declare local variable
        int c=300;

    Test t1=new Test();
    Test t2=new Test();

//read operation
    System.out.println(a);
    System.out.println(c);    

    System.out.println(t1);    
    System.out.println(t2);

    System.out.println(t1.b);
    System.out.println(t2.b);

    System.out.println(a+t1.b+c);
    System.out.println(a+t1.b+c);

//update operation
    c=3;
    System.out.println(a+c);
    a=1;
    System.out.println(a+c);

    t1.b=2;
    System.out.println(t1.b+a+c);
    t2.b=6;
    System.out.println(t2.b+a+c);

    











    }







}