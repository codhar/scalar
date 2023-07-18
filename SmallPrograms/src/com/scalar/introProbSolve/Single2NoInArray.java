package com.scalar.introProbSolve;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Single2NoInArray {
	public ArrayList<Integer> solve(ArrayList<Integer> A) {
        Integer result = xorArray(A);
        
        ArrayList<Integer> zeroInt = new ArrayList<Integer>();
        ArrayList<Integer> oneInt = new ArrayList<Integer>();
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        int k =0 ;
        for(int i =0 ; i<8 ; i++) {
        	if((result & (1 << i)) != 0){
            	k=i;
            }
        }
        for(Integer i : A) {
        	if((i & (1 << k)) != 0) {
        		zeroInt.add(i);
        	}else {
        		oneInt.add(i);
        	}
        }  
        
        resultList.add(xorArray(zeroInt));
        resultList.add(xorArray(oneInt));
        Collections.sort(resultList);
               
        return resultList;
    }
    private static Integer xorArray(List<Integer> a) {
		Integer result = 0;
        for(Integer i : a){
            result =  result ^ i;
        }
        return result;
	}
}
/*
 * Problem Description
Given an array of positive integers A, two integers appear only once, and all the other integers appear twice.
Find the two integers that appear only once.

Note: Return the two numbers in ascending order.


Problem Constraints
2 <= |A| <= 100000
1 <= A[i] <= 109



Input Format
The first argument is an array of integers of size N.



Output Format
Return an array of two integers that appear only once.



Example Input
Input 1:
A = [1, 2, 3, 1, 2, 4]
Input 2:

A = [1, 2]


Example Output
Output 1:
[3, 4]
Output 2:

[1, 2]


Example Explanation
Explanation 1:
3 and 4 appear only once.
Explanation 2:

1 and 2 appear only once.


 */