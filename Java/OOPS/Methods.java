public class Methods {
    //Creating the method
    //It is instance method. The method is access by any class or any instance of class.
    void add(int a,int b){
            System.out.println(a+b);
    }
    public static void main(String[] args) {
        /*
            Methods is collection of instructions that perform specific task.
            It is used to achieve reusability of code.
            It provides the easy modification and readability of code, just by adding and removing chunk of code.
        */

        /*
            Method Syntax:

            AccessModifier ReturnType MethodName(Parameters){
                Body of method
            } 

            AccessModifier:

            It is the access type of the method. It specifies the visiblity of the method.

            Four types of access modifier,

            (i) public: The method is accessible by all classes.

            (ii) private: The method is accessible only within the class.

            (iii) protected: The method is accessible only within the package or subclasses.

            (iv) default: If you don't declare any access specifier, java uses default access modifier by default. Here, the method is accessible only in the same package.

            ReturnType:

            It is the datatype that the method returns. We use void keyword, when the function doesn;t return any value.

            MethodName: The name of the method.

            Parameters:
            The list of parameters separated by commas and ennclosed within parentheses.
            It contains datatype and variable name.
            It is optional. If we don't pass any values to the method, then make it blank.

            Body of method: It contains all actions to be performed.
        */

        /*
            Types of method:

            (i) Pre-defined method
            (ii) User-defined method

        */

        //Pre-defined method

        //The methods are already available in java.

        System.out.println(Math.min(2, 3)); //Here min() is pre-defined method

        //User-defined method

        //The method is created by user
        
        Methods m = new Methods();
        m.add(1,2);
    }
    /*
        Static Method:
        A method that belong to a class rather than an instance of a class is called static.

        The static method is defined by static keyword.

        Simply, the static method is access only by that class or instance of class(object). We can't access by another class like inheritance.
    */
    static void sub(int a, int b){
        System.out.println(a+b);
    }

    /*
    Abstract method:

    The method declare without any implmentation.

    The abstract is available for class also, the class is created without any implementation or empty class.

    The abstract method is created only within the abstract class only.
    
    */
    abstract class multiplication{
        abstract void mul();
    }

    //In factory method, the object is returned by an method to the class.
}
