// String Class Methods

public class String_Class_methods(){
	public static void main(String args[]){

		// toUpperCase() and toLowerCase()

		//toUpperCase() is used to convert given string all characters to uppercase.
		//toLowerCase() is used to convert given string all characters to lowercase.

		String s1 = "AshokKumar";
		System.out.println(s1.toUpperCase()); //ASHOKKUMAR
		System.out.println(s1.toLowerCase()); 	//ashokkumar

		//______________________________________________________________________________________________________

		// trim() is used to remove whitespace before and after string.

		String s2 = "   Ashok    ";
		System.out.println(s2.trim()); //Ashok

		//______________________________________________________________________________________________________

		//startsWith() and endsWith()
		// startsWith() is used to check given string is start with particular characters. It returns boolean value true or false.
		// endsWith() is used to check given string is end with particular characters. It returns boolean value true or false.

		System.out.println(s1.startsWith("As")); //true
		System.out.println(s1.endsWith("ar")); //true

		//______________________________________________________________________________________________________

		//charAt(index_value) is used to get the one character using index value in given string.
		System.out.println(s1.charAt(0)); //A

		//______________________________________________________________________________________________________

		//length() is used to get the length of the string
		System.out.println(s1.length());

		//______________________________________________________________________________________________________

		//intern() is used to copy the string value from one object to another object. It reduce the memory usage because there is no neccessary to create new value in memory
		String s3 = s1.intern();
		System.out.println(s3); //AshokKumar

		//______________________________________________________________________________________________________

		//valueOf() is used to convert string to integer,double,char,float,long,boolean and convert integer,double,char,float,long,boolean to string.

		int num1 = 10;
		String s4 = String.valueOf(num1);
		int num2 = Integer.valueOf(s4);
		System.out.println(s4); //10
		System.out.println(num2); //10

		//______________________________________________________________________________________________________

		//replace() is used to replace particular word in the given sentence.

		String s5 = "Java is a programming language";
		System.out.println(s5.replace("Java","Python"));
	}
}