/*

Break:

Break is used in inner loop and switch statement.

Break is used in for loop, while loop, do-while loop, switch statement.

Break is never used in conditional statement instead we use else block.

It terminate the current loop or process and jump to next statement.

If the break used in nested loop, then break the current loop only and jump to root or parent loop of current loop.

Root or parent loop means previous loop for current loop.

Eg:

for(i=0;i<5i++){
	for(j=0;j<5;j++){ //When break execute then terminate this loop only. Then jump to parent or root loop for this loop.
		if(j==4){
			break;
		}
	}
} 

label break:

break label_name;

______________________________________________________________________________________________________

Continue:

Continue is used in inner loop only.

Continue is used in for loop, while loop, do-while loop. But continue not used in switch statement.

Continues is used to skip the current iteration and jump to next iteration.

Eg:
for (i=0;i<5 ;i++ ) {
	if(i==2){
		continue;
	}
	//Here the iteration i=2 is skipped then it jump tp increment/decrement to process next iteration.
}

In continue, we able to use label continue. 

label continue:

continue label_name;

In label continue, it skip current iteration then jump to defined label and start the process through the label.

______________________________________________________________________________________________________

*/