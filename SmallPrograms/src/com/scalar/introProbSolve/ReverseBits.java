package com.scalar.introProbSolve;

public class ReverseBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseBits rb = new ReverseBits();
		System.out.println(rb.reverse(4));

		/*
		 * long x = 15; System.out.println(x | (x << 32 - 1));
		 */

	}

	public long reverse(long a) {
		int longbitNumber = 32;

		long N = a;
		long ans = 0l;
		while (N > 0) {
			long x = N % 2;
			System.out.println("N value "+N+" X value " + x + " longbitNumber" + longbitNumber);
			ans = (ans | (x << longbitNumber - 1));
			System.out.println(ans);
			longbitNumber--;
			N = N / 2;
		}
		return ans;
	}
}
