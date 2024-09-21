package com.scalar.introProbSolve;

public class AddBinaryString {
	public static void main(String args[]) {
		AddBinaryString test = new AddBinaryString();
		System.out.println(test.addBinary("1", "1"));
	}
	
	public String addBinary(String a, String b) {
        int bSixze = b.length();
        int maxLength = 0;
        
        if(a.length() > b.length()) {
        	b = appendZero(a.length()-b.length(), b);
        	maxLength = a.length();
        }
        if(b.length() > a.length()) {
        	a = appendZero(b.length()-a.length(), a);
        	maxLength = b.length();
        }
        if(b.length() == a.length()) {
        	maxLength = b.length();
        }
        String result = "";
        int  carry = 0;
        for (int i =maxLength-1; i >= 0 ;i--) {
        	int sum  = ( (a.charAt(i) - '0') + (b.charAt(i) - '0') + carry ) % 2;
        	carry = ( (a.charAt(i) - '0') + (b.charAt(i) - '0') + carry ) / 2;
        	if(sum == 0) {
        		result = '0' + result  ;
        	}
        	if (sum ==1) {
        		result = '1' + result  ;
        	}
        	
        }
        if (carry == 1) {
        	result =  '1' + result ;
        }
        
        return result;
    }

    private static String appendZero(int noOfZero, String str) {
		String zeroStr = "";
		for(int i =0 ; i< noOfZero ; i++) {
			zeroStr = zeroStr + "0";
		}
		return zeroStr + str;
	}
}
/*
 * Problem Description
Given two binary strings A and B. Return their sum (also a binary string).
1000011011000000111100110
0001010110111001101101000

--1001011111111001111101110
/-1001110001111010101001110


Problem Constraints
1 <= length of A <= 105

1 <= length of B <= 105

A and B are binary strings



Input Format
The two argument A and B are binary strings.



Output Format
Return a binary string denoting the sum of A and B



Example Input
Input 1:
A = "100"
B = "11"
Input 2:
A = "110"
B = "10"


Example Output
Output 1:
"111"
Output 2:
"1000"


Example Explanation
For Input 1:
The sum of 100 and 11 is 111.
For Input 2:
 
The sum of 110 and 10 is 1000.


 */
