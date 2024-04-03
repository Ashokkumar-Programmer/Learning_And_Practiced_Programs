public class Comparison{
	public static void main(String args[]){
		String string_1 = "ashok";

		String string_2 = "ashok";

		//Use equal() method

		System.out.println(string_1.equals(string_2)); //It check two strings are same and both the string should be uppercase or lowercase

		//"ashok" -> "ashok" => true, "ashok" -> "ASHok" => false

		System.out.println(string_1.equalsIgnoreCase(string_2)); //It check two strings are same and it ignore both the string not should be in uppercase or lowercase
		
		//"ashok" -> "ASHok" => true


		//______________________________________________________________________________________________________


		//By using == operator

		String string_3 = new String("ashok");

		System.out.println(string_1==string_2); // Both the strings are refers to same instance

		System.out.println(string_1==string_3); //s3 refers to instance created in non-pool

		//______________________________________________________________________________________________________

		//By using compareTo() method

		//Here it check the two strings length.

		String string_4 = new String("mca");

		/*

		In compareTo(), it check every character in two strings.
		
		If any two character not match then it stop the comparison and return the result.

		Eg: "ashok","mca".

		a -> m. Here characters are different and calculate difference between two character. 1-13 => -12
		
		compareTo() method returns 0, positive value, negative value.
			
			string_1 == string_2 -> 0

			string_1 > string4 -> difference between not match two characters

			string_4 < string_1 -> difference between not match two characters

		*/

		System.out.println(string_1.compareTo(string_2));
		System.out.println(string_1.compareTo(string_4));
		System.out.println(string_4.compareTo(string_1));
	}
}