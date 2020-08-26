package top;

public class Warmup2 {
	
	/**
	 * https://codingbat.com/prob/p142270
	 * Given a string and a non-negative int n, 
	 * return a larger string that is n copies of 
	 * the original string.
	 * @param str
	 * @param n
	 * @return
	 */
	public String stringTimes(String str, int n) {
	  String newString = "";
	  
	  for (int i = 0; i < n; i++) {
	    newString += str;
	  }
	  
	  return newString;
	}
	
	/**
	 * https://codingbat.com/prob/p186759
	 * Given a string, return true if the first 
	 * instance of "x" in the string is immediately 
	 * followed by another "x".
	 * @param str
	 * @return
	 */
	public boolean doubleX(String str) {
		  
	  for (int i = 0; i+1 < str.length(); i++) {
	    
	    if (str.charAt(i) == 'x') {
	      if (str.charAt(i+1) == 'x') {
	        return true;
	      } else {
	        return false;
	      }
	    }
	  }
	  
	  return false;
	}
	
	/**
	 * https://codingbat.com/prob/p178318
	 * Given a string, return the count of the number of 
	 * times that a substring length 2 appears in the string 
	 * and also as the last 2 chars of the string, so 
	 * "hixxxhi" yields 1 (we won't count the end substring).
	 * @param str
	 * @return
	 */
	public int last2(String str) {
	  int count = 0;
	  
	  if (str.length() >= 4) {
	    String temp = str.substring(str.length()-2,str.length());
	      
	    for (int i = 0; i < str.length()-2; i++) {
	      if (str.substring(i,i+2).equals(temp)) {
	        count++;
	      }
	    }
	    
	    return count;
	  } else {
	    return 0;
	  }
	}
	
	/**
	 * https://codingbat.com/prob/p136041
	 * Given an array of ints, return true if the sequence 
	 * of numbers 1, 2, 3 appears in the array somewhere.
	 * @param nums
	 * @return
	 */
	public boolean array123(int[] nums) {
	  if (nums.length >= 3) {
	    for (int i = 0; i+2 < nums.length; i++) {
	      
	      if (nums[i] == 1 &&
	          nums[i+1] == 2 &&
	          nums[i+2] == 3) {
	            return true;
	          }
	    }
	    
	    return false;
	  } else {
	    return false;
	  }
	}
	
	/**
	 * https://codingbat.com/prob/p121596
	 * Given a string, return a string made of the chars 
	 * at indexes 0,1, 4,5, 8,9 ... so "kittens" yields 
	 * "kien".
	 * @param str
	 * @return
	 */
	public String altPairs(String str) {
	  String newString = "";
	  
	  for (int i = 0; i < str.length(); i+=4) {
	      
	      newString += str.charAt(i) + "";
	      
	      // There may be a situation where
	      // the 2nd char in a pair might not be
	      // included in the return string
	      if (i+1 < str.length()) {
	        newString += str.charAt(i+1) + "";
	      }
	  }
	  
	  return newString;
	}
	
	/**
	 * https://codingbat.com/prob/p170221
	 * Given an array of ints, we'll say that a triple is 
	 * a value appearing 3 times in a row in the array. 
	 * Return true if the array does not contain any 
	 * triples.
	 * @param nums
	 * @return
	 */
	public boolean noTriples(int[] nums) {
	  for (int i = 0; i+2 < nums.length; i++) {
	    if (nums[i] == nums[i+1] && nums[i+1] == nums[i+2]) {
	      return false;
	    }
	  }
	  
	  return true;
	}
	
	/**
	 * https://codingbat.com/prob/p101475
	 * Given a string and a non-negative int n, we'll say 
	 * that the front of the string is the first 3 chars, 
	 * or whatever is there if the string is less than 
	 * length 3. Return n copies of the front;
	 * @param str
	 * @param n
	 * @return
	 */
	public String frontTimes(String str, int n) {
	  String newString = "";
	  
	  int frontSize = (str.length() >= 3) ? (3) : str.length();
	    
	  for (int i = 0; i < n; i++) {
	    newString += str.substring(0,frontSize);
	  }
	    
	  return newString;
	}
	
	/**
	 * https://codingbat.com/prob/p165666
	 * Given a string, return a new string made of every 
	 * other char starting with the first, so "Hello" yields 
	 * "Hlo".
	 * @param str
	 * @return
	 */
	public String stringBits(String str) {
	  String newString = "";
	  
	  for (int i = 0; i < str.length(); i+=2) {
	    newString += str.charAt(i) + "";
	  }
	  
	  return newString;
	}
	
	/**
	 * https://codingbat.com/prob/p184031
	 * Given an array of ints, return the number of 9's in the array.
	 * @param nums
	 * @return
	 */
	public int arrayCount9(int[] nums) {
	  int count = 0;
	  for (int i = 0; i < nums.length; i++) {
	    if (nums[i] == 9) {
	      count++;
	    }
	  }
	  
	  return count;
	}

	/**
	 * https://codingbat.com/prob/p198640
	 * Given 2 strings, a and b, return the number of the 
	 * positions where they contain the same length 2 
	 * substring. So "xxcaazz" and "xxbaaz" yields 3, 
	 * since the "xx", "aa", and "az" substrings appear 
	 * in the same place in both strings.
	 * @param a
	 * @param b
	 * @return
	 */
	public int stringMatch(String a, String b) {
	  int count = 0;
	  
	  int size = (a.length() < b.length()) ? a.length() : b.length();
	  
	  for (int i = 0; i+1 < size; i++) {
	    if (a.substring(i,i+2).equals(b.substring(i,i+2))) {
	      count++;
	    }
	  }
	  
	  return count;
	}
	
	/**
	 * https://codingbat.com/prob/p126212
	 * Suppose the string "yak" is unlucky. Given a string, 
	 * return a version where all the "yak" are removed, 
	 * but the "a" can be any char. The "yak" strings will 
	 * not overlap.
	 * @param str
	 * @return
	 */
	public String stringYak(String str) {
		  
	  // Iterate through and check all instances of 'y_k' where '_'
	  // is any character.
	  for (int i = 0; i+2 < str.length(); i++) {
	    
	    // If instance of 'y_k' was found, then remove it
	    if (str.charAt(i) == 'y' && str.charAt(i+2) == 'k') {
	      
	      // If other chars exist in this string besides 'y_k',
	      // then remove 'y_k' and keep surrounding chars
	      // Do this by overriding 'str'.
	      if (str.length() >= 4) {
	        str = str.substring(0,i) + str.substring(i+3,str.length());
	      // Essentially if 'y_k' are then only characters left,
	      // then erase string
	      } else {
	        str = "";
	      }
	    }
	  }
	  
	  return str;
	}
	
	/**
	 * https://codingbat.com/prob/p167430
	 * Given an array of ints, return true if it contains 
	 * a 2, 7, 1 pattern: a value, followed by the value 
	 * plus 5, followed by the value minus 1. Additionally 
	 * the 271 counts even if the "1" differs by 2 or less 
	 * from the correct value.
	 * @param nums
	 * @return
	 */
	public boolean has271(int[] nums) {
	  for (int i = 0; i+2 < nums.length; i++) {
	    if (nums[i] + 5 == nums[i+1] &&
	        (nums[i] - 3 <= nums[i+2] && nums[i] + 1 >= nums[i+2])) {
	          return true;
	        }
	  }
	  
	  return false;
	}
	
	/**
	 * https://codingbat.com/prob/p194667
	 * Count the number of "xx" in the given string. 
	 * We'll say that overlapping is allowed, so "xxx" 
	 * contains 2 "xx".
	 * @param str
	 * @return
	 */
	public int countXX(String str) {
		  
	  int count = 0;
	  
	  for (int i = 0; i+1 < str.length(); i++) {
	    if (str.substring(i,i+2).equals("xx")) {
	      count++;
	    }
	  }
	  
	  return count;
	}
	
	/**
	 * https://codingbat.com/prob/p117334
	 * Given a non-empty string like "Code" return a string like "CCoCodCode".
	 * @param str
	 * @return
	 */
	public String stringSplosion(String str) {
	  String newString = "";
	  for (int i = 1; i <= str.length(); i++) {
	    newString += str.substring(0,i);
	  }
	  
	  return newString;
	}
	
	/**
	 * https://codingbat.com/prob/p186031
	 * Given an array of ints, return true if one of 
	 * the first 4 elements in the array is a 9. The 
	 * array length may be less than 4.
	 * @param nums
	 * @return
	 */
	public boolean arrayFront9(int[] nums) {
	  for (int i = 0; (i < 4) && i < nums.length; i++) {
	    if (nums[i] == 9) {
	      return true;
	    }
	  }
	  
	  return false;
	}
	
	/**
	 * https://codingbat.com/prob/p171260
	 * Given a string, return a version where all the 
	 * "x" have been removed. Except an "x" at the very
	 * start or end should not be removed.
	 * @param str
	 * @return
	 */
	public String stringX(String str) {
		  
	  for (int i = 1; i < str.length()-1; i++) {
	    if (str.charAt(i) == 'x') {
	      str = str.substring(0,i) + str.substring(i+1,str.length());
	      // Decrement to take into account removed character
	      i--;
	    }
	  }
	  
	  return str;
	}
	
	/**
	 * https://codingbat.com/prob/p110019
	 * Given an array of ints, return the number of times 
	 * that two 6's are next to each other in the array. 
	 * Also count instances where the second "6" is actually 
	 * a 7.
	 * @param nums
	 * @return
	 */
	public int array667(int[] nums) {
	  int count =  0;
	  
	  for (int i = 0; i+1 < nums.length; i++) {
	    if ((nums[i] == 6 && nums[i+1] == 6) ||
	        (nums[i] == 6 && nums[i+1] == 7)) {
	      count++;
	    }  
	  }
	  
	  return count;
	}
}
