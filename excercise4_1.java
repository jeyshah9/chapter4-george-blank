package excercise_4_1;

import java.util.Scanner;

public class Example4_1 {
	public static void main(String[] args) {
		System.out.println("Enter The number:-");

		@SuppressWarnings("resource")
		// Getting value from command line argument
		Scanner s = new Scanner(System.in);

		// Exception handling for invalid entry like decimal or string
		try {
			int input = s.nextInt();
			
			//Creating conditions for input data
			
			if (input > 0) {
				// Calling Function
				double d = factorial(input);
				
				String sConverted = Double.toString(d);

				//This is for printing like integer.
				if (sConverted.length() < 9) {
					int jk = sConverted.length() - 2;
					String token = sConverted.substring(0, jk);
					System.out.println("The factorial of " + input + " = " + token);

				} else {
					System.out.println("The factorial of " + input + " = " + sConverted);
				}
			} else if (input == 0) {
				System.out.println("The factorial of " + input + " = 1");
			} else {
				System.out.println("Invalid Entry please give a valid integer number");
			}
		} catch (Exception e) {
			System.out.println(e + "  Invalid Entry please 132132give a valid integer number");
		}

	}

	// Method of factorial
	private static double factorial(int i) {
		// TODO Auto-generated method stub
		double k = 1;
		for (int j = i; j > 0; j--) {
			k *= j;

		}
		return k;
	}
}
/*
 * References
 * http://www.java2s.com/Code/Java/Language-Basics/Convertdoubletostring.htm
 */
