package top;

public class Array3 {

	
	/**
	 * https://codingbat.com/prob/p158767
	 * Given a non-empty array, return true if there is a place to split the array 
	 * so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
	 * @param nums
	 * @return
	 */
	public boolean canBalance(int[] nums) {
		  
	  int leftSum = 0, rightSum = 0;
	  
	  // Iterate through array
	  for (int i = 0; i < nums.length; i++) {
	    
	    // Add up left side
	    for (int j = 0; j < i+1; j++)
	      leftSum += nums[j];
	      
	    // Ad up right side
	    for (int j = i+1; j < nums.length; j++)
	      rightSum += nums[j];
	      
	    // If equal
	    if (leftSum == rightSum)
	      return true;
	      
	    leftSum = 0;
	    rightSum = 0;
	  }
	  
	  return false;
	}
	
	/**
	 * https://codingbat.com/prob/p134022
	 * Given two arrays of ints sorted in increasing order, outer and inner, 
	 * return true if all of the numbers in inner appear in outer. The best 
	 * solution makes only a single "linear" pass of both arrays, taking advantage 
	 * of the fact that both arrays are already in sorted order.
	 * @param outer
	 * @param inner
	 * @return
	 */
	public boolean linearIn(int[] outer, int[] inner) {
		  
	  int seqIndex = 0;
	  
	  // If statement for the specific case when 'inner' has no elements
	  if (inner.length != 0) {
	    
	    // Iterate through 'outer' array
	    for (int i = 0; i < outer.length; i++) {
	      
	      // If the values match up
	      if (outer[i] == inner[seqIndex]) {
	        seqIndex++;
	      }
	      
	      // The end of the 'inner' array has been reached
	      if (seqIndex == inner.length) {
	        return true;
	      }
	    }
	    
	  // When 'inner' has no elements
	  } else {
	    return true;
	  }
	  
	  return false;
	  
	}
	
	/**
	 * https://codingbat.com/prob/p155405
	 * Given n>=0, create an array length n*n with the following pattern, 
	 * shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} 
	 * (spaces added to show the 3 groups).
	 * @param n
	 * @return
	 */
	public int[] squareUp(int n) {
		  
	  // Create newly sized array
	  int [] array = new int[n*n];
	  
	  // Populate new array
	  for (int i = 0; i < n*n; i++) {
	    
	      // For every index that is a multiple of 'n',
	      // set to 1
	      if ((i+1)%n == 0) {
	        array[i] = 1;
	        
	      // Populate the rest of the non-zero numbers accordingly.
	      } else if (((int) (i/n)) >= (n - ((i+1)%n))) {
	        array[i] = n - ((i+1)%n) + 1;
	        
	      // Place zeros
	      } else {
	        array[i] = 0;
	      }
	  }
	  
	  return array;
	}
	
	/**
	 * https://codingbat.com/prob/p104090
	 * Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} 
	 * (spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n, 
	 * which is known to sum to exactly n*(n + 1)/2.
	 * @param n
	 * @return
	 */
	public int[] seriesUp(int n) {
	  int[] array = new int[n*(n+1)/2];
	  int temp = 1;
	  int j = 1;
	  
	  for (int i = 0; i < n*(n+1)/2; i++) {
	    
	    array[i] = j;
	    
	    // Increment value
	    if (j < temp) {
	      j++;
	    // Restart incrementing value sequence
	    // once sequence has ended
	    } else {
	      j = 1;
	      temp++;
	    }
	  }
	  
	  return array;
	}
	
	/**
	 * https://codingbat.com/prob/p193817
	 * Say that a "clump" in an array is a series of 2 or more 
	 * adjacent elements of the same value. Return the number of 
	 * clumps in the given array.
	 * @param nums
	 * @return
	 */
	public int countClumps(int[] nums) {
		  
	  int count = 0;
	  int prev = 0;
	  boolean insideClump = false;
	  
	  // Iterate through array
	  for (int i = 0; i < nums.length; i++) {
	    // If current number is the same as the previous number
	    // and we are not at the beginning of the array
	    // and we are not currently inside a clump of numbers
	    if (nums[i] == prev && i != 0 && !insideClump) {
	      insideClump = true;
	      count++;
	      
	    // The clump series of numbers has ended
	    } else if(nums[i] != prev) {
	      insideClump = false;
	    }
	    
	    // set previous value for next go-around
	    prev = nums[i];
	  }
	  
	  return count;
	}
	
	/**
	 * https://codingbat.com/prob/p159339
	 * Return an array that contains exactly the same numbers as the given array, 
	 * but rearranged so that every 3 is immediately followed by a 4. Do not move the 3's, 
	 * but every other number may move. The array contains the same number of 3's and 4's, 
	 * every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.
	 * @param nums
	 * @return
	 */
	public int[] fix34(int[] nums) {
		
	  int[] threes = new int[100];
	  int index3 = 0;
	  int[] fours = new int[100];
	  int index4 = 0;
	  
	  // Iterate through to find all '3' and '4' integers
	  for (int i=0; i<nums.length; i++) {
	    
	    // Add index number of '3' occurrence to array
	    if (nums[i] == 3) {
	      threes[index3++] = i;
	      
	    // Add index number of '4' occurrence to array
	    } else if (nums[i] == 4) {
	      fours[index4++] = i;
	    }
	    
	  }
	  
	  // For loop to swap '4' occurrences
	  for (int i = 0; i < index3; i++) {
	    
	    int temp = nums[threes[i] + 1];
	    nums[threes[i] + 1] = nums[fours[i]];
	    nums[fours[i]] = temp;
	  }
	  
	  return nums;
	}
	
	/**
	 * https://codingbat.com/prob/p189576
	 * Consider the leftmost and righmost appearances of some value in an array. 
	 * We'll say that the "span" is the number of elements between the two inclusive.
	 * A single value has a span of 1. Returns the largest span found in the given array. 
	 * (Efficiency is not a priority.)
	 * @param nums
	 * @return
	 */
	public int maxSpan(int[] nums) {
		  
	  int tempMax = 0;
	  
	  // Cycle through based on the starting span point
	  for (int beg = 0; beg < nums.length; beg++) {
	    
	    // Cycle through based on the ending span point
	    for (int end = beg; end < nums.length; end++) {
	      
	      // If span has been found
	      if (nums[beg] == nums[end]) {
	        
	        // If span is greater than previously found span
	        if (tempMax < (end-beg+1)) {
	          tempMax = (end-beg+1);
	        }
	      }
	    }
	    
	  }
	  
	  return tempMax;
	}
	
	public static void main(String[] args) {
		
	}
	
}
