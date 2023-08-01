import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number ");
		int a=scan.nextInt();
		int factorial=1;
		for(int i=1;i<=a;i++)
		{
			factorial *=i;
		
		}
		System.out.println("Factorial of natral numbers is "+factorial);
scan.close();
	}
}
