package com.kodnest.patterns.assignment;

public class Pattern21 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=i*2-1;j++) {
			if(j%2==0) {
				System.out.print("*");
			}
			else {
				System.out.print(j);
			}
		}
		System.out.println();
	}
}
}
