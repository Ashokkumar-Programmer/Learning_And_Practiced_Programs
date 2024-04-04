public class Constructor {
    /*
    Constructor:
    It is block of code which perform certain operations.
    It is called when the instance of class is created.
    The constructor name as same as the class name.
    It has no return type.
    The constructor cannot be abstract, static, final and synchronized.
    */
    /*
    Types of constructor:
    (i) Default constructor
    (ii) Parameterized constructor
    */

    //Default constructor

    Constructor(){
        System.out.println(b1);
    }

    //Parameterized Constructor
    int b1 = 0;
    int a = 0;
    Constructor(int a, int b){
        b1 = 1;
        System.out.println(a+"   "+b);
        a = 1;
    }

    /*
    Contructor Overloading:

    We can create multiple constructor with different no. of parameters

    */

    //Copy constructor by contructor

    Constructor(Constructor s){
        s.a = 2;
    }

    public static void main(String[] args) {
        Constructor c = new Constructor();
        Constructor c1 = new Constructor(1,2); // It is default constructor. Here Constructor() is constructor.
        new Constructor(1,2);

        //Copy constructor without using constructor

        Constructor c2 = new Constructor();
        c2.b1 = c1.b1;
    }
}
