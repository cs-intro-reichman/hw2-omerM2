// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		String seedString = args[0];
        String mode = args[1];
        int seedInt = Integer.parseInt(seedString);
		//seedInt is the line number
		int printableInt = 0 ;
		for(int i = 1 ; i <= seedInt ; i ++ ){
		if (mode.equals("v") && i == 1) {
    	System.out.println("1 4 2 1 (4)");
    	continue;
		}

			int steps = 0 ;
			printableInt = i ;
			
            if (mode.equals("v")) {
                System.out.print(i);
            }
			while (printableInt != 1) {

			if(printableInt %2 ==0){
				printableInt = printableInt / 2 ;
			}else{
				printableInt = (printableInt * 3) + 1;
			}
			steps++;
			if (mode.equals("v")) {
        		System.out.print(" " + printableInt);
    		}

			}
			if (mode.equals("v")) {
				System.out.println(" (" + steps + ")");

            }

			

				
			
		}
		System.out.println("Every one of the first " + seedInt + " hailstone sequences reached 1.");
		
			}
		}





		

	




/*
 * 
 * 
 * 
 * A hailstone sequence is created as follows: Start with some non-negative integer, let’s call it seed,
and obtain a sequence of numbers as follows: (1) If the current number is even, divide it by 2;
otherwise, multiply it by 3 and add 1; (2) Repeat.
For example, here are the first 8 hailstone sequences (the first number in each sequence is the seed):
1, 4, 2, 1, 4, 2, 1, ...
2, 1, 4, 2, 1, 4, 2, 1, ...
3, 10, 5, 16, 8, 4, 2, 1, 4, 2, 1, ...
4, 2, 1, 4, 2, 1, ...
5, 16, 8, 4, 2, 1, 4, 2, 1, ...
6, 3, 10, 5, 16, 8, 4, 2, 1, 4, 2, 1, ...
7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1, 4, 2, 1, ...
It appears, from these examples, that hailstone sequences tend to reach the number 1. Indeed, in
1937 the mathematician Lothar Collatz argued that for any seed N, a hailstone sequence will
eventually reach 1. The Collatz conjecture seems to be true, but up until today no-one succeeded
proving it (and that’s why it’s called a “conjecture” rather than a “theorem”). It is, quite simply, one
of the most tantalizing unsolved problems in mathematics
The Collatz program is designed to test the Collatz conjecture for all seeds between 1 and N. The
program takes two inputs: the highest seed N, and a string which we call mode. This string can be
either “v” (verbose) or “c” (concise). In verbose mode, the program prints all the sequences from
Introduction to CS / RUNI / 2025-26 / Homework 2 / page 4

seed = 1 to seed = N. For each sequence, the program prints all the values until the sequence reaches
1. Next, the program prints the number of steps the series took to reach 1. Finally, the program
prints a summary line. In concise mode, the program prints only the summary line.
If the program terminates and prints the summary line, it verifies the Collatz conjecture up to N.
Here are two example program runs:
% java Collatz 7 v
1 4 2 1 (4)
2 1 (2)
3 10 5 16 8 4 2 1 (8)
4 2 1 (3)
5 16 8 4 2 1 (6)
6 3 10 5 16 8 4 2 1 (9)
7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 (17)
Every one of the first 7 hailstone sequences reached 1.
% java Collatz 100 c
Every one of the first 100 hailstone sequences reached 1.
Proposed implementation: Start by writing a loop that prints one hailstone sequence only, for a
given seed value (N). Test the program for several such seed values. Next, nest this loop inside an
outer loop that varies the seed from 1 to N. Finally, handle the verbose/concise requirement.
String comparison: Strings should be compared for equality using Java’s boolean method
str1.equals(str2). For example, if mood is a variable of type String, and you wish to check if it
equals "happy", use the method call mood.equals("happy").

 */