import java.util.Scanner;
public class Aor{
	public static void main(String[] args) {
		float area,s;
		System.out.println("enter the radius");
		
		Scanner r=new Scanner(System.in);
		s=r.nextFloat();

		area=(float)(3.14*s*s);
		System.out.println("the Area is "+area);


	}
}