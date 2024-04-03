public class Concatenation{
	public static void main(String args[]){
		// Concatenate two string as one string

		String string_1 = "Ashok";
		String string_2 = "Kumar";

		//By using + operator

		System.out.println(string_1+string_2);

		//Here it convert the string into (new StringBuilder()).append("Ashok").append("Kumar").toString() during compile;

		//If you concatenate any number to string then the number automatically convert into string using toString() while compile.

		//______________________________________________________________________________________________________

		// Using concat() method

		System.out.println(string_1.concat(string_2));

		//______________________________________________________________________________________________________

		//using StringBuilder class.

		//It is faster method and make the string as mutable which means update the string value.

		StringBuilder string_3 = new StringBuilder("Ashok");
		StringBuilder string_4 = new StringBuilder("Kumar");
		StringBuilder string_5 = string_3.concat(string_4);
		System.out.println(string_5.toString());

		//using format() method

		String string_6 = new String("Ashok");
		String string_7 = new String("Kumar");
		String string_8 = String.format("%s%s",string_6,string_7);
		System.out.println(string_8.toString());

		//______________________________________________________________________________________________________

		//Using String.join()

		String string_9 = String.join(", ",s1,s2);
		System.out.println(string_9.toString());

		//______________________________________________________________________________________________________

		//Using StringJoiner class

		StringJoiner joiner = new StringJoiner(", ");
		joiner.add("Ashok");
		joiner.add("Kumar");
		System.out.println(joiner.toString());

		//______________________________________________________________________________________________________

		//

	}

}