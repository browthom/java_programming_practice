package top;

import java.util.HashMap;
import java.util.Hashtable;

/*****************************************************************
 * This class provides methods that are solutions to programming
 * questions provided in this link:
 * https://javarevisited.blogspot.com/2011/06/top-programming-interview-questions.html
 *
 * @author Thomas Brown
 * @email browthom@mail.gvsu.edu
 * @date 4/23/2020
 * @version 4/25/2020
 *****************************************************************/
public class InterviewQuestions {

	/*****************************************************************
	 *
	 * @param args
	 *****************************************************************/
	public static void main(String[] args) {
//		System.out.println(InterviewQuestions.isPalindrome("test"));
//		System.out.println(InterviewQuestions.isPalindrome("12321"));
//		System.out.println(InterviewQuestions.isPalindrome("123321"));
//		System.out.println(InterviewQuestions.isPalindrome("123421"));
//		System.out.println(InterviewQuestions.removeChar("12345",'3'));
//		System.out.println(InterviewQuestions.recursive("abcd", 0));
//		System.out.println(InterviewQuestions.getLongestPalindrome("wasitaratisaw"));
//		System.out.println(InterviewQuestions.findNonRepeatedChar("1134"));
//		System.out.println(InterviewQuestions.getOccurrenceOfChar("test_5t", 't'));
//		System.out.println(InterviewQuestions.convertStringtoInt("12345"));
		int[] array = new int[] {1,2,2,3,4,5};
		System.out.println(InterviewQuestions.findDuplicate(array));
//		int[] array1 = new int[] {1,2,2,3,4,4,4,5,5,5};
//		InterviewQuestions.findDuplicates(array1);
		int[] array2 = new int[] {1,2,3,4,5};
		int[] array3 = new int[] {2,3,1,0,5};
		System.out.println(InterviewQuestions.findIntNotPresent(array2, array3));
	}

	/*****************************************************************/
	/************** String Manipulation Questions ********************/
	/*****************************************************************/

	/*****************************************************************
	 * A solution that satisfies the following programming problem:
	 * 1) Write code to check a String is palindrome or not?
	 *
	 * @param str the string that needs to be checked for a palindrome
	 * @return the boolean result of whether or not 'str' is a
	 * palindrome
	 *****************************************************************/
	public static boolean isPalindrome(String str) {

		// Set the indices to the first and last characters of string
		int first = 0;
		int last = str.length()-1;

		// Continually compare a set of chars in the string as follows:
		// -- Compare 1st Char to Last Char
		// -- Compare 2nd Char to 2nd to Last Char
		// -- etc.....
		// If a set of chars do not match then exit while-loop and then
		// return false. (No Palindrome)
		// If 'first' index becomes larger than 'last' index, then we
		// have reached the center of the String and determined this is
		// a palindrome
		while((str.charAt(first) == str.charAt(last))) {
			first++;
			last--;

			if (first >= last) {
				return true;
			}
		}

		return false;
	}

	/*****************************************************************
	 * A solution that satisfies the following programming problem:
	 * 2) Write a method which will remove any given character from a String?
	 *
	 * @param str the string that needs to be modified
	 * @param ch the character that needs to be removed from the string
	 * @return the string result after the character has been removed
	 *****************************************************************/
	public static String removeChar(String str, char ch) {

		// Takes the substrings before and after the character and recombines
		// them into a new string
		return (str.substring(0, str.indexOf(ch))
				+ str.substring(str.indexOf(ch)+1, str.length()));

	}

	/*****************************************************************
	 * A solution that satisfies the following programming problem:
	 *
	 * Needs work
	 * @param str
	 * @param num
	 * @return
	 *****************************************************************/
	public static String recursive(String str, int num) {

		int index = num;

		char[] array = str.toCharArray();

		while (index < str.length()) {

			// Swap characters
			char temp = array[index];
			array[index] = array[num];
			array[num] = temp;

			// Create new String
			String newString = new String(array);

			if (num+1 < str.length()-1)
				recursive(newString, num+1);

			index++;
			// Print new String
			System.out.println(newString);

		}

		return "";
	}

	/*****************************************************************
	 * A solution that satisfies the following programming problem:
	 * 4) Write a function to find out longest palindrome in a given
	 * string?
	 *
	 * @param str the string that needs to be checked for the longest
	 * palindrome
	 * @return the string of the longest palindrome inside 'str'
	 *****************************************************************/
	public static String getLongestPalindrome(String str) {

		char[] array = str.toCharArray();
		String longestPal = "";

		int largestSize = 0;

		// Iterate through each index
		for (int i = 0; i < str.length(); i++) {

			// Try two different types of scenarios:
			// -- Scenario (1): odd # length palindrome
			// -- Scenario (2): even # length palindrome
			for (int k = 0; k < 2; k++) {

				int beginIndex = 0, endIndex = 0;

				// Set search indices based on scenario
				if (k == 0) {
					beginIndex = i;
					endIndex = i;
				} else if (k == 1) {
					beginIndex = i;
					endIndex = i+1;
				}

				// Iteratively increase and decrease 'end' and 'begin' indices
				// to find largest palindrome from the center index 'i'
				while (beginIndex >= 0 && endIndex < str.length()) {

					// If both chars are equal, then the substring is
					// still a palindrome
					if (array[beginIndex] == array[endIndex]) {

						// If this beats the previous recorded length
						// then update longest palindrome string
						if (largestSize < (endIndex-beginIndex)+1) {

							longestPal = str.substring(beginIndex, endIndex+1);
							largestSize = (endIndex-beginIndex)+1;
						}

					// break loop once palindrome has ended
					} else {
						break;
					}

					beginIndex--;
					endIndex++;
				}
			}
		}

		return longestPal;
	}

	/*****************************************************************
	 * A solution that satisfies the following programming problem:
	 * 5) How to find the first non repeated character of a given
	 * String?
	 *
	 * @param str the string that needs to be checked for first
	 * non-repeated character.
	 * @return the first non-repeated character of 'str'
	 *****************************************************************/
	public static char findNonRepeatedChar(String str) {

		for (int i = 0; i < str.length(); i++) {

			for (int j = 0; j < str.length(); j++) {

				if (str.charAt(i) == str.charAt(j) && i != j) {
					break;
				}

				if (i != j && j == str.length()-1) {
					return str.charAt(i);
				}
			}
		}

		return ' ';
	}

	/*****************************************************************
	 * A solution that satisfies the following programming problem:
	 * 6) How to count the occurrence of a given character in a
	 * String?
	 *
	 * @param str the string that needs be checked for character
	 * occurrence count
	 * @return the number of occurrences of 'ch' in 'str'
	 *****************************************************************/
	public static int getOccurrenceOfChar(String str, char ch) {

		// This String 'str' doesn't necessarily need to be converted
		// to a character array. 'str.charAt(i)' could have been used.
		char[] array = str.toCharArray();
		int occurrences = 0;
		int i = 0;

		// Iterate through and count the occurrences of 'ch'
		while (i < str.length()) {
			// Could have also used str.charAt()
			if (array[i] == ch) {
				occurrences++;
			}
			i++;
		}

		return occurrences;
	}

	/*****************************************************************
	 * A solution that satisfies the following programming problem:
	 * 8) How to convert numeric String to int in Java?
	 * - Other possible solutions that involve methods provided by the
	 *   Java API:
	 * 		- 'Integer.parseInt(String)' method.
	 * 		- 'Integer.valueOf(String)' method
	 * 			 - Will return integer representation of String
	 * 		       while removing any leading zeros
	 *
	 * @param str the string that needs to be converted to an integer
	 * @return the integer conversion of 'str'
	 *****************************************************************/
	public static int convertStringtoInt(String str) {

		// Convert 'str' to character array
		char[] array = str.toCharArray();

		int number = 0;

		// Iterate through character array
		for (int i = 0; i < str.length(); i++) {

			// Ensure char can actually be converted to an integer
			// - Based on ASCII Table
			if (array[i] >= 48 && array[i] < 57) {

				// Number conversion based on ASCII character representation
				number += ( (array[i] - 48) * Math.pow(10, str.length()-1-i) );

			} else {
				return -1;
			}
		}

		return number;
	}

	/*****************************************************************
	 * A solution that satisfies the following programming problem:
	 * 10) In an array 1-100 exactly one number is duplicate how do
	 * you find it?
	 *
	 * @param array an integer array that needs to be checked for a
	 * duplicate
	 *****************************************************************/
	public static int findDuplicate(int[] array) {

		// Create Hashmap
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		int i = 0;

		// Iterate through int array and place each int in the HashMap.
		// Before placing the next int array element in the HashMap,
		// check to see if the same int was already put in the HashMap.
		while (i < array.length) {

			Integer temp = new Integer(array[i]);

			// See if number already exists, then return number
			if (map.containsKey(temp)) {
				return (int) temp;
			}

			map.put(temp, 1);

			i++;
		}

		// If no duplicate was found
		return -1;
	}

	/*****************************************************************
	 * A solution that satisfies the following programming problem:
	 * 11) In an array 1-100 multiple numbers are duplicates, how do
	 * you find it?
	 *
	 * @param array an integer array that needs to be checked for any
	 * and all duplicates
	 *****************************************************************/
	public static void findDuplicates(int[] array) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		int i = 0;

		// Initial iteration through array O(n)
		while (i < array.length) {

			Integer temp = new Integer(array[i]);

			// See if number doesn't exist, then add it
			if (!map.containsKey(temp)) {
				map.put(temp, 1);

			// See if number already exists, then increment the occurrence
			} else if (map.containsKey(temp)) {
				map.put(temp, ((int) map.get(temp))+1);
			}

			i++;
		}

		// O(n)
		// Iterate through a 'Set' whose elements are of
		// type 'Entry' (key/value pairs of a map).
		// 'map.entrySet()' will return a 'Set' view of all the
		// entries accumulated in the HashMap 'map'.
		//
		// Code based on for-each loop from this link:
		// https://www.geeksforgeeks.org/iterate-map-java/
		for (HashMap.Entry<Integer, Integer> m : map.entrySet()) {
			// If number of occurrences is greater than 1
			if (m.getValue() > 1) {
				System.out.println("Integer: " + m.getKey() +
						", Number of Occurrences: " + m.getValue());
			}
		}
	}

	/*****************************************************************
	 * A solution that satisfies the following programming problem:
	 * 12) Given two arrays, 1,2,3,4,5 and 2,3,1,0,5 find which number
	 * is not present in the second array.
	 *
	 * @param array1 int array that contains values that will be
	 * checked for existence in 'array2'
	 * @param array2 int array whose contents will be examined for the
	 * existence of values contained in 'array1'
	 * @return the first value that does not exist in 'array2' but
	 * exists in 'array1'
	 *****************************************************************/
	public static int findIntNotPresent(int[] array1, int[] array2) {

		// Create Hashtable
		Hashtable<Integer, Integer> table2 = new Hashtable<Integer, Integer>();

		// Place all integer contents of array2 in Hashtable
		for (int i = 0; i < array2.length; i++) {
			table2.put(array2[i], 1);
		}

		// Iterate through 'array1'; Find first instance where an
		// integer exists in array1 but not in array2 using the
		// previously created Hashtable
		for (int i = 0; i < array1.length; i++) {
			if (!table2.containsKey(array1[i])) {
				return array1[i];
			}
		}

		// If no value was found
		return -1;
	}

	/*****************************************************************
	 * A solution that satisfies the following programming problem:
	 * 13) How do you find the second highest number in an integer array?
	 *
	 * @param array
	 * @return
	 *****************************************************************/
	public static int getSecondHighestNumber(int[] array) {
		return -1;
	}

	/*****************************************************************
	 * A solution that satisfies the following programming problem:
	 * 14) How to find all pairs in an array of integers whose sum is equal to the given number?
	 *
	 * @param array
	 * @return
	 *****************************************************************/
	public static void getIntPairs(int[] array) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	}

	/*****************************************************************
	 * A solution that satisfies the following programming problem:
	 * 15) How to remove duplicate elements from the array in Java?
	 *
	 * @param array
	 * @return
	 *****************************************************************/
	public static int[] removeDuplicates(int[] array) {

		return (new int[5]);
	}

	/*****************************************************************
	 * A solution that satisfies the following programming problem:
	 * 16) How to find the largest and smallest number in an array?
	 *
	 * @param array
	 * @return
	 *****************************************************************/
	public static void findSmallestAndLargestNumber(int[] array) {

	}

	/*****************************************************************
	 * A solution that satisfies the following programming problem:
	 * 17) How to find the top two maximum number in an array?
	 *
	 * @param array
	 * @return
	 *****************************************************************/
	public static void findTwoHighestNumbers(int[] array) {

	}

}
