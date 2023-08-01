import java.util.Scanner;

public class CharacterIdentifier {
	public static void identifyCharacter(char ch)

	{
		if(Character.isDigit(ch))
		{
			System.out.println(ch+" is a digit");
		}
		
		else if(Character.isUpperCase(ch))
		{
			System.out.println(ch+" is a UpperCase letter");
		}
		else if(Character.isLowerCase(ch))
		{
			System.out.println(ch+" is a LowerCase letter");
		}
		else
		{
			System.out.println(ch+" is a Special letter");
		}

	}

	public static void main(String[] args)

	{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a character");
	char ch=scan.next().charAt(0);
	identifyCharacter(ch);
	scan.close();

	}
}
