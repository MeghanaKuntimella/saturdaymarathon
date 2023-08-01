import java.util.Scanner;

public class MultipleOfTen {
	
		public static void checkMultipleOfTen(int n,int m) {
			if(n%m==0)
			{
				System.out.println(n+" is an multiple of "+m);
			}
			else
			{
				System.out.println(n+" is not a multiple of "+m);
			}
		}
		 
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter two numbers");
			int n=scan.nextInt();
			
			int m=scan.nextInt();
			checkMultipleOfTen(n,m); 
			scan.close();
			} 
}

