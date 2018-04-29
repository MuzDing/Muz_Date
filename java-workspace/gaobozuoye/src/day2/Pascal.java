package day2;

import java.util.Arrays;

public class Pascal {
	public static void main(String[] args) {
		getPascal();
	}
	public static void getPascal() {
		int lines = 10;
		int[] a = new int[lines];
		int upper = 1;
		for (int i = 0; i < lines; i++) {
			for (int j = 0; j < i; j++) {
				int now = a[j];
				a[j] = upper + 	now;
				upper = now;
				System.out.print(a[j] + " ");
			}
			System.out.println();
		}
	}
}