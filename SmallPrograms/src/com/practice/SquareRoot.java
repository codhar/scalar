package com.practice;

public class SquareRoot {

	public static void main(String[] args) {
		System.out.println(Double.toString(findSquareRoot(Double.valueOf("35"))));
	}
	
	private static Double findSquareRoot(Double n) {
		System.out.println(n);
		int count = 0;
		Double l =Double.valueOf("1");
		Double r = n;
		Double mid = Double.valueOf("0");
		while(l < r && l != r) {
			mid = Math.floor((l+r)/2);
//			System.out.println((6+9)/2);
			count++;
			if( mid*mid == n ) {
				return mid;
			}
			if(mid*mid < n) {
				l = mid+1;
			}
			if(mid*mid > n) {
				r= mid -1;
			}
		}
		System.out.println(count);
		return mid;
	}

}
