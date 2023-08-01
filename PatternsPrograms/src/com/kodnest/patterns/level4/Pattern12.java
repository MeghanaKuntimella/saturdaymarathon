package com.kodnest.patterns.level4;

public class Pattern12 {
public static void main(String[] args) {
	for(int r=1;r<=5;r++) {
		for(int k=1;k<=5;k++) {
			if(r==1 || r==5 || k==1 || k==5) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
