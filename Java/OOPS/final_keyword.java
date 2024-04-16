/*
    Final keyword:
    It is used to restrict the user.
    It is used in variable, method, class.
*/

/* final keyword in class */
final class Test1{}

class Test extends Test1{ //Here we can't able to inherit the final class
    /* final keyword in method */
    final void run(){
        System.out.println("Test Class");
    }
}

public class final_keyword extends Test{
    /* Final keyword in variable */
    final int a = 10;

    final_keyword(){
        a = 20; // Here we can't change the final variable value
    }

    /* final keyword in passing parameter */
    void test(final int a1){
        a1=10;//Here we can't able to assign the value for it.
        System.out.println(a1);
    }
    
    void run(){ // Here we can't able to override the final method
        System.out.println("final_keyword class");
    }
    
    /* static final variable - It is not initialized at the time of execution. It will not be created on any static method.*/
    static final int c; //Here the value is initialized only in static method or static block.
    static{c=20;}
    public static void main(String[] args) {
        final_keyword f = new final_keyword();
        f.run(); //Here we can able to call the final method

        /* final keyword with blank variable */

        final int b; //Here we can't initialize the value for final variable, so we assign the value for it.

        b = 10;
        
        c = 10;

        System.out.println(b);
    }
}
