import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The Length Of the Array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the Contents of Array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Display the Array Contents");
		//Traditional for loop
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
