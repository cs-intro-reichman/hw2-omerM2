public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

        String additionalMinutesString = args[1];
        int additionalMinutesInt = Integer.parseInt(additionalMinutesString);


        System.out.println(hours);
        System.out.println(minutes);
        System.out.println(additionalMinutesString);

        int totalMinutes = 0;

        totalMinutes =  hours * 60  + minutes + additionalMinutesInt ;
        
        System.out.println(totalMinutes);
        
        int totalHours = totalMinutes / 60;

        System.out.println(totalHours);

        int newHours = totalHours % 24;
        
        String formattedHourString = String.format("%02d", newHours);


        System.out.println(newHours);

        int newMinutes = totalMinutes - totalHours*60 ;
        
        String formattedMinutesString = String.format("%02d", newMinutes);

        
        System.out.println(newMinutes);

        System.out.println("" + formattedHourString + ":" + formattedMinutesString );

    }
}

/*          1. Time Calculations (20 Points)
The TimeCalc program gets a time input which is given using the 24-hour hh:mm format, and a
number of minutesToAdd input. The program computes time + minutesToAdd, and prints the
resulting time using the 24-hour hh:mm format. For example, the time 10:30 + 4055 minutes
happens to be 06:05. Here is one way to calculate this new time value:
Total minutes = (10 hours * 60 minutes) + 30 minutes + 4055 minutes = 4685 minutes;
Total hours = 4685 / 60 = 78;
New hours = 78 % 24 = 6; // The remainder operator % is also known as modulo
New minutes = 4685 – (78 * 60) = 5;
Therefore the answer is 06:05.
Explanation:
● If x and y are both int values, the expression x / y evaluates to the integer division of x by y
● If x and y are both int values, the expression x % y evaluates to the remainder of the integer
division x / y
The TimeCalc program gets the hh:mm and minutesToAdd values as two command-line arguments.
Here are some program run examples:
% java TimeCalc1 10:20 30
10:50
% java TimeCalc1 10:20 40
11:00
% java TimeCalc1 10:20 500
18:40
% java TimeCalc1 11:30 350
17:20
% java TimeCalc1 09:25 700
21:05
% java TimeCalc1 10:30 4055
06:05
% java TimeCalc1 22:07 12345
11:52
% java TimeCalc 23:59 10
00:09

Introduction to CS / RUNI / 2025-26 / Homework 2 / page 2
Input rules:

The hh and mm inputs are supplied as a single command-line argument: A string consisting of two-
digit characters, followed by the character ‘:’, followed by two-digit characters;

Both hh and mm use a leading ‘0’, as needed. For example, the time "5 hours and 8 minutes" is
represented as the string "05:08";
Midnight is represented as "00:00".
Once converted to int values, the hh and mm values must be, respectively, between 0 and 23 and
between 0 and 59, inclusive.
Output rules: Exactly the same as the input rules. (Note that the output rules of this program are
different than the output rules of the TimeFormat program from Homework 1).
Implementation tip: Start by writing a program that gets the inputs and prints them – that’s all.
For example:
% java TimeCalc1 09:30 1475
Hours: 9
Minutes: 30
Minutes to add: 1475
Next, calculate the new hours and minutes, and print them also, as int values:
% java TimeCalc1 09:30 1475
Hours: 9
Minutes: 30
Minutes to add: 1475
New hours: 10
New minutes: 5
Once you get the calculation right, eliminate the above outputs by commenting out the Java
statements that generate them. Finally, write the final version that prints the result using the output
rules:
% java TimeCalc1 09:30 1475
10:05
 * 
 * 
 * 
 * 
 * 
 */