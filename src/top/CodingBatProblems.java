package top;

public class CodingBatProblems {

	
	
	
	/**
	 * https://codingbat.com/prob/p196409
	 * *Needs more work*
	 * @param nums
	 * @return
	 */
	public int maxMirror(int[] nums) {
		int i = 0, j = nums.length-1; 
		int tempMax = 0;
		
		while (i <= j) {
			if (nums[i] == nums[j]) {
				tempMax++;
			} else {
				break;
			}
			
			i++;
			j--;
		}
		
		// These lines need to change, I don't know how to 'increment array pointer' in Java
		// like you do in 'C programming'.
		int[] begNums = nums;
		int[] endNums = nums;
		
		int tempMaxA = maxMirror(begNums);
		int tempMaxB = maxMirror(endNums);
		
		int tempMaxC =  (tempMaxA > tempMaxB) ? tempMaxA : tempMaxB;
	    
		return (tempMax > tempMaxC) ? tempMax : tempMaxC; 
	}
	
	


	
	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3,4,5,6,3,2,1,2};
		CodingBatProblems p = new CodingBatProblems();
		System.out.println(p.maxMirror(nums));
	}
}
