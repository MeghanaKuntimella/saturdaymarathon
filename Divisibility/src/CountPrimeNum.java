import java.util.Scanner;

public class CountPrimeNum {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=scan.nextInt();
	for(int i=3;i<n;i++) {
		int res=checkprime(i);
		if(n%2!=0) {
		System.out.println();
		}
	}
}
public static
