import java.util.Scanner;
public class sumofdigits{
	public static void main(String[] args) {
		int n,sum=0,i;
		System.out.println("enter the number");
		Scanner digit=new Scanner(System.in);
		n=digit.nextInt();
		while(n!=0)
		{
		i=n%10;
		n=n/10;
		sum = sum+i;
	    }
	    System.out.println("the sum is "+sum);
	}
}