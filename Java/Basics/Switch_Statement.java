/*

While loop is used to execute one statement from multiple conditions. 
It is as like as if-else-if ladder
The switch statement works with short, long, string, int, enum types and also Wrapper.

Syntax:

switch(expression){
    case value1:
        case statement
    case value2:
        case statement
    case value3:
        case statement
    .
    .
    .
    default:
        default statement
}

The case value must be unique.

Here we can also use the break for every case. If any break occur in any case then it exit from end of switch statement.

Here break is optional.

Nesting switch is allowed here.

default work when the given expression not 

n number of case value is creation is allowed and also n number of nested switch statement is allowed.

Eg:
switch(expression){
    case value1:
        switch(expression){
            case value1:
                switch(expression){
                    case value1:
                        case statement
                }
        }
    case value2:
        case statement
}

*/