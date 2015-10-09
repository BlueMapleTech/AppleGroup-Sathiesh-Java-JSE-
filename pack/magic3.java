package com.pack;

import java.util.*;

public class magic3

{
	public static void main(String args[]) throws Exception {
		int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } };
		int i = 0, j = 0, h = 0;
		;
		System.out.println("the aligned cards are...");
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		int m;
		Scanner s = new Scanner(System.in);
		System.out.println("the row value is:");
		m = s.nextInt();

		int b[][] = { { 1, 2, 5, 4 }, { 3, 11, 6, 15 }, { 9, 10, 7, 12 },
				{ 13, 14, 8, 16 } };
		int k, l;
		System.out.println("the realigned cards are...");
		for (k = 0; k < 4; k++) {
			for (l = 0; l < 4; l++)
				System.out.print(b[k][l] + " ");
			System.out.println();
		}
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("the row value is:");
		n = sc.nextInt();

		int coun = 0;
		int p, q;
		for (p = 0; p < 4; p++) {
			for (q = 0; q < 4; q++) {
				if (a[m][p] == b[n][q]) {
					coun++;
					h = h + a[m][p];
				}
			}
		}
		if (coun == 1) {
			System.out.println("the value is:" + h);
		} else {
			if (coun == 2) {
				System.out.println("bad magician");
			} else {
				if (coun == 0) {
					System.out.println("customer cheated");
				}
			}
		}
	}
}
