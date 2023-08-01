import java.util.Scanner;

public class Polygon {
	public static void identifyPolygon(int side)

	{

	if(side == 3)
	{
		System.out.println("It is a Traiangle");
	}
	else if(side == 4)
	{
		System.out.println("It is a Quadrileteral");
	}
	else if(side == 5)
	{
		System.out.println("It is a Pentagon");
	}
	else if(side == 6)
	{
		System.out.println("It is a Hexagon");
	}
	else
	{
		System.out.println("It is a Polygon");
	}

	}

	public static void main(String[] args)

	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the sides ");
		int side=scan.nextInt();
		identifyPolygon(side);
		scan.close();
	}
}


