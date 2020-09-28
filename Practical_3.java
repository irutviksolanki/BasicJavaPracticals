import java.util.Scanner;
class Practical_3
{
	public static void main(String arg[])
	{
		int a,b,c;
		Scanner obj = new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();
		c=obj.nextInt();
		if(a<b)
		{
			if(b<c)
			{
				System.out.println("C is MAX");
			}
			else
			{
					System.out.println("B is MAX");
			}
		}
		else
		{
			if(a<c)
			{
				System.out.println("C is MAX");
			}
			else
			{
					System.out.println("A is MAX");
			}
		}
	}
}