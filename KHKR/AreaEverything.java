import java.util.Scanner;

public class AreaEverything
{

	public static void main(String args[])
	{
		//Gets the input from the user
		Scanner scan = new Scanner(System.in);
		Area triangle = new Area(10,20);
		triangle.getArea();


	}
}

class Area
{
	int b ,h;
	Area(int base,int height)
	{
		b = base; 
		h = height;
	}
	void getArea()
	{
		System.out.println("Area is: "+(float)(b*h/2));
	}
}