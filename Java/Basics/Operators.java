//Operator is a symbol that perform some operation among two operands.
public class Operators{
    public static void main(String[] args) {
        /*
            1. Unary Operators

            Postfix: exp++, exp-- . Here it print the value and then change the value in memory

            Prefix: ++exp, --exp, ~exp, !exp. Here it change the value in memory and then print the value
        */
        int a1 = 5;

        System.out.println(a1++); // 5 and a becomes 6 -> a = 6

        System.out.println(a1--); // 5 and a becomes 4 -> a = 4

        System.out.println(++a1); // 5 and a becomes 5 -> a = 5

        System.out.println(--a1); // 4 and a becomes 4 -> a = 4

        System.out.println(~a1); // a becomes -6

        /*
            In ~ operator,

            For Poistive value - add 1 to current value and make the value as minus

            For Negative value - subtract 1 from current value and make the value as positive
        */
        boolean b1 = true;
        System.out.println(!b1); // a becomes false

        /*
            In ! operator,

            For true, the boolean value becomes false

            For false, the boolean value becomes true
        */
//  -------------------------------------------------------------------------------------------------------------------
        
        /*
            Arithmetic Operator
            
            + -> Addition Operator

            - -> Substraction Operator

            * -> Multiplication Operator

            / -> Division Operator (return quotient)

            % -> Modules Operator (return remainder)
        */

        int a2 = 20;
        int b2 = 10;

        System.out.println(a2+b2);
        System.out.println(a2-b2);
        System.out.println(a2*b2);
        System.out.println(a2/b2);
        System.out.println(a2%b2);

//  -------------------------------------------------------------------------------------------------------------------

        /*
            Swift Operator

            >> -> Left swift operator (a*b^b)

            << -> right swift operator (a/b^b)
        */

        int a3 = 20;
        int b3 = 10;

        System.out.println(a3>>b3);
        System.out.println(a3<<b3);

//  -------------------------------------------------------------------------------------------------------------------

        /*
            Logical Operator

            && - Logical AND -> If the first condition is false then second condition is not checked.

            & - Bitwise AND -> If the first condition is false and second condition is also checked.

            || - Logical OR -> If the first condition is true then second condition is not checked.

            | - Inclusive Bitwise OR -> If the first condition is checked ad second condition is also checked.

            ^ - Exclusive Bitwise OR -> If both condtions are different then the whole condition becomes true,
                                        If both conditions are same then the whole condition becomes false. 
        */

        int a4 = 20;
        int b4 = 10;

        System.out.println(a4<=10 && ++b4<=10); // b4=10
        System.out.println(a4>=10 & ++b4<=10); // b4=11
        System.out.println(a4>=10 || ++b4<=10); //b4=11
        System.out.println(a4>=10 | ++b4<=10); //b4=12
        System.out.println(5^7); // 0101 ^ 0111 = 0010 -> 2

//  -------------------------------------------------------------------------------------------------------------------

        /*
            Ternary Operator

            (condition)?argument1:argument2;

            First it check the condition, if the condition is true then execute argument1 otherwise execute argument2/
        */

       int a5 = 20;
       int a5 = 10;

       System.out.println(a5>b5?a5:b5);

//  -------------------------------------------------------------------------------------------------------------------

        /*
            Assignment Operator

            += -> Addition -> a+=b => a = a+b;

            -= -> Subtraction -> a-=b => a = a-b;

            *= -> Multiplication -> a*=b => a = a*b;

            /= -> Division -> a/=b => a = a/b;

            %= -> Modulus -> a%=b => a = a%b;
        */

       /*
            Comparision Operator

            > - Greater than Operator. It is true when argument1 is greater than argument2 otherwise false

            < - Less than Operator. It is true when argument1 is less than argument2 otherwise false

            >= - Greater than or equal to Operator. It is true when argument1 is greater than argument2 or argument1 is  equal to argument2 otherwise false

            <= - Less than or equal to Operator. It is true when argument1 is less than argument2 or argument1 is  equal to argument2 otherwise false

            == - Equal to operator. It is true when argument1 is equal to argument2 otherwise false.

            != - Not equal to operator. It is true when argument1 is not equal to argument2 otherwise false.

            instanceof -  It is check whether the given object is instance of given class.
                          It is also known as type comparison operator  

            Eg:

            public class Sample{
                public static void main(String args[]){
                    Sample s = new Sample();
                    if(s instanceof Sample){
                        System.out.println("S is the instance of Sample class");
                    }
                }
            }
       */
    }
}