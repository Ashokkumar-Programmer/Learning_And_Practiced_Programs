public class Static_Keyword {
    /*
    Static keyword is used for memory management.

    Static keyword is used with variable, method, block, class.

    Static keyword is refers to common property for all objects.

    It makes a program memory efficient.

    For example, if you enter 100 employee details, you need to enter id, name, company.

    For every employee created, single instance of class is created for every employee in memory for id, name, company.

    Here, company name is common for all employee. Then we declare company as static then company will be comman property for all objects.

    And there is no need to create memory space for every time instance of object for company.

    Here, it make the program memory efficient. Here, we can able to change the company name also.

    Static method only uses static variable only. Like main().

    If we call, non-static variable from outside of main() then it show compile time error.

    We create static block like,

    static{
        //block of code
    }

    When the main() is executed then automatically the static block also executed. Here the static block is executed first then the main() is executed.

    Before JDK 1.7, static block is replacement of main(). Without main() also we can execute the program using static block. But After JDK 1.7, main() is must needed.
    */ 

    int rollno; //instance variable
    String name; //instance variable
    static String college = "FX"; //static variable
    Static_Keyword(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }

    static void change_college(){
        college = "Aditanar";
    }
    void display(){
        System.out.println(rollno+"   "+name+"   "+college);
    }
    public static void main(String[] args) {
        Static_Keyword s = new Static_Keyword(1,"Ashok");
        s.display();
        Static_Keyword.change_college();
        Static_Keyword s1 = new Static_Keyword(2, "Hari");
        s1.display();
    }   

    /*
    In above program,
        The static variable and instance variable created.
        If we create instance of class, then all variable will be allocated to memory except static variable.
        Because static variable is allocated to memory only once, if you created instance then it will get the value of static variable from memory.
        If we want to change the value of static, then use static method to change it.
        static method is call using the classname only, it will can't invoke by object.
        static variable contains common property for all instance.

    */
}
