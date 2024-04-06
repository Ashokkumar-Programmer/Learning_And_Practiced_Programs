import java.lang.reflect.Method;

class Test{
    void test(){
        System.out.println("Test");
    }

    Test test1(){
        return this;
    }
}

public class Method_Overriding extends Test{
    /*
        If subclass has the same method as declared in the parent class is called method overriding.
        It is used for runtime polymorphism.

        Rules:
            The method name as same name as parent class.
            The method parameters must have same parameter in parent class.
            It must in IS-A relationship(inheritance).
        
        static method is can't override. main() also static, so main() is not override.
    */
    void test(){
        System.err.println("Method Overriding");
    }

    /*
        Covariant return type:
            Here we change the return type of method using overriding.
            This functionality is not avaiable before Java 5.
        
        Below program, I change the return type like return current class object.

    */
    @Override
    Method_Overriding test1(){
        return this;
    }

    public static void main(String[] args) {
        Method_Overriding m = new Method_Overriding();
        m.test();

        new Method_Overriding().test1().test(); //Execute function without creating object.
    }
}
