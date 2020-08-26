package top;

public class String2 {
	
	/**
	 * https://codingbat.com/prob/p165312
	 * Given a string, return a string where for every char 
	 * in the original, there are two chars.
	 * @param str
	 * @return
	 */
	public String doubleChar(String str) {
	  String newString = "";
	  
	  for (int i = 0; i < str.length(); i++) {
	    newString += str.substring(i,i+1) + str.substring(i,i+1);
	  }
	  
	  return newString;
	}
	
	/**
	 * https://codingbat.com/prob/p147448
	 * Return the number of times that the string "hi" 
	 * appears anywhere in the given string.
	 * @param str
	 * @return
	 */
	public int countHi(String str) {
	    int count = 0;
	    
	    for (int i = 0; i+1 < str.length(); i++) {
	      if (str.substring(i,i+2).equals("hi")) {
	        count++;
	      }
	    }
	    
	    return count;
	}
	
	/**
	 * https://codingbat.com/prob/p111624
	 * Return true if the string "cat" and "dog" appear 
	 * the same number of times in the given string.
	 * @param str
	 * @return
	 */
	public boolean catDog(String str) {
	  int countCat = 0, countDog = 0;
	  
	  for (int i = 0; i+2 < str.length(); i++) {
	    if (str.substring(i,i+3).equals("cat")) {
	      countCat++;
	    }
	    
	    if (str.substring(i,i+3).equals("dog")) {
	      countDog++;
	    }
	  }
	  
	  if (countCat == countDog) {
	    return true;
	  } else {
	    return false;
	  }
	}
	
	/**
	 * https://codingbat.com/prob/p123614
	 * Return the number of times that the string "code" 
	 * appears anywhere in the given string, except we'll 
	 * accept any letter for the 'd', so "cope" and "cooe" count.
	 * @param str
	 * @return
	 */
	public int countCode(String str) {
	  int count = 0;
	  
	  for (int i = 0; i+3 < str.length(); i++) {
	    if (str.substring(i,i+2).equals("co") &&
	        str.charAt(i+3) == 'e') {
	          count++;
	        }
	  }
	  
	  return count;
	}
	
	/**
	 * https://codingbat.com/prob/p126880
	 * Given two strings, return true if either of the strings 
	 * appears at the very end of the other string, ignoring 
	 * upper/lower case differences (in other words, the 
	 * computation should not be "case sensitive"). 
	 * Note: str.toLowerCase() returns the lowercase version 
	 * of a string.
	 * @param a
	 * @param b
	 * @return
	 */
	public boolean endOther(String a, String b) {
	  // Find smaller string
	  String sm = ((a.length() <= b.length()) ? a : b).toLowerCase();
	  // Find larger string
	  String la = ((a.length() > b.length()) ? a : b).toLowerCase();
	  
	  // Compare the two strings
	  return (la.substring(la.length()-sm.length(), la.length()).equals(sm));
	}
	
	/**
	 * https://codingbat.com/prob/p136594
	 * Return true if the given string contains an appearance 
	 * of "xyz" where the xyz is not directly preceeded by a 
	 * period (.). So "xxyz" counts but "x.xyz" does not.
	 * @param str
	 * @return
	 */
	public boolean xyzThere(String str) {
	  if (str.length() >= 3) {
	    if (str.substring(0,3).equals("xyz")) {
	      return true;
	    }
	  }
	    
	  if (str.length() >= 4) {
	    for (int i = 0; i+3 < str.length(); i++) {
	      if (str.charAt(i) != '.' && str.substring(i+1,i+4).equals("xyz")) {
	        return true;
	      }
	    }
	  }
	    
	  return false;
	}
	
	/**
	 * https://codingbat.com/prob/p175762
	 * Return true if the given string contains a "bob" string, 
	 * but where the middle 'o' char can be any char.
	 * @param str
	 * @return
	 */
	public boolean bobThere(String str) {
		   
	   for (int i = 0; i+2 < str.length(); i++) {
	     if (str.charAt(i) == 'b' && str.charAt(i+2) == 'b') {
	       return true;
	     }
	   }
	   
	   return false;
	}

}
