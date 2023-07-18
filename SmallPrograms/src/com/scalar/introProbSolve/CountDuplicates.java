package com.scalar.introProbSolve;

import java.util.ArrayList;
import java.util.List;

public class CountDuplicates {
	
	public static void main(String args[]) {
		CountDuplicates test = new CountDuplicates();
		List<Integer> A = new ArrayList<Integer>();
//		[156629687,156629687,950873097,-816928664,633452756,156629687,-816928664,950873097,950873097]
		A.add(156629687);
		A.add(156629687);
		A.add(950873097);
		A.add(-816928664);
		A.add(633452756);
		A.add(156629687);
		A.add(-816928664);
		A.add(950873097);
		A.add(950873097);
		System.out.println(test.solve(A));
		
	}
	
	 public int solve(final List<Integer> A) {
	        int duplicate = 0;
	        ArrayList<Integer> checked = new ArrayList<Integer>();
	        for(int i=0 ;i < A.size(); i++){
	            if(checked.isEmpty() || !checked.contains(A.get(i))){
	                checked.add(A.get(i));
	                System.out.println("checked I value "+ A.get(i));
	                for(int j=0; j< A.size() ; j++){
//	                	System.out.println("value of J "+ A.get(j));
//	                	System.out.println(A.get(i) ==  A.get(j));
	                if ((i != j) && (A.get(i).equals(A.get(j)))){ 
//	                	System.out.println("added duplicate");
	                    duplicate ++;
	                }
	            }
	            }
	            
	        }
	        return duplicate;
	    }
}
