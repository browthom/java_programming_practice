package top;

public class Recursion1 {
	/**
	 * https://codingbat.com/prob/p186177
	 * Given a string and a non-empty substring sub, compute recursively the 
	 * number of times that sub appears in the string, without the sub strings overlapping.
	 * @param str
	 * @param sub
	 * @return
	 */
	public int strCount(String str, String sub) {
		  
	    if (str.length() > sub.length()) {
	      if (str.substring(0,sub.length()).equals(sub))
	        return 1 + strCount(str.substring(sub.length(), str.length()), sub);
	      else
	        return strCount(str.substring(1,str.length()), sub);
	        
	    } else if (str.length() == sub.length()) {
	      
	      if (str.equals(sub))
	        return 1;
	      else
	        return 0;
	    } else {
	      return 0;
	    }
	}
	
	/**
	 * https://codingbat.com/prob/p183174
	 * Given a string, return true if it is a nesting of zero or more pairs of parenthesis, 
	 * like "(())" or "((()))". Suggestion: check the first and last chars, and then recur 
	 * on what's inside them.
	 * @param str
	 * @return
	 */
	public boolean nestParen(String str) {
	  
	  if (str.length() >= 1) {
	    if (str.charAt(0) == '(' && str.charAt(str.length()-1) == ')')
	      return nestParen(str.substring(1,str.length()-1));
	    else if (str.length() == 1 && str.charAt(0) != '(' && str.charAt(0) != ')')
	      return true;
	    else
	      return false;
	  } else {
	    return true;
	  }
	}
	
	/**
	 * https://codingbat.com/prob/p137918
	 * Given a string that contains a single pair of parenthesis, 
	 * compute recursively a new string made of only of the parenthesis 
	 * and their contents, so "xyz(abc)123" yields "(abc)".
	 * @param str
	 * @return
	 */
	public String parenBit(String str) {
		  
	  if (str.length() >= 1) {
	    if (str.charAt(0) != '(')
	      return parenBit(str.substring(1,str.length()));
	      
	    else if (str.charAt(str.length()-1) != ')')
	      return parenBit(str.substring(0,str.length()-1));
	      
	    else
	      return str;
	  } else {
	    return "";
	  }
	}
	
	/**
	 * https://codingbat.com/prob/p104029
	 * Given a string, return recursively a "cleaned" string where 
	 * adjacent chars that are the same have been reduced to a single char. 
	 * So "yyzzza" yields "yza".
	 * @param str
	 * @return
	 */
	public String stringClean(String str) {
		  
	    if (str.length() >= 2) {
	      // If first and second character equal,
	      // then remove 1st char from string
	      if (str.charAt(0) == str.charAt(1))
	        return stringClean(str.substring(1,str.length()));
	      else
	        return str.charAt(0) + stringClean(str.substring(1,str.length()));
	    } else {
	      return str;
	    }
	}
	
	/**
	 * https://codingbat.com/prob/p143900
	 * Given a string, compute recursively the number of times 
	 * lowercase "hi" appears in the string, however do not count 
	 * "hi" that have an 'x' immedately before them.
	 * @param str
	 * @return
	 */
	public int countHi2(String str) {
		  
	  if (str.length() >= 3) {
	    if (str.substring(str.length()-2, str.length()).equals("hi") &&
	        str.charAt(str.length()-3) != 'x')
	      return 1 + countHi2(str.substring(0,str.length()-2));
	    else
	      return countHi2(str.substring(0,str.length()-1));
	      
	  } else if (str.length() == 2) {
	    if (str.substring(0, 2).equals("hi"))
	      return 1;
	    else
	      return 0;
	  } else {
	    return 0;
	  }
	}
	
	/**
	 * https://codingbat.com/prob/p167015
	 * Given a string, compute recursively (no loops) the number of 
	 * "11" substrings in the string. The "11" substrings should not overlap.
	 * @param str
	 * @return
	 */
	public int count11(String str) {
		  
	    // Only when at least 2 chars exist in string;
	    // otherwise there is no possible way a pair can exist
	    if (str.length() >= 2) {
	      // If pair exists, add 1 and pass new string with first two
	      // chars shaved off.
	      if (str.substring(0,2).equals("11"))
	        return 1 + count11(str.substring(2, str.length()));
	      // If pair does not exist, simply pass new string with first
	      // char shaved off;
	      else
	        return count11(str.substring(1,str.length()));
	    // We have reached the end of recursion, simply return 0
	    } else {
	      return 0;
	    }
	}
	
	/**
	 * https://codingbat.com/prob/p161124
	 * Count recursively the total number of "abc" and "aba" substrings 
	 * that appear in the given string.
	 * @param str
	 * @return
	 */
	public int countAbc(String str) {
		  
	  if (str.length() >= 3) {
	    if (str.substring(0,3).equals("abc") ||
	        str.substring(0,3).equals("aba"))
	        
	        return 1 + countAbc(str.substring(1,str.length()));
	    
	    else
	        return countAbc(str.substring(1,str.length()));
	  } else {
	    return 0;
	  }
	}
	
	/**
	 * https://codingbat.com/prob/p154048
	 * We'll say that a "pair" in a string is two instances of a char 
	 * separated by a char. So "AxA" the A's make a pair. Pair's can overlap, 
	 * so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. Recursively 
	 * compute the number of pairs in the given string.
	 * @param str
	 * @return
	 */
	public int countPairs(String str) {

	  if (str.length() >= 3) {
	    if (str.charAt(0) == str.charAt(2))  
	      return 1 + countPairs(str.substring(1, str.length()));
	    else
	      return countPairs(str.substring(1, str.length()));
	  } else {
	    return 0;
	  }
	}
	
	/**
	 * https://codingbat.com/prob/p105722
	 * Given a string, compute recursively a new string where all the 
	 * lowercase 'x' chars have been moved to the end of the string.
	 * @param str
	 * @return
	 */
	public String endX(String str) {
		  
	  if (str.length() >= 1) {
	    if (str.charAt(0) == 'x')
	      return endX(str.substring(1, str.length())) + 'x';
	    else
	      return str.charAt(0) + endX(str.substring(1, str.length()));
	  } else {
	    return "";
	  }
	}
	
	/**
	 * https://codingbat.com/prob/p183394
	 * Given a string, compute recursively a new string where all the 
	 * adjacent chars are now separated by a "*".
	 * @param str
	 * @return
	 */
	public String allStar(String str) {
		  
	    if (str.length() > 1)
	      return str.charAt(0) + "*" + allStar(str.substring(1, str.length()));
	    else
	      return str;
	}
	
	/**
	 * https://codingbat.com/prob/p158175
	 * Given a string, compute recursively a new string where identical chars
	 * that are adjacent in the original string are separated from each other by a "*".
	 * @param str
	 * @return
	 */
	public String pairStar(String str) {
	    
	  if (str.length() > 1) {
	    if (str.charAt(0) == str.charAt(1))
	      return str.charAt(0) + "*" + pairStar(str.substring(1,str.length()));
	    else
	      return str.charAt(0) + pairStar(str.substring(1,str.length()));
	  } else {
	    return str;
	  }
	}
	
	/**
	 * https://codingbat.com/prob/p173469
	 * Given an array of ints, compute recursively if the array contains somewhere 
	 * a value followed in the array by that value times 10. We'll use the convention 
	 * of considering only the part of the array that begins at the given index. 
	 * In this way, a recursive call can pass index+1 to move down the array. 
	 * The initial call will pass in index as 0.
	 * @param nums
	 * @param index
	 * @return
	 */
	public boolean array220(int[] nums, int index) {
		  
	  // 
	  if (nums.length >= 2 && index+1 < nums.length) {
	      
	      if ( nums[index] * 10.0 == nums[index+1] )
	        return true;
	      else
	        return array220(nums, index+1);
	        
	  } else {
	    return false;
	  }
	}
	
	/**
	 * https://codingbat.com/prob/p135988
	 * Given an array of ints, compute recursively the number of times 
	 * that the value 11 appears in the array. We'll use the convention of 
	 * considering only the part of the array that begins at the given index. 
	 * In this way, a recursive call can pass index+1 to move down the array. 
	 * The initial call will pass in index as 0.
	 * @param nums
	 * @param index
	 * @return
	 */
	public int array11(int[] nums, int index) {
		  
	  if (index < nums.length) {
	    if (nums[index] == 11)
	      return 1 + array11(nums, index+1);
	    else
	      return array11(nums,index+1);
	  } else {
	    return 0;
	  }
	}
	
	/**
	 * https://codingbat.com/prob/p108997
	 * Given an array of ints, compute recursively if the array contains a 6.
	 * We'll use the convention of considering only the part of the array that 
	 * begins at the given index. In this way, a recursive call can pass index+1 
	 * to move down the array. The initial call will pass in index as 0.
	 * @param nums
	 * @param index
	 * @return
	 */
	public boolean array6(int[] nums, int index) {
		  
	  if (index < nums.length) {
	    if (nums[index] == 6)
	      return true;
	    else
	      return array6(nums, index+1);
	  } else {
	    return false;
	  }
	}
	
	/**
	 * https://codingbat.com/prob/p118230
	 * Given a string, compute recursively a new string 
	 * where all the 'x' chars have been removed.
	 * @param str
	 * @return
	 */
	public String noX(String str) {
	    
	    if (str.length() > 1) {
	      if (str.charAt(0) == 'x')
	        return "" + noX(str.substring(1,str.length()));
	      else
	        return str.charAt(0) + noX(str.substring(1,str.length()));
	        
	    } else if (str.length() == 1) {
	      if (str.charAt(0) == 'x')
	        return "";
	      else
	        return str;
	        
	    } else {
	      return str;
	    }
	}
	
	/**
	 * https://codingbat.com/prob/p170924
	 * Given a string, compute recursively (no loops) a new 
	 * string where all appearances of "pi" have been replaced by "3.14".
	 * @param str
	 * @return
	 */
	public String changePi(String str) {
		  
	  if (str.length() > 1) {
	    if (str.substring(0,2).equals("pi"))
	      return "3.14" + changePi(str.substring(2,str.length()));
	    else
	      return str.charAt(0) + changePi(str.substring(1,str.length()));
	  } else {
	    return str;
	  }
	}
	
	/**
	 * https://codingbat.com/prob/p101372
	 * Given a string, compute recursively (no loops) a new string 
	 * where all the lowercase 'x' chars have been changed to 'y' chars.
	 * @param str
	 * @return
	 */
	public String changeXY(String str) {
		  
	    if (str.length() >= 1) {
	      if (str.charAt(0) == 'x')
	        return 'y' + changeXY(str.substring(1,str.length()));
	      else
	        return str.charAt(0) + changeXY(str.substring(1,str.length()));
	    } else {
	      return "";
	    }
	}
	
	/**
	 * https://codingbat.com/prob/p184029
	 * Given a string, compute recursively (no loops) the 
	 * number of times lowercase "hi" appears in the string.
	 * @param str
	 * @return
	 */
	public int countHi(String str) {
		  
	  if (str.length() >= 2) { 
	    if (str.substring(0,2).equals("hi"))
	      return 1 + countHi(str.substring(1,str.length()));
	    else
	      return countHi(str.substring(1,str.length()));
	  } else {
	    return 0;
	  }
	}
	
	/**
	 * https://codingbat.com/prob/p170371
	 * Given a string, compute recursively (no loops) the number 
	 * of lowercase 'x' chars in the string.
	 * @param str
	 * @return
	 */
	public int countX(String str) {
		  
	  if (str.length() > 0) {
	    if (str.charAt(0) == 'x')
	      return 1 + countX(str.substring(1,str.length()));
	    else
	      return countX(str.substring(1,str.length()));
	  } else {
	    return 0;
	  }
	}
	
	/**
	 * https://codingbat.com/prob/p158888
	 * Given base and n that are both 1 or more, compute recursively (no loops) 
	 * the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
	 * @param base
	 * @param n
	 * @return
	 */
	public int powerN(int base, int n) {
		  
	  if (n - 1 > 0)
	    return base * powerN(base, n-1);
	  else
	    return base;
	}
	
	/**
	 * https://codingbat.com/prob/p101409
	 * Given a non-negative int n, return the count of the occurrences of 7 as a digit, 
	 * so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the 
	 * rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost 
	 * digit (126 / 10 is 12).
	 * @param n
	 * @return
	 */
	public int count7(int n) {
		  
	    if (n >= 10) {
	      return count7((int) n / 10) + count7(n % 10);
	    } else {
	      if (n == 7)
	        return 1;
	      else
	        return 0;
	    }
	}
	
	/**
	 * https://codingbat.com/prob/p163932
	 * Given a non-negative int n, return the sum of its digits recursively (no loops). 
	 * Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide 
	 * (/) by 10 removes the rightmost digit (126 / 10 is 12).
	 * @param n
	 * @return
	 */
	public int sumDigits(int n) {
		  
	  if (n >= 10)
	    return sumDigits((int) n / 10) + sumDigits(n % 10);
	  else
	    return n;
	}
	
	/**
	 * https://codingbat.com/prob/p194781
	 * We have triangle made of blocks. The topmost row has 1 block, 
	 * the next row down has 2 blocks, the next row has 3 blocks, and so on. 
	 * Compute recursively (no loops or multiplication) the total number of
	 * blocks in such a triangle with the given number of rows.
	 * @param rows
	 * @return
	 */
	public int triangle(int rows) {
		  
	  if (rows-1 >= 0)
	    return rows + triangle(rows-1);
	  else
	    return 0;
	}
	
	/**
	 * https://codingbat.com/prob/p107330
	 * We have bunnies standing in a line, numbered 1, 2, ... 
	 * The odd bunnies (1, 3, ..) have the normal 2 ears. 
	 * The even bunnies (2, 4, ..) we'll say have 3 ears, 
	 * because they each have a raised foot. Recursively 
	 * return the number of "ears" in the bunny line 1, 2, ... n 
	 * (without loops or multiplication).
	 * @param bunnies
	 * @return
	 */
	public int bunnyEars2(int bunnies) {
		  
		if (bunnies - 1 >= 0) {
		    if (bunnies % 2 != 0)
		      return 2 + bunnyEars2(bunnies-1);
		    else if (bunnies % 2 == 0)
		      return 3 + bunnyEars2(bunnies-1);
		} else {
		    return 0;
		}
		return 0;
	}
	
	/**
	 * https://codingbat.com/prob/p120015
	 * The fibonacci sequence is a famous bit of 
	 * mathematics, and it happens to have a recursive 
	 * definition. The first two values in the sequence 
	 * are 0 and 1 (essentially 2 base cases). Each 
	 * subsequent value is the sum of the previous two 
	 * values, so the whole sequence is: 0, 1, 1, 2, 3, 
	 * 5, 8, 13, 21 and so on. Define a recursive fibonacci(n) 
	 * method that returns the nth fibonacci number, with n=0 
	 * representing the start of the sequence.
	 * 
	 * @param n
	 * @return
	 */
	public int fibonacci(int n) {

		if (n - 2 >= 0)
			return fibonacci(n-2) + fibonacci(n-1);
		else if (n == 1)
		    return 1;
		else
		    return 0;
	}
	
	/**
	 * https://codingbat.com/prob/p183649
	 * We have a number of bunnies
	 * and each bunny has two big floppy ears. 
	 * We want to compute the total number of 
	 * ears across all the bunnies recursively 
	 * (without loops or multiplication).
	 * @param bunnies
	 * @return
	 */
	public int bunnyEars(int bunnies) {
	    
	    if (bunnies == 0)
	      return 0;
	    else if (bunnies - 1 > 0)
	      return 2 + bunnyEars(bunnies-1);
	    else
	      return 2;
	}
	
	/**
	 * https://codingbat.com/prob/p154669
	 * Given n of 1 or more, return the factorial of n, 
	 * which is n * (n-1) * (n-2) ... 1. Compute the result 
	 * recursively (without loops).
	 * @param n
	 * @return
	 */
	public int factorial(int n) {
	    
	    if (n - 1 > 0)
	      return n * factorial(n-1);
	    else
	      return 1;
	}
	
	/**
	 * https://codingbat.com/prob/p118182
	 * Given a string and a non-empty substring sub, 
	 * compute recursively if at least n copies of sub 
	 * appear in the string somewhere, possibly with 
	 * overlapping. N will be non-negative.
	 * @param str
	 * @param sub
	 * @param n
	 * @return
	 */
	public boolean strCopies(String str, String sub, int n) {
		  
	  // We have recursively found 'n' number of instances of 'sub' string
	  if (n == 0) {
	    return true;
	  }
	  
	  // Ensure that there is enough size left in string
	  if (str.length() >= sub.length() && str.length() > 1) {
	    
	    String newStr = str.substring(1,str.length());
	    String subStr = str.substring(0,sub.length());
	    
	    // If substring of interest equals 'sub' and we are looking for more
	    // substrings, then continue searching recursively.
	    if (subStr.equals(sub)) {
	      return strCopies(newStr, sub, n-1);
	    
	    // If substring of interest does not equal 'sub'
	    } else if (!subStr.equals(sub)) {
	      return strCopies(newStr, sub, n);
	      
	    }
	    
	  // If 'str' is too small then return false
	  } else {
	    return false;
	  }
	  
	  return false;
	}
	
	/**
	 * https://codingbat.com/prob/p195413
	 * Given a string and a non-empty substring sub, 
	 * compute recursively the largest substring which 
	 * starts and ends with sub and return its length.
	 * @param str
	 * @param sub
	 * @return
	 */
	public int strDist(String str, String sub) {
		  
	  // Ensure that the 'str' is at least as long as the length of 'sub'
	  if (str.length() >= sub.length()) {
	    
	    // If a substring containing 'sub' at the left and right ends,
	    // Then return the string length as this is the maximum string length
	    // in this branch of the recursive call
	    if (str.substring(0, sub.length()).equals(sub) &&
	        str.substring(str.length()-sub.length(), str.length()).equals(sub)) {
	      return str.length();
	    
	    // Remove end characters of 'str' and branch recursively to find max
	    // length in those recursive paths
	    } else {
	      
	      String left = str.substring(1,str.length());
	      String right = str.substring(0,str.length()-1);
	      
	      int leftSize = strDist(left, sub);
	      int rightSize = strDist(right, sub);
	      
	      // Compare lengths of the substrings found in these two recursive branches
	      return (leftSize > rightSize) ? leftSize : rightSize;
	    } 
	  
	  // If not as long as 'sub', then return 0 as the length
	  } else {
	  
	    return 0;
	  }
	  
	  
	}


}
