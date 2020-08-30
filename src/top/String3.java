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

}
