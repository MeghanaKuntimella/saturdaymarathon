import java.util.Scanner;

public class Discount {
	public static void checkDiscount(double purchaseAmount)
	{
		if(purchaseAmount>100)
		{
			System.out.println("Discount available");
		}
		else
		{
			System.out.println("Discount not applicable");
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the purchase amount ");
		double purchaseAmount=scan.nextDouble();
		checkDiscount(purchaseAmount);
		scan.close();
	}

}
