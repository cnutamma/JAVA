abstract class Manu{
             abstract void login(); //only decl means abstraction
    
        void logout(){
             System.out.println("Logout success");
         }  // concrete method
}
 class Srinu extends Manu{
   void  login(){ 
     System.out.println("Login success");
    }
}


class Test{
     public static void main(String[] args){
         Srinu a=new Srinu();
         a.login();
         a.logout();
    }
}

