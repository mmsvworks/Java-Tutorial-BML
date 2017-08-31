import java.util.Scanner;

public class Input
{
	public static void main(String a[])
	{
		Scanner in = new Scanner(System.in);
		int base, height;
		float area;

		System.out.println("Enter base and height");

		base = in.nextInt();
		height = in.nextInt();

		area = (float)(base*height)/2;

		System.out.println("The area is "+area);

	}
}