import java.util.Scanner;
public class Voc{
	public static void main(String[] args) {
		float area,r,l,volume;
		System.out.println("enter the radius");
		
		Scanner s=new Scanner(System.in);
		r=s.nextFloat();
		System.out.println("enter the lenth of cylinder");
		Scanner length=new Scanner(System.in);
		l=length.nextFloat();

		area=(float)(3.14*r*r);
		volume=(float)(area*l);
		System.out.println("the Area is "+area);
		System.out.println("the volume is " +volume);



	}
}