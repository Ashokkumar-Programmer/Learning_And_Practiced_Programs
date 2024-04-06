public class Test1 {
    int add(int a, int b){
        return a+b;
    }
    int add(double a, double b){
        return a+b;
    }
    
}

public class Test2{
    void add(int a, long b){
        System.out.println(a+b);
    }
    void add(long a, int b){
        System.out.println(a+b);
    }
    /*
        Here, the method is not invoke it returns compile time error.

        Because, the both method passing same datatype add(int, long), add(long, int).

        Both method passing long and int. It makes difficult for compiler to decide which method to invoke.
    */
}

public class Method_Overloading {
    public static void main(String[] args) {
        /*
            Method Overloading:
                If a class has multiple methods with same name with different in parameters is called method overloading.
                It improve the readability of program, because if we have one operation having same name of the method.
        */
        /*
            Changing no. of arguments
        */
        Test1 t1 = new Test1();
        System.out.println(t1.add(1, 2));
        //Here two integer values passed to add() then it will invoke the add(int, int). If you passed two double values then it invoke add(double, double)
        //Here datatype of passing arguments in add() is same, then it will return compile error like add(int, int), add(int, int)


        /*
            Method overloading with type promotion
        */        

        Test2 t2 = new Test2();
        t2.add(20,20);
    }
    /*
        Overload main()
    */
    public static void main(String args) {
        System.out.println("New main method");
        //Here we pass args as string not array.
        //If you pass args as array or change args name as arg but pass an array then it will return compile error
    }
    public static void main() {
        System.out.println("New main method");
        //Here we declare main methods with no argument passed.
    }
    //In Java, it call always the main() methods with (String args[]) args with array only.
}
