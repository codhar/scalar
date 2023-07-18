package com.scalar.introProbSolve;

public class SmallestXOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * SmallestXOR zXor = new SmallestXOR(); System.out.println("Final answer" +
		 * zXor.solve(15, 2));
		 */
		int test = 15;
		test &= ~(1 << 1);
		System.out.println(test);
	}

	public int solve(int A, int B) {
		int ans = 0;
		boolean result = true;
		while (result) {
			for (int i = 0; i < Integer.MAX_VALUE; i++) {
				int aXorI = A ^ i;
				System.out.println(noOfSetBits(aXorI) + "value of i = " + i);
				if (noOfSetBits(aXorI) == B) {
					result = false;
					ans = aXorI;
					break;
				}
				System.out.println("ANS ---" + ans);
			}
		}
		return ans;
	}

	private int noOfSetBits(int num) {
		int count = 0;
		while (num > 0) {
			num &= (num - 1);
			count++;
		}
		return count;
	}

	public int solveA(int A, int B) {
		int noSetBits = 0;
		for (int i = 31; i >= 0; i--) {
			if ((A & (1 << i)) != 0) {
				noSetBits++;
			}
		}
		if (noSetBits == B) {
			return A;
		} else if (noSetBits > B) {
			// unset least significant bits (LSBs) of A
			for (int i = 0; i <= 31 && noSetBits != B; i++) {
				if ((A & (1 << i)) != 0) {
					A &= ~(1 << i);
					noSetBits--;
				}

			}
		} else if (noSetBits < B) {
			// set least significant bits of(LSB) A
			for (int i = 0; i <= 31 && noSetBits != B; i++) {
				if ((A & (1 << i)) == 0) {
					A |= 1 << i;
					B--;
				}

			}
		}
		return A;
	}

}
