class Nestedtry
{
	public static void main(String ar[])
	{
		int d=new java.util.Scanner(System.in).nextInt();
		
		try
		{
		int a=10/d;
			try
			{
				int c[]=new int[5];
				c[a]=10;
			}
			catch(Exception e)
			{
				System.out.println("Exeception.....!");
			}

		}
		catch(ArithmeticException b)
		{
			System.out.println("Arithmetic Exception....!");	
		}

	}
}