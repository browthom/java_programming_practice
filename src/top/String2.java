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
	
	/**
	 * https://codingbat.com/prob/p194491
	 * Returns true if for every '*' (star) in the string, 
	 * if there are chars both immediately before and after 
	 * the star, they are the same.
	 * @param str
	 * @return
	 */
	public boolean sameStarChar(String str) {
		   
	  for (int i = 0; i < str.length(); i++) {
	    
	    String begStr = "", endStr = "";
	    
	    if (i-1 >= 0) {
	        begStr = str.charAt(i-1) + "";
	    }
	    
	    if (i+1 <= str.length()-1) {
	        endStr = str.charAt(i+1) + "";
	    }
	    
	    if (str.charAt(i) == '*' &&
	        (!begStr.equals(endStr) &&
	          i-1 >= 0 && i+1 <= str.length()-1)) {
	          return false;
	    }
	    
	  }
	  return true;
	}
	
	/**
	 * https://codingbat.com/prob/p122943
	 * Given a string, compute a new string by moving the first char 
	 * to come after the next two chars, so "abc" yields "bca". 
	 * Repeat this process for each subsequent group of 3 chars, 
	 * so "abcdef" yields "bcaefd". Ignore any group of fewer than 
	 * 3 chars at the end.
	 * @param str
	 * @return
	 */
	public String oneTwo(String str) {
	  String newStr = "";
	  
	  for (int i = 0; i+3 <= str.length(); i+=3) {
	    
	    newStr += str.substring(i+1,i+2) + 
	             str.substring(i+2,i+3) +
	             str.substring(i,i+1);
	          
	    
	  }
	  
	  return newStr;
	}
	
	/**
	 * https://codingbat.com/prob/p139564
	 * Return a version of the given string, where for every star (*) 
	 * in the string the star and the chars immediately to its left 
	 * and right are gone. So "ab*cd" yields "ad" and "ab**cd" also 
	 * yields "ad".
	 * @param str
	 * @return
	 */
	public String starOut(String str) {
	  String newStr = "";
	  
	  for (int i = 0; i < str.length();) {
	    // for char at 'i', look into the future at i+1 to see if it is a star
	    // if star at i+1, 
	    // then don't add char at i
	    // then don't add char at i+2 (if i+2 does not have a star)
	    if (i+1 < str.length()) {
	      // If neither the current char or future char == '*'
	      // Add char
	      if (str.charAt(i) != '*' && str.charAt(i+1) != '*') {
	        newStr += str.substring(i,i+1);
	        i++;
	      // If current char == '*' and future char != "*"
	      // Skip 2 chars
	      } else if (str.charAt(i) == '*' && str.charAt(i+1) != '*') {
	        i+=2;
	        
	      // Else, skip 1 char
	      } else {
	        i++;
	      }
	    // When we have reached the last char index
	    } else {
	      if (str.charAt(i) != '*') {
	        newStr += str.substring(i,i+1);
	      }
	      i++;
	    }
	  }
	  
	  return newStr;
	}
	
	/**
	 * https://codingbat.com/prob/p170829
	 * Given a string and a non-empty word string, return a version of 
	 * the original String where all chars have been replaced by pluses 
	 * ("+"), except for appearances of the word string which are preserved
	 *  unchanged.
	 * @param str
	 * @param word
	 * @return
	 */
	public String plusOut(String str, String word) {
		  
	  String newStr = "";
	  
	  for (int i = 0; i < str.length(); ) {
	    
	    // If word can fit into the last part of the string
	    if (i+word.length()-1 < str.length()) {
	      // Check to see if substring == word
	      if (str.substring(i,i+word.length()).equals(word)) {
	        newStr += word;
	        i += word.length();
	      // Else add "+" and increment
	      } else {
	        newStr += "+";
	        i++;
	      }
	    // If substring(i,length()) is too small to fit 'word'
	    } else {
	      newStr += "+";
	      i++;
	    }
	  }
	  
	  return newStr;
	}
	
	/**
	 * https://codingbat.com/prob/p147538
	 * Given a string and a non-empty word string, return a string made 
	 * of each char just before and just after every appearance of the 
	 * word in the string. Ignore cases where there is no char before 
	 * or after the word, and a char may be included twice if it is 
	 * between two words.
	 * @param str
	 * @param word
	 * @return
	 */
	public String wordEnds(String str, String word) {
	  String newStr = "";
	  
	  for (int i = 0; i < str.length();) {
	    
	    if (i+word.length()-1 < str.length()) {
	      
	      // If sequence == word
	      if (str.substring(i, i+word.length()).equals(word)) {
	        // Add front char
	        if (i-1 >= 0) {
	          newStr += str.substring(i-1, i);
	        }
	        
	        // Add back char
	        if (i+word.length() < str.length()) {
	          newStr += str.substring(i+word.length(), i+word.length()+1);
	        }
	        
	        // Increment by word.length()
	        i += word.length();
	        
	      } else {
	        i++;
	      }
	      
	    } else {
	      i++;
	    }
	  }
	  
	  return newStr;
	}
	
	/**
	 * https://codingbat.com/prob/p129952
	 * A sandwich is two pieces of bread with something in between. 
	 * Return the string that is between the first and last appearance 
	 * of "bread" in the given string, or return the empty string "" 
	 * if there are not two pieces of bread.
	 * @param str
	 * @return
	 */
	public String getSandwich(String str) {
		  
	  String bread = "bread";
	  int countBread = 0;
	  int breadIndex1 = 0;
	  int breadIndex2 = 0;
	  int i = 0; 

	  while (i < str.length()) {
	    
	    // Check to make sure remaining string length is at least 5 chars
	    if (i+bread.length()-1 < str.length()) {
	      
	      // If sequence == "bread"
	      if (str.substring(i, i+bread.length()).equals(bread)) {
	        
	        // Count occurrences of "bread" (max out at 2)
	        countBread = (countBread < 2) ? countBread+1 : countBread;
	        
	        // 1st occurrence of "bread"
	        if (countBread == 1) {
	          breadIndex1 = i+5;
	        // This will overwrite any previous occurrence of "bread"
	        } else if (countBread == 2) {
	          breadIndex2 = i;
	        }
	        
	        // Increment by bread length
	        i += bread.length();
	      
	      // Else just increment by 1
	      } else {
	        i++;
	      }
	    
	    // Else just increment by 1
	    } else {
	      i++;
	    }
	  }
	  
	  // If 2 breads found, return content inside
	  if (countBread == 2) {
	    return str.substring(breadIndex1, breadIndex2);
	  } else {
	    return "";
	  }
	}
	
	/**
	 * https://codingbat.com/prob/p180759
	 * Look for patterns like "zip" and "zap" in the string -- length-3, 
	 * starting with 'z' and ending with 'p'. Return a string where for 
	 * all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
	 * @param str
	 * @return
	 */
	public String zipZap(String str) {
	  String newStr = "";
	  int i = 0;
	  
	  while (i < str.length()) {
	    
	    // if the last substring being analyzed is at least 3 chars long
	    if (i+2 < str.length()) {
	      
	      // if "z_p" is found
	      if (str.charAt(i) == 'z' && str.charAt(i+2) == 'p') {
	        newStr += "zp";
	        i+=3;
	      // else just add char
	      } else {
	        newStr += str.substring(i, i+1);
	        i++;
	      }
	    // just add remaining chars
	    } else {
	      newStr += str.substring(i, i+1);
	      i++;
	    }
	  }
	  
	  return newStr;
	}


}
