// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		String seedString = args[0];
        String mode = args[1];
        int seedInt = Integer.parseInt(seedString);

        for (int i = 1; i <= seedInt; i++) {
            int steps = 1; 
            int printableInt = i;

            if ("v".equals(mode)) {
                System.out.print(i);
            }

            if (printableInt == 1) {
                printableInt = 3 * printableInt + 1; // 4
                steps++;
                if ("v".equals(mode)) {
                    System.out.print(" " + printableInt);
                }
            }

            while (printableInt != 1) {
                if (printableInt % 2 == 0) {
                    printableInt = printableInt / 2;
                } else {
                    printableInt = (printableInt * 3) + 1;
                }
                steps++;
                if ("v".equals(mode)) {
                    System.out.print(" " + printableInt);
                }
            }

            if ("v".equals(mode)) {
                System.out.println(" (" + steps + ")");
            }
        }

        System.out.println("Every one of the first " + seedInt + " hailstone sequences reached 1.");
    }
}