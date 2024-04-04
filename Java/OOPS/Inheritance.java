/*

Inheritance:

Inheritance is a concept of one class acquires all the properties and behaviour of a parent class.

Here, we able to reuse the methods and fields of parent class.

It is used for code reusability and method overriding.

It is represent as a IS-A relationship which is also known as parent-child relationship

*/

/*

Types of inheritance:

(i) Single inheritance

(ii) Multilevel inheritance

(iii) Hierarchical inheritance

(iv) Multiple inheritance //multiple inheritance is not supported in java because to reduce complexity and simplifying the language.

(v) Hybrid inheritance - Hybrid(mixture) inheritance is composition of two or more types of inheritance.
*/


//Single inheritance - When a class inherits another class

class A1{
    void a1(){
        System.out.println("A");
    }
}

class B1 extends A1{
    void a1(){
        System.out.println("B");
    }
    //Here a1() method is overriding.
}

//multilevel inheritance - When there is a chain of inheritance

class A2{
    void a2(){
        System.out.println("A2");
    }
}
class B2 extends A2{
    void b3(){
        System.out.println("B2");
    }
}
class C2 extends B2{
    void c2(){
        System.out.println("C2");
    }
}

//Hierarchical inheritance - When two or more classes inherits single class

class A3{
    void a3(){
        System.out.println("A3");
    }
}
class B3 extends A3{
    void b3(){
        System.out.println("B3");
    }
}
class C3 extends A3{
    void c3(){
        System.out.println("C3");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        
    }
}
