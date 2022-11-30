package com.practice;

public class FactorsOfNumber {
	public static void main(String args[]) {
		FactorsOfNumber f1= new FactorsOfNumber();
				f1.printFactorsofNumber(2);
	}
	public void printFactorsofNumber(int n) {
		for(int i = 1; i <= Math.sqrt(n); i++) {
			if(n%i ==0) {
				System.out.println(i);
			}
		}
	}

}
