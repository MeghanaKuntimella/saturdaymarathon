package com.kodnest.patterns.level4;

public class Pattern11 {
	public static void main(String[] args) {
		for(int r=1;r<=3;r++) {
			for(int k=1;k<=3;k++) {
				if(r==2 && k==2) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
