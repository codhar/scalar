package com.practice;

public class PrimeNumber {

	public static void main(String args[]) {
		System.out.println(isPrime(12));
	}
	
	private static boolean isPrime(int number) {
		if(number == 1)
			return false;
		for(int i=2; i <= Math.sqrt(Double.valueOf(number+"")); i++) {
			if(number % i ==0) {
				return false;
			}
		}
		return true;
	}
}
