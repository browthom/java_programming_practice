package top;

public class String3 {
	
	/**
	 * https://codingbat.com/prob/p199171
	 * Given a string, count the number of words ending in 'y' or 'z' -- 
	 * so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' 
	 * in "yellow" (not case sensitive). We'll say that a y or z is at 
	 * the end of a word if there is not an alphabetic letter immediately 
	 * following it. (Note: Character.isLetter(char) tests if a char is 
	 * an alphabetic letter.)
	 * @param str
	 * @return
	 */
	public int countYZ(String str) {
	  int count = 0;
	  
	  for (int i = 0; i < str.length(); i++) {
	    if (str.substring(i, i+1).toLowerCase().equals("y") || 
	        str.substring(i, i+1).toLowerCase().equals("z")) {
	      if (i+1 < str.length()) {
	        if (!Character.isLetter(str.charAt(i+1))) {
	          count++;
	        }
	      } else {
	        count++;
	      }
	    }
	  }
	  
	  return count;
	}
	
	/**
	 * https://codingbat.com/prob/p192570
	 * Given two strings, base and remove, return a version 
	 * of the base string where all instances of the remove 
	 * string have been removed (not case sensitive). 
	 * You may assume that the remove string is length 1 or more. 
	 * Remove only non-overlapping instances, so with "xxx" 
	 * removing "xx" leaves "x".
	 * @param base
	 * @param remove
	 * @return
	 */
	public String withoutString(String base, String remove) {
	  String newStr = "";
	  int i = 0; 
	  
	  // Iterate through
	  while (i < base.length()) {
	    
	    // If 'remove' string can fit in the substring
	    if (i+remove.length()-1 < base.length()) {
	      // if 'remove' string equals the substring
	      // ignore and increment over substring
	      if (base.substring(i, i+remove.length()).toLowerCase()
	              .equals(remove.toLowerCase())) {
	        i += remove.length();
	      // Add char to newStr
	      } else {
	        newStr += base.substring(i, i+1);
	        i++;
	      }
	    // Add remaining chars to newStr
	    } else {
	      newStr += base.substring(i, i+1);
	      i++;
	    }
	  }
	  
	  return newStr;
	}
	
	/**
	 * https://codingbat.com/prob/p141736
	 * Given a string, return true if the number of appearances of "is" 
	 * anywhere in the string is equal to the number of appearances of 
	 * "not" anywhere in the string (case sensitive).
	 * @param str
	 * @return
	 */
	public boolean equalIsNot(String str) {
	  int countIs = 0;
	  int countNot = 0;
	  
	  for (int i = 0; i < str.length(); i++) {
	    if (i+1 < str.length()) {
	      if (str.substring(i,i+2).equals("is")) {
	        countIs++;
	      }
	    }
	    
	    if (i+2 < str.length()) {
	      if (str.substring(i,i+3).equals("not")) {
	        countNot++;
	      }
	    }
	  }
	  
	  return (countNot == countIs);
	}
	
	/**
	 * https://codingbat.com/prob/p198664
	 * We'll say that a lowercase 'g' in a string is "happy" 
	 * if there is another 'g' immediately to its left or right. 
	 * Return true if all the g's in the given string are happy.
	 * @param str
	 * @return
	 */
	public boolean gHappy(String str) {
	  boolean happy = true;
	  
	  // Iterate through
	  for (int i = 0; i < str.length(); i++) {
	    
	    // If index has char == 'g'
	    if (str.charAt(i) == 'g') {
	      // Assert an unhappy state until we find a 'g' next to current index
	      happy = false;
	      
	      // Determine if we are happy
	      if (i-1 >= 0 && str.charAt(i) == 'g') {
	        if (str.charAt(i-1) == 'g') {
	          happy = true;
	        }
	      }
	            
	      // Determine if we are happy
	      if (i+1 < str.length() && str.charAt(i) == 'g') {
	        if (str.charAt(i+1) == 'g') {
	          happy = true;
	        }
	      }
	    }
	    
	    if (!happy) {
	      return false;
	    }
	  }
	  
	  return true;
	}
	
	/**
	 * https://codingbat.com/prob/p195714
	 * We'll say that a "triple" in a string is a char appearing 
	 * three times in a row. Return the number of triples in the 
	 * given string. The triples may overlap.
	 * @param str
	 * @return
	 */
	public int countTriple(String str) {
	  int triple = 0;
	  
	  for (int i = 0; i+2 < str.length(); i++) {
	    if (str.charAt(i) == str.charAt(i+1) &&
	        str.charAt(i+1) == str.charAt(i+2)) {
	      triple++;
	    }
	  }
	  
	  return triple;
	}

	/**
	 * https://codingbat.com/prob/p197890
	 * Given a string, return the sum of the digits 0-9 that 
	 * appear in the string, ignoring all other characters. 
	 * Return 0 if there are no digits in the string. 
	 * (Note: Character.isDigit(char) tests if a char is one 
	 * of the chars '0', '1', .. '9'. Integer.parseInt(string) 
	 * converts a string to an int.)
	 * @param str
	 * @return
	 */
	public int sumDigits(String str) {
	  int sum = 0;
	  
	  for (int i = 0; i < str.length(); i++) {
	    if (Character.isDigit(str.charAt(i))) {
	      sum += Integer.parseInt(str.substring(i,i+1));
	    }
	  }
	  
	  return sum;
	}
	
	/**
	 * https://codingbat.com/prob/p131516
	 * Given a string, return the longest substring that appears at 
	 * both the beginning and end of the string without overlapping. 
	 * For example, sameEnds("abXab") is "ab".
	 * @param string
	 * @return
	 */
	public String sameEnds(String string) {
		  
	  // Starting positions
	  int i = string.length() / 2;
	  int j = (string.length() % 2 == 0) ? (string.length() / 2) : (string.length() / 2 + 1);

	  // Start by looking at longest string on either side (str.length()/2 == size)
	  // If the strings don't equal, then inc/dec indices and compare strings again
	  // Continue doing this until you find them equal, or return "" if nothing
	  // equal is found
	  while (!(string.substring(0, i).equals(
	           string.substring(j, string.length())))) {
	             
	    
	    if (i > 0 && j < string.length()) {
	      i--;
	      j++;
	    }
	  }
	  
	  return string.substring(0,i);
	}

	/**
	 * https://codingbat.com/prob/p139411
	 * Given a string, look for a mirror image (backwards) string at both 
	 * the beginning and end of the given string. In other words, zero or 
	 * more characters at the very begining of the given string, and at 
	 * the very end of the string in reverse order (possibly overlapping). 
	 * For example, the string "abXYZba" has the mirror end "ab".
	 * @param string
	 * @return
	 */
	public String mirrorEnds(String string) {
	  String newStr = "";
	  
	  for (int i = 0; i < string.length(); i++) {
	    if (string.charAt(i) == string.charAt(string.length()-1-i)) {
	      newStr += string.substring(i, i+1);
	    } else {
	      break;
	    }
	  }
	  
	  return newStr;
	}

	/**
	 * https://codingbat.com/prob/p179479
	 * Given a string, return the length of the largest 
	 * "block" in the string. A block is a run of adjacent 
	 * chars that are the same.
	 * @param str
	 * @return
	 */
	public int maxBlock(String str) {
	  int max = 0, tempMax = 0;
	  char prev = ' ';
	  
	  if (!str.equals("")) {
	    max = 1;
	    tempMax = 1;
	    prev = str.charAt(0);
	  }
	  
	  for (int i = 1; i < str.length(); i++) {
	    if (prev == str.charAt(i)) {
	      tempMax++;
	    } else {
	      tempMax = 1;
	    }
	    
	    if (tempMax > max) {
	      max = tempMax;
	    }
	    
	    prev = str.charAt(i);
	  }
	  
	  return max;
	}
	
	/**
	 * https://codingbat.com/prob/p121193
	 * Given a string, return the sum of the numbers appearing in 
	 * the string, ignoring all other characters. A number is a series 
	 * of 1 or more digit chars in a row. (Note: Character.isDigit(char) 
	 * tests if a char is one of the chars '0', '1', .. '9'. 
	 * Integer.parseInt(string) converts a string to an int.)
	 * @param str
	 * @return
	 */
	public int sumNumbers(String str) {
	  int sum = 0;
	  int tempNum = 0;
	  
	  for (int i = 0; i < str.length(); i++) {
	    if (Character.isDigit(str.charAt(i))) {
	      tempNum = (tempNum*10) + Integer.parseInt(str.substring(i,i+1));
	      // For the case when i+1 == str.length()
	      if (i+1 == str.length()) {
	        sum += tempNum;
	      }
	    } else {
	      sum += tempNum;
	      tempNum = 0;
	    }
	  }
	  
	  return sum;
	}
}
