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
}
