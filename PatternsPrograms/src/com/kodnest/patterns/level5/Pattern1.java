package com.kodnest.patterns.level5;

public class Pattern1 {
	public static void main(String[] args) {
		char ch = 'A';
		for(int r=1;r<=5;r++) {
			for(int k=1;k<=r;k++) {
				System.out.print(ch);
			}
			System.out.println();
			ch++;
		}
	}
}
