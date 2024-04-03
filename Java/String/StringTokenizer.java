//StringTokenizer Class

//StringTokenizer is added by import java.util.StringTokenizer class

//StringTokenizer is used to split the string as several tokens.

//Delimiters is given at the creation of StringTokenizer.

public class StringTokenizer{
	public static void main(String args[]){
		StringTokenizer s1 = new StringTokenizer("Ashok MCA FXCollege"," ");
		StringTokenizer s2 = new StringTokenizer("Ashok MCA FXCollege");

		//hasMoreTokens() is used to check if there is tokens is available or not. It return as boolean.

		//nextToken() is used to get the next token value. It return as string.

		while(s1.hasMoreTokens()){
			System.out.println(s1.nextToken());
		}

		//nextToken(delimiters) is used to get the string value based on given delimeter.

		System.out.println(s2.nextToken(" "));

		//hasMoreElements() and nextElement() is as same as hasMoreTokens() and nextToken().
		//hasMoreElements() and nextElement() use enumeration interface but hasMoreTokens() and nextToken() doesn't use enumeration interface.

		//countTokens() is used to calculate no. of tokens available.

		System.out.println(s1.countTokens());

	}
}