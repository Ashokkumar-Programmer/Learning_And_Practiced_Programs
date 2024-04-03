/*

Comments  are the statement in a program that are not executed by compiler and interpreter.

Comments increase the readability of the code.

Comments used to maintain the code and find the errors easily.

Comments makes more information about developer activity in the code like variable creation, class creation, loop creation, 
method creation, etc...

______________________________________________________________________________________________________

Types of comments in Java,

(i)  Single-line comment:

It is used to comment the particular line in a code. 

It is used to provide information about variable name.

double-slash(//) is used for sinle line comments.

______________________________________________________________________________________________________


(ii)  Multi-line comments:

It is used to comment to mult line in a code.

It is used to provide information about purpose of method, class, object, etc..

Starting comment (/*) and Ending comment (*/).

/*
	
	line of comments
	
*/

/*

______________________________________________________________________________________________________
(iii) Documentation comments:

It is as like as multi line comment. It is used to write documentation for large project or software application.

Starting comment (/**), then it between starting and ending statement (*) is occur for every line of comments and Ending comment (*/) 

/**
 * documentation for project 
*/

/**
 * Some tags in documentation comments,
 * {@docRoot} - It is the root directory of generated document
 * @author authot_name - To add author name of the file
 * {@code text} - To add single line code
 * @version version_name - To add version of the file
 * @since release_date - Initial release date of the file
 * @param parameter_name description - To describe the information about variable used in the file
 * @return description - To know the return value of method. void method can't return any value so void method don't want this description.
 * So on..
 * Execute this documentation using javadoc filename in cmd and after executing the command HTML file is created in the current directory. 
 * Open the HTML file, then it provide complete documentation about class file.

/*

______________________________________________________________________________________________________

Executable comment line:


If we want to excute the particular line comment using lexical transformation befor the comment


// \u000d System.out.println("Hello");

/u000d -> describe the new line, end of comment.

Here this comment is executable comment line. This applicable for single line comment only.

*/