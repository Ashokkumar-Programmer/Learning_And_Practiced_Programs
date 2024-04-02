/*

An Array is an collection of variable with same datatype which is stored in contiguous memory.

In Java, array is an object that means for array proxy class is created.

Array value is stored starting from index 0th position.

Array is used for code optimization and random access. Arrys pros is size limit, which means we declared the size of the array in the beginning.

______________________________________________________________________________________________________

Array Methods:

	1. Array length,

		array_name.length;

	2. To get the class of the array,

		Class class_name = array_name.getClass();
		String s  = class_name.getName(); //Here we get the classname of the array

	3. Copy the current array to another array,

		int arr[] = {1,2,3,4,5};

		int copy[] = new int[7];

		Synatx:

			System.arraycopy(source_array,starting_index,copied_array,starting_index,ending_index);

			here,

				source_array -> Current array_name

				starting_index -> Where we start the copy process in the source_array. If we want to copy the array value from index 1, then put 1; it copy the array value from 1.

				copied_array -> Copied array_name

				starting_index -> must be 0.

				ending_index -> Here how many value to copied from source array.

		System.arraycopy(arr,0,copy,0,arr.length);

	4. Clone the array,

			int arr[] = {1,2,3,4,5};

			int copy[] = arr.clone();
______________________________________________________________________________________________________

(i) Single Dimensional Array (1-D Array):

	declare:

		datatype[] array_name;
		datatype []array_name;
		datatype array_name[];

	Initialize the array:

		datatype array_name = new datatype[array_size];

	without array_size in the beginning,
		
		datatype array_name[] = {array_values};

	Accessing array,

		Using for-each,

		for(datatype new_variable:array_name){
			new_variable;
		}
		
		Using loop,

		for(variable=0;variable<array_length;variable increment/decrement){
			array_name[variable];
		}
	
	Passing array into methods,

	void method_name(datatype array_name[]){
		block of code;
	}

	Anonymous Array,

	There is no need to create a array_name to pass the array values.
	void sample(int arr[]){

	}
	sample(new int[]{1,2,3,4});

	Return all array value,

	void sample(int arr[]){
		return new int[]{1,2,3,4};
	}

	If you process the array using loop, then you need to know ArrayIndexOutOfBound Exception. This means we process the array out the limit.

	For example, array size is 5 then array value indexes are 0,1,2,3,4. Here we access the index 5 then we get the exception because we process the array out of its limit.

______________________________________________________________________________________________________	

(ii) Multi_dimensional Array (2-D Array):

Here we store the values in the array like row and column (rows x columns).

	declare,

		datatype[][] array_name;
		datatype [][]array_name;
		datatype array_name[][];
		datatype []arrayname[];

	Initialize the array,

		datatype array_name[][] = new datatype[row_size][column_size];

		To declare like this int[][] arr = new int[3][];

		here no.of column is empty, then we need to declare like this also

		arr[0] = new int[3]; // It represents first column
		arr[1] = new int[3]; // It represents second column
		arr[2] = new int[3]; // It represents third column

	Without using row_size and column_size,

		datatype array_name[][] = {{array_values},{array_values},...};

	
	Jagged array means an 2-D array with different row and column size like, int arr[][] = new int[3][4];




*/