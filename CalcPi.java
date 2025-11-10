// Computes an approximation of PI.
public class CalcPi {
public static void main(String [] args) { 
// Replace this comment with your code
	String numberString = args[0];
	int numberInt = Integer.parseInt(numberString);
	Double piDouble = 0.0 ;
	
	System.out.println("pi according to Java: " + Math.PI);
	// 1 -(1\3) + (1/5) 
	int i = 0 ;
	Double deviderDouble = 1.0 ;

	for(i = 1 ; i < numberInt ; i ++ ){

		if(i%2 == 0){
			//System.out.println("i is equal to: " + i + " and it has no modulo of " + i%2); // זוגי
			//System.out.println("pi Double is equal to: "+ piDouble);
			//System.out.println("devider Int is equal to: "+ deviderDouble);

			piDouble = piDouble - (1/deviderDouble);
			//System.out.println("pi Double is equal to: "+ piDouble);
			
		} else{
			//System.out.println("i is equal to: " + i + " and it has modulo of " + i%2 ); // אי זוגי
			//System.out.println("pi Double is equal to: "+ piDouble);
			//System.out.println("devider Int is equal to: "+ deviderDouble);

			piDouble = piDouble + (1/deviderDouble);
			//System.out.println("pi Double is equal to: "+ piDouble);
		}
		deviderDouble = deviderDouble + 2 ;
	}

	System.out.println("pi, approximated:     "+piDouble * 4);
	

	
}

}



/*
* 
* Consider the following sum:
1 −
1
3 +
1
5 −
1
7 +
1
9 −
1
11 +
1
13 − ...

The mathematicians Gregory and Leibnitz discovered that as the number of terms in this sum
increases, the sum converges to π / 4. The CalcPi program uses this approximation algorithm to
calculate π. Here are two examples of the program’s execution:
% java CalcPi 10
pi according to Java: 3.141592653589793
pi, approximated: 3.0418396189294032
% java CalcPi 1000
pi according to Java: 3.141592653589793
pi, approximated: 3.140592653839794
The program has one non-negative integer input: the number of terms that should be used in the
calculation. The benchmark value is obtained by printing the Java library constant Math.PI.
* 
* 
* 
* 
*/