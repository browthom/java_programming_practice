package top;

public class Logic2 {
	
	/**
	 * https://codingbat.com/prob/p183562
	 * We want to make a row of bricks that is goal inches long. 
	 * We have a number of small bricks (1 inch each) and big 
	 * bricks (5 inches each). Return true if it is possible
	 * to make the goal by choosing from the given bricks. 
	 * This is a little harder than it looks and can be done 
	 * without any loops. See also: Introduction to MakeBricks
	 * @param small
	 * @param big
	 * @param goal
	 * @return
	 */
	public boolean makeBricks(int small, int big, int goal) {
	  int total = small + big*5;
	  
	  if (total >= goal) {
	    
	    // Possible number of big bricks that can go towards
	    // the total goal
	    int addBig = goal / 5;
	    
	    // if there are enough big bricks available, then
	    // add as many big bricks as you can to goal
	    if (big >= addBig) {
	      goal -= addBig*5;
	    // else, add all of the available big bricks to goal
	    } else {
	      goal -= big*5;
	    }
	    
	    // If there are enough small bricks available, then
	    // the goal can be met
	    if (small >= goal) {
	      return true;  
	    } else {
	      return false;
	    }
	    
	  // Not enough total length from bricks to meet goal
	  } else {
	    return false;
	  }
	}
	
	/**
	 * https://codingbat.com/prob/p148972
	 * Given 3 int values, a b c, return their sum. 
	 * However, if one of the values is the same as 
	 * another of the values, it does not count 
	 * towards the sum.
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public int loneSum(int a, int b, int c) {
	  return ((!(a == b || a == c) ? a : 0) +
	          (!(b == a || b == c) ? b : 0) +
	          (!(c == a || c == b) ? c : 0));
	}

	/**
	 * https://codingbat.com/prob/p130788
	 * Given 3 int values, a b c, return their sum. 
	 * However, if one of the values is 13 then it does 
	 * not count towards the sum and values to its right 
	 * do not count. So for example, if b is 13, then 
	 * both b and c do not count.
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public int luckySum(int a, int b, int c) {
	  return ((a != 13) ? a : 0) +
	         ((a != 13 && b != 13) ? b : 0) +
	         ((a != 13 && b != 13 && c != 13) ? c : 0);
	}
	
	/**
	 * https://codingbat.com/prob/p182879
	 * Given 3 int values, a b c, return their sum. 
	 * However, if any of the values is a teen -- 
	 * in the range 13..19 inclusive -- then that 
	 * value counts as 0, except 15 and 16 do not 
	 * count as a teens. Write a separate helper 
	 * "public int fixTeen(int n) {"that takes in an 
	 * int value and returns that value fixed for the 
	 * teen rule. In this way, you avoid repeating the 
	 * teen code 3 times (i.e. "decomposition"). 
	 * Define the helper below and at the same indent 
	 * level as the main noTeenSum().
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public int noTeenSum(int a, int b, int c) {
	  return fixTeen(a) + fixTeen(b) + fixTeen(c);
	}

	private int fixTeen(int n) {
	  if (n >= 13 && n <= 19 && n != 15 && n != 16) {
	    return 0;
	  } else {
	    return n;
	  }
	}
	
	/**
	 * https://codingbat.com/prob/p186753
	 * For this problem, we'll round an int value up to the 
	 * next multiple of 10 if its rightmost digit is 5 or 
	 * more, so 15 rounds up to 20. Alternately, round down 
	 * to the previous multiple of 10 if its rightmost digit 
	 * is less than 5, so 12 rounds down to 10. Given 3 ints, 
	 * a b c, return the sum of their rounded values. 
	 * To avoid code repetition, write a separate helper 
	 * "public int round10(int num) {" and call it 3 times. 
	 * Write the helper entirely below and at the same 
	 * indent level as roundSum().
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public int roundSum(int a, int b, int c) {
	  return round10(a) + round10(b) + round10(c);
	}

	private int round10(int num) {
	  if (num % 10 >= 5) {
	    return (num/10 + 1)*10;
	  } else {
	    return (num/10)*10;
	  }
	}

	/**
	 * https://codingbat.com/prob/p138990
	 * Given three ints, a b c, return true if one of b or 
	 * c is "close" (differing from a by at most 1), while 
	 * the other is "far", differing from both other values 
	 * by 2 or more. Note: Math.abs(num) computes the 
	 * absolute value of a number.
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public boolean closeFar(int a, int b, int c) {
	  boolean bClose = Math.abs(b-a) <= 1 ? true : false;
	  boolean cClose = Math.abs(c-a) <= 1 ? true : false;
	  
	  boolean bFar = Math.abs(b-a) >= 2 && Math.abs(b-c) >= 2 ? true : false;
	  boolean cFar = Math.abs(c-a) >= 2 && Math.abs(c-b) >= 2 ? true : false;
	  
	  return (bClose && cFar) || (cClose && bFar);
	}
	
	/**
	 * https://codingbat.com/prob/p117019
	 * Given 2 int values greater than 0, return whichever 
	 * value is nearest to 21 without going over. Return 0 
	 * if they both go over.
	 * @param a
	 * @param b
	 * @return
	 */
	public int blackjack(int a, int b) {
	  if (a <= 21 && b <= 21) {
	    return (21-a < 21-b) ? a : b;
	  } else if (a <= 21 && b > 21) {
	    return a;
	  } else if (a > 21 && b <= 21) {
	    return b;
	  } else {
	    return 0;
	  }
	}

	/**
	 * https://codingbat.com/prob/p198700
	 * Given three ints, a b c, one of them is small, one 
	 * is medium and one is large. Return true if the three 
	 * values are evenly spaced, so the difference between 
	 * small and medium is the same as the difference between 
	 * medium and large.
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public boolean evenlySpaced(int a, int b, int c) {
	  return (Math.abs(a-b) == Math.abs(b-c) && a != c) ||
	         (Math.abs(a-c) == Math.abs(c-b) && a != b) ||
	         (Math.abs(b-a) == Math.abs(a-c) && b != c) ||
	         (a == b && b == c);
	}
	
	/**
	 * https://codingbat.com/prob/p191363
	 * We want make a package of goal kilos of chocolate. 
	 * We have small bars (1 kilo each) and big bars 
	 * (5 kilos each). Return the number of small bars to use,
	 * assuming we always use big bars before small bars. 
	 * Return -1 if it can't be done.
	 * @param small
	 * @param big
	 * @param goal
	 * @return
	 */
	public int makeChocolate(int small, int big, int goal) {
	  int total = small + big*5;
	  
	  if (total >= goal) {
	    int addBig = goal / 5;
	    
	    if (big >= addBig) {
	      goal -= addBig*5;
	    } else {
	      goal -= big*5;
	    }
	    
	    if (small >= goal) {
	      return goal;
	    } else {
	      return -1;
	    }
	  } else {
	    return -1;
	  }
	  
	}
}
