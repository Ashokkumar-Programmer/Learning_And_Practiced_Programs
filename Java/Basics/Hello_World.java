public class Hello_World {
    public static void main(String args[]){
        System.out.println("Hello World");
    }    
}

/*

Here,

(i) class - declare class in java.

(ii) public - It is access modifier that represent visibility.

(iii) Static:

Static is a keyword.
If we declare any method as static, then it is known as static method.
There is no need to invoke the static method. Because the main method is executed by JVM,
so it doesn't require creating a object to invoke the method. It save memory.
Simply says, If you declare any method as static then there is no object creation for the static method to invoke the method.

(iv) void - It is return type. void means there is no return value.

(v) main - It is the starting point of the program.

(vi) String[] args or String args[] - It is command line argument.

Command-line argument:

In command-line argument, we pass argument at the time of running the java program.
Pass arguments will be stored in args[] array.
args[] is the instance of class (instance of class means object) String. 

Eg: javac sample.java
java sample ashok kumar mca 07
here "ashok kumar mca 07" will be stored in args like args[0]="ashok", args[1]="kumar", args[2]="mca", args[3]="07".
we can access the args values as args[index_value].

(vii) System.out.println() - It is used to print the statement.

Here,

System is a class.

out is the object of PrintStream class.

println() is the method of PrintStream class.


Valid:

public static void main(String[] args)
public static void main(String []args)
public static void main(String args[])
static public void main(String[] args)  
public static final void main(String[] args)  
final public static void main(String[] args) 
public static void main(String... args). It is varargs(...)

Varargs:

In varargs, we can pass zero or more than 1 arguments. We don't have to provide overloaded the method. It make the code as short
rule:

There is must be only one variable in varargs
The variable must be declared as lat argument in method
varargs example:

class VarargsExample{  
 static void display(int a, String... values){  
  System.out.println("display method invoked ");  
  System.out.println(a);
  for(String s:values){  
   System.out.println(s);  
  }  
 }  
 public static void main(String args[]){  
 display(10);//zero argument   
 display(10,"hello");//one argument   
 display(10, "my","name","is","varargs");//four arguments  
 }   
}  
Output:
display method invoked
10
display method invoked
10
hello
display method invoked
10
my
name
is 
varargs

Invalid:

public void main(String[] args)  
static void main(String[] args)  
public void static main(String[] args)  
abstract public static void main(String[] args)  
*/