/*
    this keyword is used to reference varaiable refer to the current object.

    this keyword is used in,

    */
//(i) refer current class instance variable
class Student1{
    int id;
    String name;
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    void display(){
        System.out.println(id+"  "+name);
    }
}

//(ii) to invoke current class method 
class Student2{
    void display(){
        System.out.println("1   Ashok");
    }
    void temp(){
        this.display(); //this is as same as display(), but the compiler automatically convert display() to this.display()
    }
}

//(iii) to invoke current class constructor
//Here one method can hold only one this() method only. If you declare two or more this() it will return compile error.
class Student3{
    int id;
    String name, dept;
    Student3(int id, String name, String dept){
        this.id = id;
        this.name = name;
        this.dept = dept;
    }
    Student3(){
        //this(); Here it call the constructor with no argument passed like Student3()
        this(1,"Ashok","MCA"); //Here it call the constructor with 3 arguments passed like Student3(int id, String name, String dept)
    }
}

//(iv) pass this keyword as an argument in the method

class Student4{
    void m(Student4 obj){
        System.out.println("Student4 is invoked");
    }
    void p(){
        m(this);
    }
}

public class this_keyword {
    public static void main(String[] args) {
        Student1 s1 = new Student1(1, "Ashok");
        s1.display();   

        Student4 s4 = new Student4();
        s4.p();
    }
}
