import java.util.Scanner;

public class ConditionalStatements
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a number");

		int a = in.nextInt();

		int b;

		if(a%2==0)
		{
			b=1;
		}
		else
		{
			b =0;
		}

		switch(b)
		{
			case 0: System.out.println("Odd");
			break;
			case 1: System.out.println("False");
			break;
		}
		
	}
}

