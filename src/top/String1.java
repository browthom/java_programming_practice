package top;

public class String1 {
	
	/**
	 * https://codingbat.com/prob/p171896
	 * Given a string name, e.g. "Bob", return a greeting 
	 * of the form "Hello Bob!".
	 * @param name
	 * @return
	 */
	public String helloName(String name) {
	  return "Hello " + name + "!";
	}
	
	/**
	 * https://codingbat.com/prob/p184030
	 * Given an "out" string length 4, such as "<<>>", 
	 * and a word, return a new string where the word is 
	 * in the middle of the out string, e.g. "<<word>>". 
	 * Note: use str.substring(i, j) to extract the String 
	 * starting at index i and going up to but not including 
	 * index j.
	 * @param out
	 * @param word
	 * @return
	 */
	public String makeOutWord(String out, String word) {
	  return out.substring(0,2) + word + out.substring(2,4);
	}

	/**
	 * https://codingbat.com/prob/p172267
	 * Given a string of even length, return the first half. 
	 * So the string "WooHoo" yields "Woo".
	 * @param str
	 * @return
	 */
	public String firstHalf(String str) {
	  return str.substring(0, str.length() / 2);
	}

	/**
	 * https://codingbat.com/prob/p143825
	 * Given 2 strings, return their concatenation, 
	 * except omit the first char of each. The strings 
	 * will be at least length 1.
	 * @param a
	 * @param b
	 * @return
	 */
	public String nonStart(String a, String b) {
	  return a.substring(1,a.length()) + b.substring(1,b.length());
	}

	/**
	 * https://codingbat.com/prob/p162477
	 * Given a string, return a string length 1 from its 
	 * front, unless front is false, in which case return 
	 * a string length 1 from its back. The string will 
	 * be non-empty.
	 * @param str
	 * @param front
	 * @return
	 */
	public String theEnd(String str, boolean front) {
	  if (front) {
	    return str.substring(0,1);
	  } else {
	    return str.substring(str.length()-1,str.length());
	  }
	}
	
	/**
	 * https://codingbat.com/prob/p103895
	 * Given a string, return true if it ends in "ly".
	 * @param str
	 * @return
	 */
	public boolean endsLy(String str) {
	  if (str.length() >= 2) {
	    return str.substring(str.length()-2, str.length()).equals("ly");
	  } else {
	    return false;
	  }
	}
	
	/**
	 * https://codingbat.com/prob/p115863
	 * Given a string of odd length, return the string 
	 * length 3 from its middle, so "Candy" yields "and". 
	 * The string length will be at least 3.
	 * @param str
	 * @return
	 */
	public String middleThree(String str) {
	  return str.substring((str.length()-1)/2 - 1, (str.length()-1)/2 + 2);
	}
	
	/**
	 * https://codingbat.com/prob/p138183
	 * Given 2 strings, a and b, return a new string made 
	 * of the first char of a and the last char of b, so 
	 * "yo" and "java" yields "ya". If either string is 
	 * length 0, use '@' for its missing char.
	 * @param a
	 * @param b
	 * @return
	 */
	public String lastChars(String a, String b) {
	  String newString = "";
	  
	  if (a.length() > 0) {
	    newString += a.charAt(0) + "";  
	  } else {
	    newString += "@";
	  }
	  
	  if (b.length() > 0) {
	    newString += b.charAt(b.length()-1) + "";  
	  } else {
	    newString += "@";
	  }
	  
	  return newString;
	}
	
	/**
	 * https://codingbat.com/prob/p199216
	 * Given a string, if the string begins with "red" 
	 * or "blue" return that color string, otherwise 
	 * return the empty string.
	 * @param str
	 * @return
	 */
	public String seeColor(String str) {
	  if (str.length() >= 3) {
	    if (str.substring(0,3).equals("red")) {
	      return "red";
	    }
	  } 
	  
	  if (str.length() >= 4) {
	    if (str.substring(0,4).equals("blue")) {
	      return "blue";
	    }
	  }
	  
	  return "";
	}

	/**
	 * https://codingbat.com/prob/p172063
	 * Given a string, return a new string made of 3 copies 
	 * of the first 2 chars of the original string. 
	 * The string may be any length. If there are fewer 
	 * than 2 chars, use whatever is there.
	 * @param str
	 * @return
	 */
	public String extraFront(String str) {
	  if (str.length() >= 2) {
	    return str.substring(0,2) + str.substring(0,2) + str.substring(0,2);
	  } else {
	    return str + str + str;
	  }
	}
	
	/**
	 * https://codingbat.com/prob/p141494
	 * Given a string and a second "word" string, we'll say 
	 * that the word matches the string if it appears at the 
	 * front of the string, except its first char does not 
	 * need to match exactly. On a match, return the front 
	 * of the string, or otherwise return the empty string. 
	 * So, so with the string "hippo" the word "hi" returns 
	 * "hi" and "xip" returns "hip". The word will be at 
	 * least length 1.
	 * @param str
	 * @param word
	 * @return
	 */
	public String startWord(String str, String word) {
	  if (str.length() >= word.length()) {
	    
	    if (str.substring(1,word.length()).equals(word.substring(1,word.length()))) {
	      return str.substring(0,word.length());
	    } else {
	      return "";
	    }
	  } else {
	    return "";
	  }
	}
	
	/**
	 * https://codingbat.com/prob/p161056
	 * Given two strings, a and b, return the result of 
	 * putting them together in the order abba, e.g. "Hi" 
	 * and "Bye" returns "HiByeByeHi".
	 * @param a
	 * @param b
	 * @return
	 */
	public String makeAbba(String a, String b) {
	  return a + b + b + a;
	}

	/**
	 * https://codingbat.com/prob/p108853
	 * Given a string, return a new string made of 3 copies 
	 * of the last 2 chars of the original string. The string 
	 * length will be at least 2.
	 * @param str
	 * @return
	 */
	public String extraEnd(String str) {
	  String end = str.substring(str.length()-2, str.length());
	  
	  return end + end + end;
	}
	
	/**
	 * https://codingbat.com/prob/p130896
	 * Given a string, return a version without the first 
	 * and last char, so "Hello" yields "ell". The string 
	 * length will be at least 2.
	 * @param str
	 * @return
	 */
	public String withoutEnd(String str) {
	  if (str.length() >= 3) {
	    return str.substring(1,str.length()-1);
	  } else {
	    return "";
	  }
	}
	
	/**
	 * https://codingbat.com/prob/p197720
	 * Given a string, return a "rotated left 2" version 
	 * where the first 2 chars are moved to the end. The 
	 * string length will be at least 2.
	 * @param str
	 * @return
	 */
	public String left2(String str) {
	  if (str.length() >= 3) {
	    return str.substring(2,str.length()) + str.substring(0,2);
	  } else {
	    return str;
	  }
	}
	
	/**
	 * https://codingbat.com/prob/p174254
	 * Given a string, return a version without both the 
	 * first and last char of the string. The string may 
	 * be any length, including 0.
	 * @param str
	 * @return
	 */
	public String withouEnd2(String str) {
	  if (str.length() >= 3) {
	    return str.substring(1,str.length()-1);
	  } else {
	    return "";
	  }
	}

	/**
	 * https://codingbat.com/prob/p174148
	 * Given a string and an int n, return a string made 
	 * of the first and last n chars from the string. 
	 * The string length will be at least n.
	 * @param str
	 * @param n
	 * @return
	 */
	public String nTwice(String str, int n) {
	  return str.substring(0, n) + str.substring(str.length()-n, str.length());
	}

}
