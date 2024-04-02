/* 

For Loop:

It is used to iterate a part of the program several times. 

When the no. of iterations is fixed then use for loop.

Syntax:

for(initialization;condition;increment/decrement){
	block of code
}

Here it first start with initialization and then check the condition and execute the block of code

After execute the block of code then execute the increment/decrement.

Here we can use nested for loop also. This means for loop contain another for loop.

for(i=0i<5;i++){
	for(j=0;j<5;j++){
		System.out.println(i+"   "+j);
	}
}

______________________________________________________________________________________________________

For-each loop:

It is easier than simple for loop because no need to check condition and no need to increment/decrement

It is used to traverse the array or collections in java.

for(datatype new_variable:array_variable){
	block of code
}

Eg:

arr[]={1,2,3,4};
for(int i:arr){
	System.out.println(i);
}

______________________________________________________________________________________________________

Labeled for loop:

Here we define the name for loop.

It is useful to break/continue particular for loop.

label nname:
for(initialization;condition;increment/decrement){
	block of code
}

Eg:

aa:
for(i=0;i<5;i++){
	bb:
	for(j=0;j<5;j++){
		if(i==2 &&j==2){
			break aa;
		}
	}
}

______________________________________________________________________________________________________

Infinte loop:

for(;;){
	
}

______________________________________________________________________________________________________
*/