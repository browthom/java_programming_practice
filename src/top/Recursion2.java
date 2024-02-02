package top;

public class Recursion2 {

	public boolean groupSum(int start, int[] nums, int target) {
		  
	  // if the end of the array has not been reached
	  if (start < nums.length) {
	    int newTarget = target - nums[start];
	      
      // See if the addition of 'nums[start]' works
      // If not, then backtrack
      if (groupSum(start+1, nums, newTarget)) {
        return true;
      } else {
        return groupSum(start+1, nums, target);
      }
	    
	  // conditional statement if target is 0 from the onset
	  } else if (target == 0){
	    return true;
	  } else {
	    return false;
	  }
	}
	
	public boolean groupSumClump(int start, int[] nums, int target) {
	   // if the end of the array has not been reached
	  if (start < nums.length) {
	    
	    int newTarget = target;
	    int i = start, prev = nums[start];
	    
	    // Determine the extent of the value range
	    for (i = start; i < nums.length; i++) {
	      if (prev == nums[i]) {
	        newTarget = newTarget - nums[i];
	      } else {
	        break;
	      }
	    }
	      
	    // See if the addition of 'nums[start]' works
	    // If not, then backtrack
	    if (groupSumClump(start+(i-start), nums, newTarget)) {
	      return true;
	    } else {
	      return groupSumClump(start+(i-start), nums, target);
	    }
	    
	  // conditional statement if target is 0 from the onset
	  } else if (target == 0){
	    return true;
	  } else {
	    return false;
	  }
	}

	
	
	public boolean splitOdd10(int[] nums) {
		  
		  return helper(0, nums, 0, 0);
		}

	private boolean helper(int start, int[] nums, int sum1, int sum2) {
	  
	  if (start < nums.length) {
	   
	    int newSum1 = nums[start] + sum1;
	    int newSum2 = nums[start] + sum2;
	    
	    if (helper(start+1, nums, newSum1, sum2)) {
	      return true;
	    } else {
	      return helper(start+1, nums, sum1, newSum2);
	    }
	    
	  } else if ((sum1 % 10 == 0 && sum2 % 2 == 1) ||
	             (sum1 % 2 == 1 && sum2 % 10 == 0)) {
	    return true;
	  } else {
	    return false;
	  }
	}
	
	public boolean groupSum6(int start, int[] nums, int target) {
		  
	  if (start < nums.length) {
	    int newTarget = target - nums[start];
	    
	    if (groupSum6(start+1, nums, newTarget)) {
	      return true;
	    } else if (nums[start] != 6) {
	      return groupSum6(start+1, nums, target);
	    } else {
	      return false;
	    }
	    
	  } else if (target == 0) {
	    return true;
	  } else {
	    return false;
	  }
	}

	public boolean groupNoAdj(int start, int[] nums, int target) {
		  
	  if (start < nums.length) {
	    
	    int newTarget = target - nums[start];
	    
	    // Just change the increment to 2 in order to
	    // skip next value in array
	    if (groupNoAdj(start+2, nums, newTarget)) {
	      return true;
	    } else {
	      return groupNoAdj(start+1, nums, target);
	    }
	    
	  } else if (target == 0) {
	    return true;
	  } else {
	    return false;
	  }
	}

	public boolean splitArray(int[] nums) {
	  return helperSplitArray(0, nums, 0, 0);
	}

	private boolean helperSplitArray(int start, int[] nums, int sum1, int sum2) {
	  
	  if (start < nums.length) {
		    
	    int newSum1 = sum1 - nums[start];
	    int newSum2 = sum2 - nums[start];
	    
	    if (helperSplitArray(start+1, nums, newSum1, sum2)) {
	      return true;
	    } else {
	      return helperSplitArray(start+1, nums, sum1, newSum2);
	    }
	    
	  } else if (sum1 == sum2) {
	    return true;
	  } else {
	    return false;
	  }
	}
	
	public boolean groupSum5(int start, int[] nums, int target) {
	  if (start < nums.length) {
		    
	    int newTarget = target - nums[start];
	    boolean isFive = false, isOne = false;
	    
	    if (nums[start] % 5 == 0) {
	      isFive = true;
	    }
	    
	    if (start+1 < nums.length) {
	      if (nums[start+1] == 1) {
	        isOne = true;
	      }
	    }
	    
	    // if 5 is proceeded by 1, skip '1' value
	    if (isFive && isOne) {
	      return groupSum5(start+2, nums, newTarget);
	      
	    // if 5 is not proceeded by 1,
	    // the 5 value must be used
	    } else if (isFive && !isOne) {
	      return (groupSum5(start+1, nums, newTarget));
	      
	    // All other conditions not involving a 5
	    } else {
	      if (groupSum5(start+1, nums, newTarget)) {
	        return true;
	      } else  {
	        return groupSum5(start+1, nums, target);
	      }
	    }
	    
	    // Just change the increment to 2 in order to
	    // skip next value in array
	    
	    
	  } else if (target == 0) {
	    return true;
	  } else {
	    return false;
	  }
	}

	public boolean split53(int[] nums) {
		  return helperSplit53(0, nums, 0, 0);
		}

	private boolean helperSplit53(int start, int[] nums, int sum1, int sum2) {
	  
	  if (start < nums.length) {
	   
	    int newSum1 = nums[start] + sum1;
	    int newSum2 = nums[start] + sum2;
	    
	    // if 'nums[start]' is multiple of 5,
	    // then it must be placed in 1st sum
	    if (nums[start] % 5 == 0) {
	      return helperSplit53(start+1, nums, newSum1, sum2);
	      
	    // if 'nums[start]' is multiple of 3 (and not 5),
	    // then it must be placed in 2nd sum
	    } else if (nums[start] % 3 == 0 && nums[start] % 5 != 0) {
	      return helperSplit53(start+1, nums, sum1, newSum2);
	    
	    // for all other numbers, execute recursion as normal
	    } else {
	      if (helperSplit53(start+1, nums, newSum1, sum2)) {
	        return true;
	      } else {
	        return helperSplit53(start+1, nums, sum1, newSum2);
	      }
	    }
	    
	  } else if (sum1 == sum2) {
	    return true;
	  } else {
	    return false;
	  }
	}



}
