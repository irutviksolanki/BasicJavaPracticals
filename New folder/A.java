import java.util.*;
class DemoA
{
	public static void main(String a[])
	{
		Scanner s=new Scanner(System.in);
		int c[]=new int[10];
		int b,i;	
		System.out.println("Enter Value");
		b=s.nextInt();
		for(i=0;i<b;i++)
		{
			System.out.println("\nEnter Value");

			c[i]=s.nextInt();

			System.out.println("\nYour Value is "+c[i]);
		}
	}
}