/*
There are some wrapper classes for all the primitive data types.It is used for AutoBoxing and UnBoxing.
datatypes-wrapper classes
int-Integer
float-Float
long-Long
double-Double
byte-Byte
char-Character
boolean-Boolean
*/

//how to convert primitive data types into object
class srinu{
int a=100;    //primitive datatype
Integer b=a;   //Integer b=Integer.valueof(a)
public static void main(String[] args){
srinu s1=new srinu();
System.out.println(s1.b);
}
}



