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
	
	/**
	 * https://codingbat.com/prob/p139075
	 * Given a string, return true if "bad" appears starting 
	 * at index 0 or 1 in the string, such as with "badxxx" 
	 * or "xbadxx" but not "xxbadxx". The string may be any 
	 * length, including 0. Note: use .equals() to compare 2 
	 * strings.
	 * @param str
	 * @return
	 */
	public boolean hasBad(String str) {
	  if (str.length() >= 3) {
	    if (str.substring(0,3).equals("bad")) {
	      return true;
	    }
	  }
	  
	  if (str.length() >= 4) {
	    if (str.substring(1,4).equals("bad")) {
	      return true;
	    }
	  }
	  
	  return false;
	}	
	
	/**
	 * https://codingbat.com/prob/p132118
	 * Given two strings, append them together 
	 * (known as "concatenation") and return the result. 
	 * However, if the concatenation creates a double-char, 
	 * then omit one of the chars, so "abc" and "cat" yields 
	 * "abcat".
	 * @param a
	 * @param b
	 * @return
	 */
	public String conCat(String a, String b) {
	  if (a.length() > 0 && b.length() > 0) {
	    if (a.charAt(a.length()-1) == b.charAt(0)) {
	      return a + b.substring(1,b.length());
	    } else {
	      return a + b;
	    }
	  } else {
	    return a + b;
	  }
	}

	/**
	 * https://codingbat.com/prob/p196652
	 * Given a string, return true if the first 2 chars 
	 * in the string also appear at the end of the string, 
	 * such as with "edited".
	 * @param str
	 * @return
	 */
	public boolean frontAgain(String str) {
	  if (str.length() >= 2) {
	    if (str.substring(0,2).equals(str.substring(str.length()-2,str.length()))) {
	      return true;
	    } else {
	      return false;
	    }
	  } else {
	    return false;
	  }
	}
	
	/**
	 * https://codingbat.com/prob/p142247
	 * Given a string, if a length 2 substring appears at 
	 * both its beginning and end, return a string without 
	 * the substring at the beginning, so "HelloHe" yields 
	 * "lloHe". The substring may overlap with itself, so 
	 * "Hi" yields "". Otherwise, return the original string 
	 * unchanged.
	 * @param str
	 * @return
	 */
	public String without2(String str) {
	  if (str.length() >= 3) {
	    if (str.substring(0,2).equals(str.substring(str.length()-2,str.length()))) {
	      return str.substring(2,str.length());
	    } else {
	      return str;
	    }
	  } else if (str.length() == 2) {
	    return "";
	  } else {
	    return str;
	  }
	}
	
	/**
	 * https://codingbat.com/prob/p151940
	 * Given a string, if the first or last chars are 'x', 
	 * return the string without those 'x' chars, and 
	 * otherwise return the string unchanged.
	 * @param str
	 * @return
	 */
	public String withoutX(String str) {
	  if (str.length() > 1) {
	    if (str.charAt(0) == 'x') {
	      str = str.substring(1,str.length());
	    }
	  } else if (str.equals("x")) {
	    return "";
	  }
	    
	  if (str.length() > 1) {
	    if (str.charAt(str.length()-1) == 'x') {
	      str = str.substring(0,str.length()-1);
	    }
	  } else if (str.equals("x")) {
	    return "";
	  }
	  
	  return str;
	}
	
	/**
	 * https://codingbat.com/prob/p147483
	 * The web is built with HTML strings like "<i>Yay</i>" 
	 * which draws Yay as italic text. In this example, 
	 * the "i" tag makes <i> and </i> which surround the 
	 * word "Yay". Given tag and word strings, create the 
	 * HTML string with tags around the word, e.g. 
	 * "<i>Yay</i>".
	 * @param tag
	 * @param word
	 * @return
	 */
	public String makeTags(String tag, String word) {
	  return "<" + tag + ">" + word + "</" + tag + ">";
	}
	
	/**
	 * https://codingbat.com/prob/p163411
	 * Given a string, return the string made of its first 
	 * two chars, so the String "Hello" yields "He". 
	 * If the string is shorter than length 2, 
	 * return whatever there is, so "X" yields "X", 
	 * and the empty string "" yields the empty string "". 
	 * Note that str.length() returns the length of a string.
	 * @param str
	 * @return
	 */
	public String firstTwo(String str) {
	  if (str.length() >= 2) {
	    return str.substring(0,2);
	  } else {
	    return str;
	  }
	}
	
	/**
	 * https://codingbat.com/prob/p168564
	 * Given 2 strings, a and b, return a string of the 
	 * form short+long+short, with the shorter string on 
	 * the outside and the longer string on the inside. 
	 * The strings will not be the same length, but they 
	 * may be empty (length 0).
	 * @param a
	 * @param b
	 * @return
	 */
	public String comboString(String a, String b) {
	  if (a.length() > b.length()) {
	    return b + a + b;
	  } else {
	    return a + b + a;
	  }
	}

	/**
	 * https://codingbat.com/prob/p130781
	 * Given a string, return a "rotated right 2" version 
	 * where the last 2 chars are moved to the start. 
	 * The string length will be at least 2.
	 * @param str
	 * @return
	 */
	public String right2(String str) {
	  if (str.length() >= 3) {
	    return str.substring(str.length()-2, str.length()) + str.substring(0,str.length()-2);
	  } else {
	    return str;
	  }
	}
	
	/**
	 * https://codingbat.com/prob/p137729
	 * Given a string of even length, return a string made 
	 * of the middle two chars, so the string "string" 
	 * yields "ri". The string length will be at least 2.
	 * @param str
	 * @return
	 */
	public String middleTwo(String str) {
	  return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
	}

	/**
	 * https://codingbat.com/prob/p144623
	 * Given a string and an index, return a string length 
	 * 2 starting at the given index. If the index is too 
	 * big or too small to define a string length 2, use 
	 * the first 2 chars. The string length will be at 
	 * least 2.
	 * @param str
	 * @param index
	 * @return
	 */
	public String twoChar(String str, int index) {
	  if (index < str.length()-1 &&
	      index >= 0) {
	    return str.substring(index,index+2);
	  } else {
	    return str.substring(0,2);
	  }
	}

	/**
	 * https://codingbat.com/prob/p139076
	 * Given a string, return a string length 2 
	 * made of its first 2 chars. If the string 
	 * length is less than 2, use '@' for the missing chars.
	 * @param str
	 * @return
	 */
	public String atFirst(String str) {
	  if (str.length() >= 2) {
	    return str.substring(0,2);
	  } else if (str.length() == 1) {
	    return str + "@";
	  } else {
	    return "@@";
	  }
	}
	
	/**
	 * https://codingbat.com/prob/p194786
	 * Given a string of any length, return a new string 
	 * where the last 2 chars, if present, are swapped, 
	 * so "coding" yields "codign".
	 * @param str
	 * @return
	 */
	public String lastTwo(String str) {
	  if (str.length() >= 3) {
	    return str.substring(0,str.length()-2) + 
	           str.charAt(str.length()-1) +
	           str.charAt(str.length()-2);
	  } else if (str.length() == 2) {
	    return str.substring(str.length()-1, str.length()) +
	           str.substring(str.length()-2, str.length()-1);
	  } else {
	    return str;
	  }
	}
	
	/**
	 * https://codingbat.com/prob/p105745
	 * Given two strings, append them together 
	 * (known as "concatenation") and return the result.
	 * However, if the strings are different lengths, 
	 * omit chars from the longer string so it is the 
	 * same length as the shorter string. So "Hello" 
	 * and "Hi" yield "loHi". The strings may be any length.
	 * @param a
	 * @param b
	 * @return
	 */
	public String minCat(String a, String b) {
	  if (a.length() > b.length()) {
	    return a.substring(a.length()-b.length(),a.length()) + b;
	  } else if (a.length() < b.length()) {
	    return a + b.substring(b.length()-a.length(),b.length());
	  } else {
	    return a + b;
	  }
	}
	
	/**
	 * https://codingbat.com/prob/p110141
	 * Given a string, return a version without the first 
	 * 2 chars. Except keep the first char if it is 'a' 
	 * and keep the second char if it is 'b'. The string 
	 * may be any length. Harder than it looks.
	 * @param str
	 * @return
	 */
	public String deFront(String str) {    
	  if (str.length() >= 3) {
	    return (str.charAt(0)=='a' ? "a" : "") +
	           (str.charAt(1)=='b' ? "b" : "") +
	           str.substring(2,str.length());
	           
	  } else if (str.length() == 2) {
	    return (str.charAt(0)=='a' ? "a" : "") +
	           (str.charAt(1)=='b' ? "b" : "");
	           
	  } else if (str.length() == 1) {
	    return (str.charAt(0)=='a' ? "a" : "");
	    
	  } else {
	    return "";
	  }
	}
	
	/**
	 * https://codingbat.com/prob/p151359
	 * Given a string, if one or both of the first 2 chars 
	 * is 'x', return the string without those 'x' chars, 
	 * and otherwise return the string unchanged. This is 
	 * a little harder than it looks.
	 * @param str
	 * @return
	 */
	public String withoutX2(String str) {
	  if (str.length() >= 3) {
	    return (str.charAt(0) == 'x' ? "" : str.substring(0,1)) +
	           (str.charAt(1) == 'x' ? "" : str.substring(1,2)) +
	           str.substring(2,str.length());
	  } else if (str.length() == 2) {
	    return (str.charAt(0) == 'x' ? "" : str.substring(0,1)) +
	           (str.charAt(1) == 'x' ? "" : str.substring(1,2));
	  } else if (str.length() == 1) {
	    return (str.charAt(0) == 'x' ? "" : str.substring(0,1));
	  } else {
	    return "";
	  }
	}
}
