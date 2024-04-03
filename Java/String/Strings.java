/*

String:

	In java, String is an object that represent sequence of characters.

	Convert char into string,

		char ch[] = {'a','s','h','o','k'};

		String s = new String(ch); //ashok

	String methods are implemented by import.java.lang.String library. The library implements serializable, comparable, charSequence.

	String is immutable this means new instance is created when new string is created or updated.

	Once a string is created we can't able to change its state but new string object is created.

	If you want to make the string as mutable then use StringBuffer, StringBuilder classes.

	Java uses heap technique to store the string values.

	String creation,

	(i) By string literal,

		Java use string literal for memory efficient like if any two or more string values are same then it link the variable with same value to the value then there is no need to create new instance.

		Syntax:

			String variable_name = "string_value";

		Eg:

			String s = "ashok";

			String a = "ashok";

			Here two values are same. In java, it link s and a variables to the value "ashok" in memory. Here no need to create new instance for variable a.

	(ii) By new keyword:

		Syntax:

			String variable_name = new String("String_values");

		Eg:
			
			String s = String("ashok");

______________________________________________________________________________________________________

	Immutable String:


	Eg:


	String s = "Ashok";

	s.concat(" Kumar");

	System.out.print(s); //Ashok

	Because "Ashok" is stored in s. Next step we concatenate "Kumar" to s. Here concatenate value is stored in new string object not in s object. So s value is not changed.


	Solution to resolve this problem,

	String s = "Ashok";

	s = s.concat(" Kumar");

	System.out.print(s); //Ashok Kumar

	Here new string object is link to s object. Now the s will be "Ashok Kumar".

*/