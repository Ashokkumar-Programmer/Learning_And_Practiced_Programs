//Regex

//Regex stands for regular expression.

//Regex is used to definea pattern for searching and manipulating a string.

//java.util.regex package is used to import the regex.

/*
Three classes in java.uti.regex,
1. Pattern - Compiled representation of regular expression
2. Matcher - Interprets the pattern 
3. PatternSyntaxException - Unchecked exception
*/
import java.util.regex.*;
class Regex{
	public static void main(String args[]){
		String sentence1 = "thupparku thuppaya thuppakki thupparku thuppaya thooum mazhai";
		Pattern p = Pattern.compile("thuppa"); //It will convert into compiled format for regex. And here "thuppa" is regex expression
		Matcher m = p.matcher(sentence1); //It will get the sentence and match the given pattern
		int count = 0;
		while(m.find()){ //find() - If the given pattern available then it returns true otherwise false
			count++; // It count given pattern is no. of times appears in given sentence
			System.out.println(m.group()+"  Start: "+m.start()+"    End: "+m.end()); //group() is used to print the match string, start() is used to print the starting index value of match string, end() is used to print the end index value of match string
		}
		System.out.println("thuppa is "+count+" times appears in the given sentence");

		//______________________________________________________________________________________________________

		String sentence2 = "Tamil is the oldest language";
		Pattern p = Pattern.compile("^Tamil"); //caret(^) is used to check whether the given word is appears in starting
		Matcher m = p.matcher(sentence2);
		while(m.find()){
			System.out.println(m.group()+"    "+m.start()+"   "+m.end());
		}
		Pattern p1 = Pattern.compile("language$") //dollar($) is used to check whether the given word is appears in ending.
		Matcher m1 = p1.matcher(sentence2);
		while(m1.find()){
			System.out.println(m1.group()+"    "+m1.start()+"   "+m1.end());
		}
		Pattern p2 = Pattern.compile("T|a") //Pipe(|) for OR operation. It will check T or a appears in which places.
		Matcher m2 = p2.matcher(sentence2);
		while(m2.find()){
			System.out.println(m2.group()+"    "+m2.start());
		}

		//______________________________________________________________________________________________________

		//Character Classes
		//Within [] is called character classes
		String sentence3 = "abcbcacabaaabbc";
		Pattern p3 = Pattern.compile("[abc]"); //this means a or b or c.
		/*

		Pattern p3 = Pattern.compile("[^ab]"); //This means give character except a and b.
		Pattern p3 = Pattern.compile("[a-z]"); //This check small lettera to z character is appears in the goven sentence.
		Pattern p3 = Pattern.compile("[A-Za-z]"); //This check capital letter A to z and small letter a to z is appears in the given senterce.
		Pattern p3 = Pattern.compile("[0-9]"); //This check from 0 to 9 number is appears in the given sentence.
		Pattern p3 = Pattern.compile("[^a-zA-Z0-9]"); //This check except a to z, A to Z, 0 to 9 characters will be shown. This statement will helps to find all special characters in the given statement.

		*/
		Matcher m3 = p.matcher(sentence3);
		while(m3.find()){
			System.out.println(m3.group());
		}

		//______________________________________________________________________________________________________

		//Pre-defined character classes (Meta Character classes)
		String sentence4 = "Tamil Tamilan TamilNadu";
		Pattern p4 = Pattern.compile("\\s");// Here \\ means single slash(\) is already for escape sequence, so we put here to avoid error to put double slash(\\).
		/*
		Here \\s means spaces occurs in the given sentence and \\S means except space occurs in the given sentence.
		
		Here \\d means digits occurs in the given sentence and \\D means except digits occurs in the goven sentence.
		
		Here \\w means Alphabets and digits occurs in the given sentence and \\W means except digits and alphabets occur in the given sentence.
		
		Here \\b means boundary. Here when space occur it set as boundary. After space given word is start with given word in the given sentence. Eg: Patter.compile("\\bTamil");
		\\bTamil\\b means start with Tamil and end with Tamil or Whole word should be Tamil.
		
		Here \\B means non-boundary. Here when space occur it set as boundary. After space given word is doesn't start with given word in the given sentence. Eg: Patter.compile("\\BTamil");
		\\BTamil\\B means doesn't start with word  Tamil and doesn't end with Tamil.
		
		Here \\G means grouping. Here it will search combined words. It will search given word is occur in combined word more than 1 times. Eg: "TamilTamilan TamilNadu"
		\\GTamil. Output: Tamil Tamil. Here in the combined word the Tamil is occur in two times and it ignore all words after space.
		
		Here . means all characters including speacial characters in the given sentence.
		.a... - 2nd character should be g and length of the word should be 5.
		*/
		Matcher m4 = p4.matcher(sentence4);
		while(m4.find()){
			System.out.println(m4.group());
		}

		//______________________________________________________________________________________________________

		//Quantifier

		//This return given pattern no. of times occur in the given sentence.

		String sentence5 = "abaabbaaabbbabab";
		pattern p5 = Pattern.compile("a+");
		/*
		Here, + means given character occur atleast once or given character no. of times occur continously in the given sentence
		Output:
		a
		aa
		aaa
		a
		a
		For ab+,
		ab
		abb  Here extra b is occur. Because here start character should be "a", when a is occur it stop print.
		abbb
		ab
		ab
		
		Here, * means it print match character and non-match character also.
		Output:
		a
			-> Empty space for b
		aa
			-> Empty space for b
			-> Empty space for b
		aaa
			-> Empty space for b
			-> Empty space for b
			-> Empty space for b
		a
			-> Empty space for b
		a
			-> Empty space for b
			-> Empty space for \0 (Ending)

		here, ? means it print single match character and non-match character also.
		* give multiple characters with given match and ? give single character with given match.
		Output:
		a
			-> Empty space for b
		a
		a
			-> Empty space for b
		a
		a
		a
			-> Empty space for b
			-> Empty space for b
			-> Empty space for b
		a
			-> Empty space for b
		a
			-> Empty space for b
			-> Empty space for \0 (Ending)

		Here a{n} means continously given character occur n times
		Output: a{2}
		aa
		aa
		
		a{n,m} means given character occur minimum n times and maximum m times.
		Output: a{1,3}. It means a occur continously 1 times, 2 times and 3 times.
		a
		aa
		aaa
		a
		a
		*/
		Matcher m5 = p5.matcher();
		while(m5.find()){
			System.out.println(m5.group());
		}

		//______________________________________________________________________________________________________

		//split() method for Pattern and String classes
		//spilt() is used to store the split words into array. It split the word based on given character.
		String sentence6 = "Payilagam Chennai Tamil Nadu";
		Pattern p = Pattern.compile("a");
		String[] s = p.split(sentence6);
		for(String s:s1){
			System.out.println(s1);
		}
		/*
		Output:
		P
		yil
		g
		m Chenn
		i T
		mil N
		du
		Here it spilt the words except "a".
		*/
	}
}