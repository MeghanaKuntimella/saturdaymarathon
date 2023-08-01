import java.util.Scanner;

public class SumOfNaturalNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numbers ");
		int a=scan.nextInt();
		int sum=0;
		for(int i=1;i<=a;i++)
		{
			sum +=i;
		
		}
		System.out.println("Sum of natral numbers is "+sum);
		scan.close();
	}
	
}
