import java.util.Scanner;

public class ArmstrongNumApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number to check it is a Armstrong num or not");
		int n=scan.nextInt();
		int original=n;
		int count=0;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		ArmstrongNum armstrongNum=new ArmstrongNum();
		int res=armstrongNum.armstrongChecker(original,count);
		if(res==original)
		{
			System.out.println("Entered number "+original+" is Armstrong");
		}
		else
		{
			System.out.println("Entered number "+original+" is not Armstrong");
		}
	}
}
