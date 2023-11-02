//Encapsulation-Binding data and method as a single unit.
//what we get-To achieve security.
// class Test{
//     private variables(data)         
//            +
//     public methods[setters and getters]    to achieve private variables we use public methods.
// }


class Account{
    //create a private variable
     private int min_bal;

    // create setters and getters 
     public void set_Min_Bal( int  amount){
        this.min_bal=amount;
        //this is a pointer pointing the current object.In class methods we create objects by using this.


     }
      public int get_Min_Bal(){
        return min_bal;

     }
     public static void main(String[] args){
        Account a1=new Account();
        a1.set_Min_Bal(500);
       int bal=a1.get_Min_Bal();
        System.out.println(bal);
     }
}

