public class Bank{
    int eid;
    String ename;
    int esal;
    void set_details(int id,String name,int sal){
        eid=id;
        ename=name;
        esal=sal;
    
    }
    void display(){
        System.out.println(eid);
        System.out.println(ename);
        System.out.println(esal);
    }
    public static void main(String[] args){
       Bank b1=new Bank();
       b1.set_details(1,"srinu",1000000);
       b1.display();
    }





}