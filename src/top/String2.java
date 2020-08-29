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
	
	/**
	 * https://codingbat.com/prob/p134250
	 * We'll say that a String is xy-balanced if for all the 'x' 
	 * chars in the string, there exists a 'y' char somewhere later 
	 * in the string. So "xxy" is balanced, but "xyx" is not. 
	 * One 'y' can balance multiple 'x's. Return true if the given 
	 * string is xy-balanced.
	 * @param str
	 * @return
	 */
	public boolean xyBalance(String str) {
	  int xIndex = -1, yIndex = -1;
	  
	  for (int i = 0; i < str.length(); i++) {
	    if (str.charAt(i) == 'x') {
	      xIndex = i;
	    } else if (str.charAt(i) == 'y') {
	      yIndex = i;
	    }
	  }
	  
	  return (yIndex >= xIndex);
	}

	/**
	 * https://codingbat.com/prob/p125185
	 * Given two strings, a and b, create a bigger string made of the 
	 * first char of a, the first char of b, the second char of a, 
	 * the second char of b, and so on. Any leftover chars go at the 
	 * end of the result.
	 * @param a
	 * @param b
	 * @return
	 */
	public String mixString(String a, String b) {
	  int size = (a.length() < b.length()) ? a.length() : b.length();
	  String longerString = (a.length() > b.length()) ? a : b;
	  
	  String str = "";
	  int i = 0;
	  
	  for (i = 0; i < size; i++) {
	     str += a.substring(i,i+1) + b.substring(i,i+1);
	  }
	  
	  str += longerString.substring(i,longerString.length());
	  
	  return str;
	}
	
	/**
	 * https://codingbat.com/prob/p152339
	 * Given a string and an int n, return a string made of n 
	 * repetitions of the last n characters of the string. 
	 * You may assume that n is between 0 and the length of 
	 * the string, inclusive.
	 * @param str
	 * @param n
	 * @return
	 */
	public String repeatEnd(String str, int n) {
	  String newStr = "";
	  for (int i = 0; i < n; i++) {
	    newStr += str.substring(str.length()-n, str.length());
	  }
	  
	  return newStr;
	}
	
	/**
	 * https://codingbat.com/prob/p128796
	 * Given a string and an int n, return a string made of the 
	 * first n characters of the string, followed by the first 
	 * n-1 characters of the string, and so on. You may assume 
	 * that n is between 0 and the length of the string, 
	 * inclusive (i.e. n >= 0 and n <= str.length()).
	 * @param str
	 * @param n
	 * @return
	 */
	public String repeatFront(String str, int n) {
	  String newStr = "";
	  
	  for (int i = 0; i < n; i++) {
	    newStr += str.substring(0,n-i);
	  }
	  
	  return newStr;
	}
	
	/**
	 * https://codingbat.com/prob/p109637
	 * Given two strings, word and a separator sep, return a 
	 * big string made of count occurrences of the word, 
	 * separated by the separator string.
	 * @param word
	 * @param sep
	 * @param count
	 * @return
	 */
	public String repeatSeparator(String word, String sep, int count) {
	  String newStr = "";
	  
	  for (int i = 0; i < count; i++) {
	    if (i+1 < count) {
	      newStr += word + sep;
	    } else {
	      newStr += word;
	    }
	  }
	  
	  return newStr;
	}
	
	/**
	 * https://codingbat.com/prob/p136417
	 * Given a string, consider the prefix string made of the first 
	 * N chars of the string. Does that prefix string appear somewhere 
	 * else in the string? Assume that the string is not empty and 
	 * that N is in the range 1..str.length().
	 * @param str
	 * @param n
	 * @return
	 */
	public boolean prefixAgain(String str, int n) {
		  
	  for (int i = n; (i+n)-1 < str.length(); i++) {
	    if (str.substring(0,n).equals(str.substring(i,i+n))) {
	      return true;
	    }
	  }
	  
	  return false;
	}
	
	/**
	 * https://codingbat.com/prob/p159772
	 * Given a string, does "xyz" appear in the middle of the string? 
	 * To define middle, we'll say that the number of chars to the left 
	 * and right of the "xyz" must differ by at most one. This problem 
	 * is harder than it looks.
	 * @param str
	 * @return
	 */
	public boolean xyzMiddle(String str) {
	  // If at least length 3
	  if (str.length() >= 3) {
	    
	    // Two possible scenarios that will return true when length is even
	    if (str.length() % 2 == 0) {
	      if (str.substring(str.length()/2-1, str.length()/2+2).equals("xyz") ||
	          str.substring(str.length()/2-2, str.length()/2+1).equals("xyz")) {
	        return true;
	      }
	    // "xyz" must be in the middle when length is odd
	    } else {
	      if (str.substring(str.length()/2-1, str.length()/2+2).equals("xyz")) {
	        return true;
	      }
	    }

	    return false;
	    
	  } else {
	    return false;
	  }
	}

}
