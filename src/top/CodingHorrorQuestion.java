package top;

/*****************************************************************
 * A solution to the FizzBuzz coding problem as outlined in the
 * following links:
 *
 * https://blog.codinghorror.com/why-cant-programmers-program/
 * https://imranontech.com/2007/01/24/using-fizzbuzz-to-find-developers-who-grok-coding/
 *
 * @author Thomas Brown
 * @email browthom@mail.gvsu.edu
 * @date 4/24/2020
 * @version 4/25/2020
 *****************************************************************/
public class CodingHorrorQuestion {

	/*****************************************************************
	 *
	 * @param args
	 *****************************************************************/
	public static void main(String[] args) {
		CodingHorrorQuestion.printFizzBuzz();
	}

	/*****************************************************************
	 * Print each number from 1 to 100 except for numbers that are
	 * multiples of 3 and 5. Print "Fizz" for numbers that are multiples
	 * of 3, print "Buzz" for numbers that are multiples of 5, and print
	 * "FizzBuzz" for numbers that are multiples of both 3 and 5 (15).
	 *****************************************************************/
	public static void printFizzBuzz() {

		// Increment through number 1-100
		for (int i = 1; i <= 100; i++) {

			// Using modulo to determine if the number does not
			// provide a remainder when divided by 3 or 5,
			// i.e. if the number is a multiple of 3 or 5

			// A multiple of 3
			if (i % 3 == 0 && i % 5 != 0) {
				System.out.println("Fizz");
			// A multiple of 5
			} else if (i % 3 != 0 && i % 5 == 0) {
				System.out.println("Buzz");
			// A multiple of 3 and 5 (multiple of 15)
			} else if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			// A multiple of neither 3 nor 5
			} else {
				System.out.println(i);
			}
		}
	}
}
