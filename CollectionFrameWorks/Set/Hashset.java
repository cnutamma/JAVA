import java.util.*;  
import java.util.HashSet;

class Test{  
public static void main(String args[]){  
//Creating HashSet and adding elements  
HashSet<String> set=new HashSet<String>();  
set.add("SRINU");  
set.add("GOPI");  
set.add("SRINU");  
set.add("VAMSI");  
System.out.println(set);  

//Traversing elements  
Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  