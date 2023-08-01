import java.util.Scanner;

public class ReverseNumApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numter to get reverse num");
		int n=scan.nextInt();
		ReverseNum reverseNum=new ReverseNum();
		int rev=reverseNum.numReverse(n);
		System.out.println("Reverse of the number "+n+" is "+rev);
		if(rev==n)
		{
			System.out.println("Entered number "+n+" is a palindrom");
		}
		else {
			System.out.println("Entered number "+n+" is not a palindrom");
		}
		scan.close();
	}
}
