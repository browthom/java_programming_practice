package top;

public class Array2 {
	
	/**
	 * https://codingbat.com/prob/p136254
	 * Given arrays nums1 and nums2 of the same length, 
	 * for every element in nums1, consider the corresponding 
	 * element in nums2 (at the same index). Return the count 
	 * of the number of times that the two elements differ by 
	 * 2 or less, but are not equal.
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public int matchUp(int[] nums1, int[] nums2) {
	  int count = 0;
	  for (int i = 0; i < nums1.length; i++) {
	    if (Math.abs(nums1[i]-nums2[i]) <= 2 &&
	        nums1[i] != nums2[i]) {
	        
	        count++;
	    }
	  }
	  
	  return count;
	}
	
	/**
	 * https://codingbat.com/prob/p168357
	 * Given an array of ints, return true if the array 
	 * contains two 7's next to each other, or there are 
	 * two 7's separated by one element, such as with {7, 1, 7}.
	 * @param nums
	 * @return
	 */
	public boolean has77(int[] nums) {
	  int occur1 = -1, occur2 = -1;
	  
	  for (int i = 0; i < nums.length; i++) {
	    if (nums[i] == 7 && occur1 == -1) {
	      occur1 = i;
	    } else if (nums[i] == 7 && occur2 == -1) {
	      occur2 = i;
	      if (occur2-occur1 > 2) {
	        occur1 = occur2;
	        occur2 = -1;
	      }
	    }
	  }
	  
	  return (occur2-occur1) <= 2 && occur1 != -1 && occur2 != -1;
	}
	
	/**
	 * https://codingbat.com/prob/p169260
	 * Given an array of ints, return true if there 
	 * is a 1 in the array with a 2 somewhere later 
	 * in the array.
	 * @param nums
	 * @return
	 */
	public boolean has12(int[] nums) {
	  boolean occur1 = false;
	  
	  for (int i = 0; i < nums.length; i++) {
	    if (nums[i] == 1 && !occur1) {
	      occur1 = true;
	    } else if (nums[i] == 2 && occur1) {
	      return true;
	    }
	  }
	  
	  return false;
	}

	/**
	 * https://codingbat.com/prob/p159979
	 * Given an array of ints, return true if the 
	 * array contains either 3 even or 3 odd values 
	 * all next to each other.
	 * @param nums
	 * @return
	 */
	public boolean modThree(int[] nums) {
		  
	  for (int i = 0; i+2 < nums.length; i++) {
	    if (nums[i] % 2 == 0 && nums[i+1] % 2 == 0 && nums[i+2] % 2 == 0) {
	      return true;
	    } else if (nums[i] % 2 == 1 && nums[i+1] % 2 == 1 && nums[i+2] % 2 == 1) {
	      return true;
	    }
	  }
	  
	  return false;
	}
	
	/**
	 * https://codingbat.com/prob/p109783
	 * Given an array of ints, return true if the value 3 
	 * appears in the array exactly 3 times, and no 3's 
	 * are next to each other.
	 * @param nums
	 * @return
	 */
	public boolean haveThree(int[] nums) {
	  int count = 0;
	  
	  for (int i = 0; i < nums.length; i++) {
	    if (nums[i] == 3) {
	      count++;
	      
	      if (i-1 >= 0) {
	        if (nums[i-1] == 3) {
	          return false;
	        }
	      }
	      
	      if (i+1 < nums.length) {
	        if (nums[i+1] == 3) {
	          return false;
	        }
	      }
	    }
	  }
	  
	  return (count == 3);
	}
	
	/**
	 * https://codingbat.com/prob/p102145
	 * Given an array of ints, return true if every 2 
	 * that appears in the array is next to another 2.
	 * @param nums
	 * @return
	 */
	public boolean twoTwo(int[] nums) {
		  
	  for (int i = 0; i < nums.length;) {
	    
	    // Check all indices besides last
	    if (nums[i] == 2 && i != nums.length-1) {
	      if (nums[i+1] != 2) {
	        return false;
	      } else {
	        i += 2;
	      }
	      
	    // Check last index
	    } else if (nums[i] == 2 && i == nums.length-1) {
	      if (i-1 >= 0) {
	        if (nums[i-1] != nums[i]) {
	          return false;
	        } else {
	          return true;
	        }
	      } else {
	        return false;
	      }
	      
	    // Else
	    } else {
	      i++;
	    }
	  }
	  
	  return true;
	}
	
	/**
	 * https://codingbat.com/prob/p162010
	 * Return the number of even ints in the given array. 
	 * Note: the % "mod" operator computes the remainder, 
	 * e.g. 5 % 2 is 1.
	 * @param nums
	 * @return
	 */
	public int countEvens(int[] nums) {
	  int count = 0;
	  
	  for (int i = 0; i < nums.length; i++) {
	    if (nums[i] % 2 == 0) {
	      count++;
	    }
	  }
	  
	  return count;
	}
	
	/**
	 * https://codingbat.com/prob/p196640
	 * Given an array length 1 or more of ints, return the 
	 * difference between the largest and smallest values 
	 * in the array. Note: the built-in Math.min(v1, v2) 
	 * and Math.max(v1, v2) methods return the smaller or 
	 * larger of two values.
	 * @param nums
	 * @return
	 */
	public int bigDiff(int[] nums) {
	  int max = nums[0], min = nums[0];
	  
	  for (int i = 1; i < nums.length; i++) {
	    max = Math.max(max, nums[i]);
	    min = Math.min(min, nums[i]);
	  }
	  
	  return max-min;
	}

	/**
	 * https://codingbat.com/prob/p136585
	 * Return the "centered" average of an array of ints, 
	 * which we'll say is the mean average of the values, 
	 * except ignoring the largest and smallest values in 
	 * the array. If there are multiple copies of the 
	 * smallest value, ignore just one copy, and likewise 
	 * for the largest value. Use int division to produce 
	 * the final average. You may assume that the array is 
	 * length 3 or more.
	 * @param nums
	 * @return
	 */
	public int centeredAverage(int[] nums) {
	  int max = nums[0], min = nums[0];
	  int sum = nums[0];
	  
	  for (int i = 1; i < nums.length; i++) {
	    max = Math.max(max, nums[i]);
	    min = Math.min(min, nums[i]);
	    sum += nums[i];
	  }
	  
	  sum -= (max+min);
	  
	  return (int) (sum / (nums.length-2));
	}
	
	/**
	 * https://codingbat.com/prob/p127384
	 * Return the sum of the numbers in the array, 
	 * returning 0 for an empty array. Except the number 
	 * 13 is very unlucky, so it does not count and numbers 
	 * that come immediately after a 13 also do not count.
	 * @param nums
	 * @return
	 */
	public int sum13(int[] nums) {
	  int sum = 0;
	  
	  for (int i = 0; i < nums.length; i++) {
	    if (nums[i] != 13) {
	      sum += nums[i];
	    } else {
	      i++;
	    }
	  }
	  
	  return sum;
	}
	
	/**
	 * https://codingbat.com/prob/p111327
	 * Return the sum of the numbers in the array, 
	 * except ignore sections of numbers starting with 
	 * a 6 and extending to the next 7 (every 6 will 
	 * be followed by at least one 7). Return 0 for 
	 * no numbers.
	 * @param nums
	 * @return
	 */
	public int sum67(int[] nums) {
	  int sum = 0;
	  boolean inSeq = false;
	  
	  for (int i = 0; i < nums.length; i++) {
	    if (nums[i] == 6) {
	      inSeq = true;
	    } else if (nums[i] == 7 && inSeq) {
	      inSeq = false;
	    } else if (!inSeq) {
	      sum += nums[i];
	    }
	  }
	  
	  return sum;
	}

	/**
	 * https://codingbat.com/prob/p121853
	 * Given an array of ints, return true if 
	 * the array contains a 2 next to a 2 somewhere.
	 * @param nums
	 * @return
	 */
	public boolean has22(int[] nums) {
		  
	  for (int i = 0; i+1 < nums.length; i++) {
	    if (nums[i] == 2 && nums[i+1] == 2) {
	      return true;
	    }
	  }
	  
	  return false;
	}

	/**
	 * https://codingbat.com/prob/p194525
	 * Given an array of ints, return true if 
	 * the array contains no 1's and no 3's.
	 * @param nums
	 * @return
	 */
	public boolean lucky13(int[] nums) {
	  for (int i = 0; i < nums.length; i++) {
	    if (nums[i] == 1 || nums[i] == 3) {
	      return false;
	    }
	  }
	  
	  return true;
	}

	/**
	 * https://codingbat.com/prob/p199612
	 * Given an array of ints, return true if 
	 * the sum of all the 2's in the array is exactly 8.
	 * @param nums
	 * @return
	 */
	public boolean sum28(int[] nums) {
	  int sum = 0;
	  
	  for (int i = 0; i < nums.length; i++) {
	    if (nums[i] == 2) {
	      sum += nums[i];
	    }
	  }
	  
	  return (sum == 8) ? true : false;
	}
	
	/**
	 * https://codingbat.com/prob/p104627
	 * Given an array of ints, return true if 
	 * the number of 1's is greater than the number of 4's
	 * @param nums
	 * @return
	 */
	public boolean more14(int[] nums) {
	  int numOnes = 0;
	  int numFours = 0;
	  
	  for (int i = 0; i < nums.length; i++) {
	    if (nums[i] == 1) {
	      numOnes++;
	    } else if (nums[i] == 4) {
	      numFours++;
	    }
	  }
	  
	  return (numOnes > numFours) ? true : false;
	}
	
	/**
	 * https://codingbat.com/prob/p180920
	 * Given a number n, create and return a new int array of length n, 
	 * containing the numbers 0, 1, 2, ... n-1. The given n may be 0, in 
	 * which case just return a length 0 array. You do not need a 
	 * separate if-statement for the length-0 case; the for-loop 
	 * should naturally execute 0 times in that case, so it just works. 
	 * The syntax to make a new int array is: new int[desired_length]   
	 * (See also: FizzBuzz Code)
	 * @param n
	 * @return
	 */
	public int[] fizzArray(int n) {
	  int[] newArray = new int[n];
	  
	  for (int i = 0; i < n; i++) {
	    newArray[i] = i;
	  }
	  
	  return newArray;
	}

	/**
	 * https://codingbat.com/prob/p186672
	 * Given an array of ints, return true if every element is a 1 or a 4.
	 * @param nums
	 * @return
	 */
	public boolean only14(int[] nums) {
	  for (int i = 0; i < nums.length; i++) {
	    if (nums[i] != 1 && nums[i] != 4) {
	      return false;
	    }
	  }
	  
	  return true;
	}

	/**
	 * https://codingbat.com/prob/p178353
	 * Given a number n, create and return a new string 
	 * array of length n, containing the strings "0", "1" "2" .. 
	 * through n-1. N may be 0, in which case just return a 
	 * length 0 array. Note: String.valueOf(xxx) will make the 
	 * String form of most types. The syntax to make a new 
	 * string array is: new String[desired_length]  
	 * (See also: FizzBuzz Code)
	 * @param n
	 * @return
	 */
	public String[] fizzArray2(int n) {
	  String[] str = new String[n];
	  
	  for (int i = 0; i < n; i++) {
	    str[i] = String.valueOf(i);
	  }
	  
	  return str;
	}
	
	/**
	 * https://codingbat.com/prob/p136648
	 * Given an array of ints, return true if it 
	 * contains no 1's or it contains no 4's.
	 * @param nums
	 * @return
	 */
	public boolean no14(int[] nums) {
	  boolean ones = false, fours = false;
	  
	  for (int i = 0; i < nums.length; i++) {
	    if (nums[i] == 1) {
	      ones = true;
	    } else if (nums[i] == 4) {
	      fours = true;
	    }
	  }
	  
	  return (!ones) || (!fours);
	}

	/**
	 * https://codingbat.com/prob/p110222
	 * We'll say that a value is "everywhere" in an array if 
	 * for every pair of adjacent elements in the array, at 
	 * least one of the pair is that value. Return true if 
	 * the given value is everywhere in the array.
	 * @param nums
	 * @param val
	 * @return
	 */
	public boolean isEverywhere(int[] nums, int val) {
		  
	  for (int i = 0; i+1 < nums.length; i++) {
	    if (nums[i] != val && nums[i+1] != val) {
	      return false;
	    }
	  }
	  
	  return true;
	}

	/**
	 * https://codingbat.com/prob/p191878
	 * Given an array of ints, return true if the array 
	 * contains a 2 next to a 2 or a 4 next to a 4, 
	 * but not both.
	 * @param nums
	 * @return
	 */
	public boolean either24(int[] nums) {
	  boolean two = false, four = false;
	  
	  for (int i = 0; i+1 < nums.length; i++) {
	    if (nums[i] == 2 && nums[i+1] == 2) {
	      two = true;
	    } else if(nums[i] == 4 && nums[i+1] == 4) {
	      four = true;
	    }
	  }
	  
	  return two ^ four;
	}

}
