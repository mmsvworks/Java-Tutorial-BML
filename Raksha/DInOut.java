import java.io.*;
public class DInOut
{
	public static void main(String args[])throws IOException
	{
		int a,b,c;
		DataInputStream d=new DataInputStream(System.in);
		a=Integer.parseInt(d.readLine());
		b=Integer.parseInt(d.readLine());
		c=a+b;
		System.out.println("The sum= "+c);
	}
}