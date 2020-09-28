import java.util.*;
class Second_max
{
	public static void main(String args[])
	{
		Long  a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 3 numbers");
		a=sc.nextLong();
		b=sc.nextLong();
		c=sc.nextLong();

		if(a<b && a>c)
		{
			System.out.println("A is Second Max");
		}
		else if(a>b && a<c)
		{
			System.out.println("A is Second Max");
		}
		else if(b>c && b<a)
		{
			System.out.println("B is Second Max");
		}
		else if(b<c && b>a)
		{
			System.out.println("B is Second Max");
		}
		else
		{
			System.out.println("C is Second Max");
		}
				
		
	}
}
