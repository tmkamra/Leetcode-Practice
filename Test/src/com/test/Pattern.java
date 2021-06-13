package com.test;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pattern p = new Pattern();
		p.printPattern(5);
	}

	private void printPattern(int n) {
		int ctr = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n - 1; j++) {
				System.out.print(" ");
			}
//			for(int k=0; k<i+ctr; k++)
//			{
//				System.out.print("*");
//			}
			for (int k = i; k > 0; k--) {
				System.out.print(k);
			}
			for (int k = 2; k <= i; k++) {
				System.out.print(k);
			}

			for (int j = i; j <= n - 1; j++) {
				System.out.print(" ");
			}
			System.out.println();
			ctr = ctr + 1;
		}
	}
}
