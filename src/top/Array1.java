package top;

public class Array1 {
	/**
	 * https://codingbat.com/prob/p191991
	 * Given 2 arrays of ints, a and b, return true if either the first elements
	 * are the same, or the last elements are the same.
	 * @param a
	 * @param b
	 * @return
	 */
	public boolean commonEnd(int[] a, int[] b) {
	   if (a[0] == b[0] || a[a.length-1] == b[b.length-1])
	      return true;
	   else
	      return false;
	}
	
	/**
	 * https://codingbat.com/prob/p118976
	 * Given an array of ints, return true if the array length is 1 or more,
	 * and the first and last ints are equal.
	 * @param nums
	 * @return
	 */
	public boolean sameFirstLast(int[] nums) {
	   if (nums.length >= 1) {
	      if (nums[0] == nums[nums.length-1]) {
	         return true;
	      } else {
	         return false;
	      }
	   } else {
	      return false;
	   }
	}
	
	/**
	 * https://codingbat.com/prob/p185685
	 * Given an array of ints, return true if either the first or
	 * last index is 6
	 * @param nums
	 * @return
	 */
	public boolean firstLast6(int[] nums) {
	  if (nums[0] == 6 || nums[nums.length-1] == 6)
	     return true;
	  else
	     return false;
	}
}
