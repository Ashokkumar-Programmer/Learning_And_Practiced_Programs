/*
Aggregation:

If a class have an entity reference is known as aggregation.
It represent HAS-A relationship.
If you cannot able to use inheritance, then aggregation is best choice for you.
If child class inherits parent class without using extends keyword. We can create parent object in child class and we inherit the parent class to child class.

*/


class A1{
    void a1(){
        System.out.println("A1");
    }
}
class B1{
    A1 a1; //Here we create object for A1 class
    void b1(){
        a1 = new A1(); //Here we create constructor for A1()
        a1.a1(); //Here we access a1()
        System.out.println("B1");
    }
}


public class Aggregation {
    public static void main(String[] args) {
        new B1().b1();
    }
}
