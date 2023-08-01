import java.util.Scanner;

public class VendingMachine {
	public static void getProduct(String productCode)

	{

	switch(productCode){
		case "p01" :System.out.println("Coca cola");
		break;
		case "p02" :System.out.println("Bindu");
		break;
		case "p03" :System.out.println("Mazaa");
		break;
		case "p04" :System.out.println("Thums up");
		break;
		default :System.out.println("Fruit mix");
			break;
	}
	
	}

	
	public static void main(String[] args)

	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Product Code");
		String productCode=scan.nextLine();
		getProduct(productCode);
		scan.close();
		

	}
}
