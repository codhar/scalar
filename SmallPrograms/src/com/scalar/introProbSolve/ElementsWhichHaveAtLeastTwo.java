package com.scalar.introProbSolve;

import java.util.ArrayList;

public class ElementsWhichHaveAtLeastTwo {
	 public ArrayList<Integer> solve(ArrayList<Integer> A) {
	        ArrayList<Integer> result = new ArrayList<Integer>();
	        
	        for(Integer no : A){
	            if(checkCondition(no, A)){
	                result.add(no);
	            }
	        }
	        return result;
	    }

	    private boolean checkCondition(Integer no, ArrayList<Integer> list){
	    int count = 0;
	        for(Integer listNo : list){
	            if(no != listNo && no<listNo){
	                count++;
	            }
	            if(count == 2){
	                return true;
	            }
	        }
	        return false;
	    }
}
