class Final_method
{
	final int a;
	final void dis()
	{
		a=10;
	}
	public static void main(String ar[])
	{
		Final_method f1= new Final_method();
		
		f1.dis();
		System.out.println(f1.a);	

	}
}