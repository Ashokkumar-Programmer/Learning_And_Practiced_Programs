/*

Substring:

A part of string is called substring. substring is the concept of split the words from given sentences based on start_index and end_index.

Java String class provide build-in method called substring().

Syntax:
string_variable.substring(start_index);
or 
string_variable.substring(start_index,end_index);

Eg:

String s = "AshokKumar";

Index_value            String
		0 						 A
		1 						 s
		2 						 h
		3 						 o
		4 						 k
		5 						 K
		6 						 u
		7 						 m
		8 						 a
		9 						 r

s.substring(4); //kKumar
s.substring(4,8); //kKum

//______________________________________________________________________________________________________

Another method from Java String class called split(). This method is used to split the string based on given parameter and store it in an array.

If you want to convert array to string suing Array.toString(array_variable).

String s = "AshokKumar,MCA,FX College";

String[] array_string = s.split(","); //['AshokKumar','MCA','FXCollege'];
System.out.println(array_string[0]); //AshokKumar
System.out.println(Array.toString(aray_string)); //['AshokKumar','MCA','FXCollege']
*/