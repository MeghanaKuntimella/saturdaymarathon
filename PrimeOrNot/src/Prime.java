import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number to find it is a prime or not ");
		int n=scan.nextInt();
		for(int i=2;i<n;i++)
		{
			if(n%i!=0)
			{
				System.out.println("It is a prime number");
				return;
			}
			else
			{
				System.out.println("It is not a prime number");
			}
		}
	}
}
