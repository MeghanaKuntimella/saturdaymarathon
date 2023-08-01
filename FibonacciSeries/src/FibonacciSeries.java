import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the n value to print the series ");
		int n=scan.nextInt();
		Fibonacci.seriesResult(n);
		scan.close();
	}
}
