package top;

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
	  for (int i = 0; i+1 < scores.length; i++) {
	    if (!(scores[i] <= scores[i+1])) {
	      return false;
	    }
	  }
	  
	  return true;
	}
}
