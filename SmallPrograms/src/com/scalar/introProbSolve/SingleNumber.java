package com.scalar.introProbSolve;

import java.util.ArrayList;
import java.util.List;

public class SingleNumber {
	
	public static void main(String args[]) {
		
		int i = 10;
		int x = 10;
		int j = 13;
		int Y = 12;
		int Z= 12;
		int l = 11;
//		int k = 0 ^ x ^ i ^ j ^ Y ^ Z ^ l ^ 19 ^19;
		int k = 1 ^ 2 ^ 3 ^ 1 ^ 2 ^ 4;
		int re = k ^ 3;
		int pe = re ^ k;
		/*
		 * System.out.println(re + " reverse "+ pe); System.out.println(" XOR shift " +
		 * k);
		 */
		ArrayList<Integer> testList = new ArrayList<Integer>();
		testList.add(1);
		testList.add(2);
		testList.add(3);
		testList.add(1);
		testList.add(2);
		testList.add(4);
		SingleNumber tst = new SingleNumber();
		tst.singleNumber(testList);
	}
	
	public int singleNumber(final List<Integer> A) {
        Integer result1 = 0;
        Integer result2 = 0;
        Integer result = 0;
        for(Integer i : A){
            result =  result ^ i;
        }
        /*0111
        0011-3
        0100-4*/
        
        int xyz  = 1 << 1 ;
        boolean isSet = (4 & xyz) > 0;
        
        System.out.println("XYZ " +xyz + " is set "+isSet);
        
        for (Integer i : A) {
        	Integer re = result ^ i;
        	Integer pe = re ^ result;
        	if( (re + pe) == result) {
//        		A.contains(result)
        		System.out.println( " two numbers are firs = "+ re + " second numeber = "+ pe + " integer "+i +" result "+result);
        	}
        }
        return result;
    }

}

/*
 * Problem Description Given an array of integers A, every element appears twice
 * except for one. Find that integer that occurs once.
 * 
 * NOTE: Your algorithm should have a linear runtime complexity. Could you
 * implement it without using extra memory?
 * 
 * 
 * 
 * Problem Constraints 1 <= |A| <= 2000000
 * 
 * 0 <= A[i] <= INTMAX
 * 
 * 
 * 
 * Input Format The first and only argument of input contains an integer array
 * A.
 * 
 * 
 * 
 * Output Format Return a single integer denoting the single element.
 * 
 * 
 * 
 * Example Input Input 1:
 * 
 * A = [1, 2, 2, 3, 1] Input 2:
 * 
 * A = [1, 2, 2]
 * 
 * 
 * Example Output Output 1:
 * 
 * 3 Output 2:
 * 
 * 1
 * 
 * 
 * Example Explanation Explanation 1:
 * 
 * 3 occurs once. Explanation 2:
 * 
 * 1 occurs once.
 * 
 */