//command line argument 
//the inbuilt function of command line argument is string format.

class srinu{  
public static void main(String args[]){  
System.out.println(args[0]); //it gives the string value which you entered first. 
System.out.println(args[0]+args[1]); //1020 it gives output in string like this if you add both.
//if you want to convert in integer we will use wrapper classes
//wrapper class of integer is Integer.parseInt()

System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1])); //it gives output 30
}  
}  