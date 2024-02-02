package top;
import java.util.*;

public class AP1 {
	
	
	
	/**
	 * https://codingbat.com/prob/p146974
	 * Given an array of scores, return true if each score 
	 * is equal or greater than the one before. The array 
	 * will be length 2 or more.
	 * @param scores
	 * @return
	 */
	public boolean scoresIncreasing(int[] scores) {
		  
		for (int i = 0; i < scores.length; i++) {
			if (i > 0) {
				if (!(scores[i-1] <= scores[i])) {
					return false;
				}
			}
		}
	  
		return true;
	}
	
	/**
	 * https://codingbat.com/prob/p123837
	 * Given an array of scores, compute the int average of 
	 * the first half and the second half, and return whichever 
	 * is larger. We'll say that the second half begins at 
	 * index length/2. The array length will be at least 2. 
	 * To practice decomposition, write a separate helper 
	 * method int average(int[] scores, int start, int end) 
	 * { which computes the average of the elements between 
	 * indexes start..end. Call your helper method twice to 
	 * implement scoresAverage(). Write your helper method 
	 * after your scoresAverage() method in the JavaBat text 
	 * area. Normally you would compute averages with doubles, 
	 * but here we use ints so the expected results are exact.
	 * @param scores
	 * @return
	 */
	public int scoresAverage(int[] scores) {
		int aveFirst = average(scores, 0, scores.length / 2);
		int aveSecond = average(scores, scores.length / 2, scores.length);
	  
		return (aveFirst > aveSecond) ? (aveFirst) : (aveSecond);
	}
	
	private int average(int[] scores, int start, int end) {
		int sum = 0;
		for (int i = start; i < end; i++) {
			sum += scores[i];
		}
		  
		return sum / (end - start);
	}	
	
	/**
	 * https://codingbat.com/prob/p183407
	 * Given an array of strings, return a new List 
	 * (e.g. an ArrayList) where all the strings of 
	 * the given length are omitted. See wordsWithout() 
	 * below which is more difficult because it uses arrays.
	 * @param words
	 * @param len
	 * @return
	 */
	public List wordsWithoutList(String[] words, int len) {
		ArrayList<String> newWords = new ArrayList<String>();
 
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() != len) {
				newWords.add(words[i]);
			}
		}
  
		return newWords;  
	}
	
	/**
	 * https://codingbat.com/prob/p134174
	 * Given an array of positive ints, return a new array 
	 * of length "count" containing the first even numbers 
	 * from the original array. The original array will 
	 * contain at least "count" even numbers.
	 * @param nums
	 * @param count
	 * @return
	 */
	public int[] copyEvens(int[] nums, int count) {
		int[] evens = new int[count];
		int j = 0;
	  
		for (int i = 0; i < nums.length && j < count; i++) {
			if (nums[i] % 2 == 0) {
				evens[j] = nums[i];
				j++;
			}
		}
	  
		return evens;
	}

}
