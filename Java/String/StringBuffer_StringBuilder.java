//StringBuffer class

//StringBuffer is used to convert the string into mutable string which means modifiable string.

//StringBuffer is synchronized which means multiple threads able to shared resources.

//StringBuilder Class

//StringBuilder is used to make the string as mutable.

//StringBuilder is non-synchronized, which means one thread able to share resource to another thread multiple thread concept not worked here.

//StringBuilder and StringBuffer have same methods and same functionality but main difference between among is,
//StringBuilder is non-synchronized adn StringBuffer is synchronized.

public class StringBuffer_StringBuilder{
	public static void main(String args[]){
		//append(word) is used to concatenate the given string to exist string
		StringBuffer s1 = new StringBuffer("Ashok");
		s1.append(" Kumar");
		System.out.println(s1); //Ashok Kumar

		//______________________________________________________________________________________________________

		//insert(index,word) is used to insert the given string in particular index.
		s1.insert(1,"Kumar"); //AKumarshok Kumar

		//______________________________________________________________________________________________________

		//replace(start_index,end_index,word) is used to replace the word to the given string.
		s1.replace(1,6,""); //Ashok Kumar

		//______________________________________________________________________________________________________

		//delete(start_index,end_index) is used to delete the particular words in the given string.
		s1.delete(5,11); //Ashok

		//______________________________________________________________________________________________________

		//reverse() is used to reverse the given string.
		s1.reverse(); //kohsA

		//______________________________________________________________________________________________________

		//capacity() is used to return the current capacity of the buffer. Default capacity value is 16. If you declare empty StringBuuffer then its capacity is 16.
		s1.capacity(); //16 Calculate capacity using (old_capacity*2)+2
	}
}