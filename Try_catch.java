class Try_catch
{
	public static void main(String ar[])
	{

		System.out.println("Hello");
		try
		{
		int a=10/2;

		int b[] =new int[5];
		b[10]=10;

		}
		catch(ArithmeticException b)
		{
			System.out.println("Arithmetic Exception...!");

		}
		catch(ArrayIndexOutOfBoundsException c)
		{
			System.out.println("ArrayIndexOutOfBounds Exception....!");
		}

	}

}