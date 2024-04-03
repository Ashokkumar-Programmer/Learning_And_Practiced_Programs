/*

Variable is a container which hold value when java program is executed.
A variable is assigned with data types.
Variable is the name of memory location.
There are 3 types of variable

(i) local variable - It will be defined inside the class. It is declared as local keyword.

(ii) instance variable - It will be defined both inside and outside of the class. There is no keyword for instance.

(iii) static variable - Create single copy of static variable to share among all instance of classes. 
                        Memory allocation of staic happens obly one when class is loaded in memory.

Example:

public class Variable 
{  
    static int m=100;//static variable  
    void method()  
    {    
        int n=90;//local variable    
    }  
    public static void main(String args[])  
    {  
        int data=50;//instance variable    
    }  
}

(i) Widening(convert lower datatype to higher datatype):

int a=10;  
float f=a; // int convert to float

(ii) Narrowing (Typecasting):

float f=10.5f; //10.5f, here f is denotes float
int a=f; //Error. Because we can't convert assign higher datatype to lower datatype
int a=(int)f;  

(iii) Overflow (Assign value which is out of range then declared data type of variable):

int a=130;  
byte b=(byte)a; 

Underflow (Assign value which is below range then declared data type of variable)
*/