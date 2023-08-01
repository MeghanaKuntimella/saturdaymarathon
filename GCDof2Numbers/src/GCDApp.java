import java.util.Scanner;

public class GCDApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 numbers to find GCD");
		int m=scan.nextInt();
		int n=scan.nextInt();
	
		int rem=findGCD(m,n);
		System.out.println("GCD of "+m+" and "+n+" is "+rem);
		scan.close();
	}
	public static int findGCD(int m,int n){
		while(n!=0) {
			int rem=m%n;
			m=n;
			n=rem;
		}
		return m;
	}
}
