package top;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author Thomas Brown
 *
 */
public class InterviewBit {
	
	public static void main(String[] args) {
		int[] a = new int[] {1,1,4};
		int[] b = new int[] {2,2,2};
		int[] c = new int[] {1,2,2,2,3};

		InterviewBit inst = new InterviewBit();
		//System.out.println(inst.getMinStartingGasStation(a, b));
		System.out.println(inst.getMajorityElement(c));
	}
	
	/**
	 * 
	 */
	public InterviewBit() {
		
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int getMinStartingGasStation(int[] a, int[] b) {
		
		int total_gas = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			int j = i;
			// Initial Fill up
			total_gas = a[i];
			
			// Continue down that path as long as
			// there is enough gas
			while (total_gas >= b[j]) {
				// Burn gas as we are traveling to j+1
				total_gas -= b[j];
				
				// Increment to j+1 to reflect reaching 
				// gas station at j+1
				if (j < a.length-1) {
					j++;
				} else {
					j = 0;
				}
				
				// Fill up gas tank at new station
				total_gas += b[j];
				
				// If we have reached the starting point,
				// then return index of starting point
				if (i == j)
					return j;
			}
		}
		
		return -1;
	}
	
	/**
	 * 
	 * @param array
	 * @return
	 */
	public int getMajorityElement(int[] array) {
		// Create List of Integers
		List<Integer> arrayList = new ArrayList<Integer>();
		// Populate List with elements from 'array'
		for (int i : array) {
			arrayList.add(i);
		}
		// Sort the List
		Collections.sort(arrayList);
		
		// Setup variables for for-loop
		int prev = arrayList.get(0);
		int count = 1;
		
		// for-loop
		for (int i = 1; i < arrayList.size(); i++) {
			
			// Count successive identical integer elements
			if (prev == arrayList.get(i)) {
				count += 1;
			// Reset count when sequence of identical integer elements ends
			} else {
				count = 1;
			}
			
			// If majority element found
			if (count > arrayList.size()/2) {
				return arrayList.get(i);
			}
			
			prev = arrayList.get(i);
		}
		
		// No majority element exists
		return -1;
	}
}
