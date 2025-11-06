//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            String word = args[0].toUpperCase();
            String number = args[1];
            int intNumber = Integer.parseInt(number);
            int wordLength = word.length();
            int i = 0;
            int j = 0;

            char[] anLetters = {'A', 'E', 'F', 'H', 'I', 'L', 'M', 'N', 'O', 'R', 'S', 'X'};

            for(i=0;i < wordLength;++i){
                    char currentLetter = (word.charAt(i));
                        boolean isanletter = false;
                        for(j=0;j < anLetters.length ;++j){
                            if(anLetters[j] == currentLetter){
                                isanletter = true;
                                System.out.println("Give me an " + currentLetter + ": " + currentLetter + "!" );
                             }
                          }
                          if(isanletter != true ){
                            System.out.println("Give me a " + currentLetter + ": " + currentLetter + "!" );

                          }

                
            }
            System.out.println("What does that spell?");
            i = 0;
            for(i=0; i < intNumber ;i++){
                System.out.println(""+word+"!!!");
            }
        }
    }
            


        



/*
 * 
 * The Cheers program gets two inputs: a string and a non-negative integer value, and prints a crowd
cheering output. Here is an example of the program’s execution:
% java Cheers RUNI 5
Give me an R: R!
Give me a U: U!
Give me an N: N!
Give me an I: I!
What does that spell?
RUNI!!!
RUNI!!!
RUNI!!!
RUNI!!!
RUNI!!!
If the inputted letter is one of the letters {'A', 'E', 'F', 'H', 'I', 'L', 'M', 'N', 'O', 'R',
'S', 'X'}, the program prints "an" instead of "a". Tip: This condition can be tested using a function
call of the form string.indexOf(ch). You have to figure out what you need to place instead of
string and ch.

Introduction to CS / RUNI / 2025-26 / Homework 2 / page 4
Implementation plan: We suggest writing the program in stages. Start by writing a program that gets
the two command-line arguments and uses a loop to print only the "Give me..." lines, without the
"a" / "an" touch. Then add the "a" / "an" touch. Finally, use another loop to generate the remaining
lines. Assume that the input string contains only letters, and no spaces. The inputted letters can be
either lowercase, or uppercase. The outputted letters must be uppercase. Tip: Convert the inputted
text to upper case just after inputting it.
 */
