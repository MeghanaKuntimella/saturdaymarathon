package com.kodnest.patterns.level5;

public class Pattern2 {
	public static void main(String[] args) {
		
		for(int r=1;r<=5;r++) {
			char ch = 'A';
			for(int k=1;k<=r;k++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
}
