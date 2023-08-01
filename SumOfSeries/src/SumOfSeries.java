import java.util.Scanner;

public class SumOfSeries {
	public static void calculateSumOfSeries(int n)

	{
	double sum=0.0;
	for(double i=1;i<=n;i++) {
		sum=sum+(1/i);
		
	}
	System.out.println("Sum of the series is "+sum);

	}

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=scan.nextInt();
	calculateSumOfSeries(n);
	scan.close();
	}

	}

