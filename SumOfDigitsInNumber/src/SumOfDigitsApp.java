import java.util.Scanner;

public class SumOfDigitsApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number to find the digits sum of the number");
		int n=scan.nextInt();
		SumOfDigits sumOfDigits=new SumOfDigits();
		int res=sumOfDigits.digitsSum(n);
		System.out.println("Sum of digits in the number "+n+" is "+res);
		scan.close();
	}
}
